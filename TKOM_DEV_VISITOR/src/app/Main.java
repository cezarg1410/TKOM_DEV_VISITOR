package app;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import antlr_classes.ListLanguageLexer;
import antlr_classes.ListLanguageParser;
import execution.Executor;
import execution.Logging;
import execution.EvalVisitor;

public class Main {

	public static final String SOURCE_PATH = "args/sample.txt";
	public static final String ENCODING = "UTF-8";
	
	public static void main(String[] args) {
		try {
			Logging.setup();
			ANTLRFileStream input = new ANTLRFileStream(SOURCE_PATH, ENCODING);
			ListLanguageLexer lexer = new ListLanguageLexer(input);		
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			ParseTree tree = parser.compilation_unit();
			Executor exec = new Executor();
			
			new EvalVisitor(parser,exec).visit(tree);
			int a =2;
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
