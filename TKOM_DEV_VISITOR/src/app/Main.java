package app;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr_classes.ListLanguageLexer;
import antlr_classes.ListLanguageParser;
import execution.Executor;
import execution.Logging;
import execution.MyListener;
import execution.MyVisitor;

public class Main {

	public static void main(String[] args) {
		try {
			Logging.setup();
			ANTLRFileStream input = new ANTLRFileStream("txt/sample.txt", "UTF-8");
			ListLanguageLexer lexer = new ListLanguageLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			ParseTree tree = parser.compilation_unit();
			Executor exec = new Executor();
			Integer answer = new MyVisitor(parser,exec).visit(tree);
			System.out.print(answer.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
