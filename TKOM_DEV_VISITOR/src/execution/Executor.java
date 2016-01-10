package execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageParser.Function_defContext;
import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;

public class Executor {
	private List <ListElement> globalLists;
	private List <NumberElement> globalNumbers;
	private HashMap <String,FunctionDefinition> functions;
	private Queue <ParserRuleContext> operations;
	
	
	public Executor()
	{
		globalLists = new ArrayList<>();
		globalNumbers = new ArrayList<>();
		operations = new LinkedList<>();
		functions = new HashMap<>();
	}
	
	
	public void addOperation(ParserRuleContext ctx)
	{
		try{
			
			operations.add(ctx);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addList(TerminalNode terminalNode , List<TerminalNode> list,int level)
	{
		globalLists.add(new ListElement(terminalNode.toString(),(ArrayList)list,level));
	}
	
	
	public void addFunctionDef(Function_defContext ctx)
	{
		functions.put(ctx.ID().get(0).toString(),new FunctionDefinition(ctx));
	}
	
	public void addNumericalVar(TerminalNode id , TerminalNode number,int level)
	{
		globalNumbers.add(new NumberElement(id.toString(),Integer.parseInt(number.toString()),level));
	}
	
	public boolean elementExists(String id, int level)
	{
		return globalLists.stream().anyMatch((v)->v.getId().equals(id) && v.getLevel()== level) ||
				globalNumbers.stream().anyMatch((v)->v.getId().equals(id) && v.getLevel()== level);
	}

}
