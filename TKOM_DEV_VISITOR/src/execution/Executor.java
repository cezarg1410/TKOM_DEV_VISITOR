package execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageParser.Function_callContext;
import antlr_classes.ListLanguageParser.Function_defContext;
import antlr_classes.ListLanguageParser.List_var_decContext;
import antlr_classes.ListLanguageParser.Numerical_var_decContext;
import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import elements.ParserRuleContextNode;

public class Executor {
	public HashMap <String,ListElement> globalLists;
	private HashMap <String,NumberElement> globalNumbers;
	private HashMap <String,FunctionDefinition> functions;
	private Queue <ParserRuleContextNode> operations;
	private FunctionDefinition currentFunction;
	
	
	public FunctionDefinition getCurrentFunction() {
		return currentFunction;
	}


	public void setCurrentFunction(FunctionDefinition currentFunction) {
		this.currentFunction = currentFunction;
	}


	public Executor()
	{
		globalLists = new HashMap<>();
		globalNumbers = new HashMap<>();
		operations = new LinkedList<>();
		functions = new HashMap<>();
	}
	
	
	public void addOperation(ParserRuleContext ctx)
	{
		try{
			
			operations.add(new ParserRuleContextNode(ctx,true));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addList(TerminalNode terminalNode , List<TerminalNode> list,int level)
	{
		globalLists.put(terminalNode.toString(), new ListElement((ArrayList)list));
		//globalLists.add(new ListElement(terminalNode.toString(),(ArrayList)list,level));
	}
	
	
	public void addFunctionDefContext(Function_defContext ctx)
	{
		functions.put(ctx.ID().toString(),new FunctionDefinition(ctx));
	}
	
	public void addNumericalVar(TerminalNode id , TerminalNode number,int level)
	{
		globalNumbers.put(id.toString(), new NumberElement(Integer.parseInt(number.toString())));
		//globalNumbers.add(new NumberElement(id.toString(),Integer.parseInt(number.toString()),level));
	}
	
	public boolean elementExists(String id, int level)
	{
		return true;
//		return globalLists.stream().anyMatch((v)->v.getId().equals(id) && v.getLevel()== level) ||
//				globalNumbers.stream().anyMatch((v)->v.getId().equals(id) && v.getLevel()== level);
	}
	
	public Integer getListElement(TerminalNode id, TerminalNode number)
	{
		return globalLists.get(id.toString()).getContent().get(Integer.parseInt(number.toString()));
	}
	
	public void runProgram()
	{
		while(! operations.isEmpty())
		{
			ParserRuleContextNode ctx = operations.poll();
			if(ctx.getCtx() instanceof List_var_decContext)
			{
				addList(ctx);
			}
			else if (ctx.getCtx() instanceof Numerical_var_decContext)
			{
			{
				addNumber(ctx);
				
			}
			
			}
			else if(ctx.getCtx() instanceof Function_callContext)
			{
				callFunction(ctx);
			}
		}
	}
	
	private void callFunction(ParserRuleContextNode ctx) {
		
		Function_callContext f = (Function_callContext) ctx.getCtx();
		//if(f.id
		if(f.ID().toString().equals("append"))
		{
			if(f.function_call_args().children.size() != 2)
				throw new ExecutionException("Nieprawidłowa ilość agumentów funkcji \"append\". LINIA: "+ctx.start.getLine()+System.lineSeparator());
			
		}
		
	}


	private void addNumber(ParserRuleContextNode ctx) {
//		globalNumbers.put(id.toString(), new NumberElement(Integer.parseInt(number.toString())));
		Numerical_var_decContext l = (Numerical_var_decContext) ctx.getCtx();
		if(currentFunction == null)
		{
			if(globalLists.containsKey(l.ID().toString()))
				throw new RuntimeException("Zdublowana deklaracja listy. LINIA:"+ctx.start.getLine()+System.lineSeparator());
			globalNumbers.put(l.ID().toString(), new NumberElement(Integer.parseInt(l.NUMBER().toString())));
		}
		else
		{
			if(currentFunction.getLocalNumbers().containsKey(l.ID().toString()))
				throw new RuntimeException("Zdublowana deklaracja listy. LINIA:"+ctx.start.getLine()+System.lineSeparator());
			currentFunction.getLocalNumbers().put(l.ID().toString(), new NumberElement(Integer.parseInt(l.NUMBER().toString())));
		}
		
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addList(ParserRuleContextNode ctx) {
		
		List_var_decContext l = (List_var_decContext) ctx.getCtx();
		if(currentFunction == null)
		{
			if(globalLists.containsKey(l.ID().toString()))
				throw new RuntimeException("Zdublowana deklaracja listy. LINIA:"+ctx.start.getLine()+System.lineSeparator());
			globalLists.put(l.ID().toString(), new ListElement((ArrayList)l.list().NUMBER()));
		}
		else
		{
			if(currentFunction.getLocalLists().containsKey(l.ID().toString()))
				throw new RuntimeException("Zdublowana deklaracja listy. LINIA:"+ctx.start.getLine()+System.lineSeparator());
			currentFunction.getLocalLists().put(l.ID().toString(), new ListElement((ArrayList)l.list().NUMBER()));
		}
	}


	public void evalOperation(ParserRuleContextNode ctx)
	{
		
	}
	
	public void evalFunctionCall(Function_defContext ctx)
	{
		currentFunction = new FunctionDefinition(ctx);
		
		
		
		currentFunction = null;
	}

}
