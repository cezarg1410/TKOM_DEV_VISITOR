package execution;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

import antlr_classes.ListLanguageParser;

public class ErrorLogging {

	private static Logger logger;
	private static ConsoleHandler consoleHandler;
	private static FileHandler fileHandler;
	static final String LOG_DIR = "./txt/";
	private static final String LOG_EXT = ".txt";
	private static final String ERROR_NAME = "ERROR"; 

	static 
	{
		logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.ALL);
		consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		try {
			String fn = createFileName();
			fileHandler = new FileHandler(ERROR_NAME + fn);
		
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		consoleHandler.setFormatter(new SimpleFormatter());
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
	
	}
	
	public static String createFileName()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date now = new Date();
		String strDate = sdf.format(now);
		return LOG_DIR + strDate + LOG_EXT;
	}
	public static void logAll(String msg,ListLanguageParser.List_var_decContext ctx)
	{
		logger.log(Level.ALL, msg + " LINIA: "+ctx.getStart().getLine() + System.lineSeparator());
	}
}

