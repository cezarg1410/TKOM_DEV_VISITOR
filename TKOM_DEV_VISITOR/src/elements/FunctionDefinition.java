package elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import antlr_classes.ListLanguageParser;
import antlr_classes.ListLanguageParser.Function_defContext;

public class FunctionDefinition {
	
	String id;
	ArrayList<Operation> operations;
	Function_defContext definition;
	HashMap <String,NumberElement> localNumbers;
	HashMap <String,ListElement> localLists;

	public FunctionDefinition(Function_defContext definition)
	{
		this.definition = definition;
		localNumbers = new HashMap<>();
		localLists = new HashMap<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(ArrayList<Operation> operations) {
		this.operations = operations;
	}

	public Function_defContext getDefinition() {
		return definition;
	}

	public void setDefinition(Function_defContext definition) {
		this.definition = definition;
	}

	public HashMap<String, NumberElement> getLocalNumbers() {
		return localNumbers;
	}

	public void setLocalNumbers(HashMap<String, NumberElement> localNumbers) {
		this.localNumbers = localNumbers;
	}

	public HashMap<String, ListElement> getLocalLists() {
		return localLists;
	}

	public void setLocalLists(HashMap<String, ListElement> localLists) {
		this.localLists = localLists;
	}
	
}
