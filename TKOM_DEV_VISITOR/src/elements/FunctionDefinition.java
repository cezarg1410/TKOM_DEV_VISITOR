package elements;

import java.util.ArrayList;

import antlr_classes.ListLanguageParser;

public class FunctionDefinition {
	
	String id;
	ArrayList<Operation> operations;
	ListLanguageParser.Function_defContext definition;
	
	public FunctionDefinition(ListLanguageParser.Function_defContext definition)
	{
		this.definition = definition;
	}
	
}
