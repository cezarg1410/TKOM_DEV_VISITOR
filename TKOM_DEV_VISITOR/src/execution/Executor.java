package execution;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;

public class Executor {
	public List <ListElement> globalLists;
	public List <NumberElement> globalNumbers;
	public List <FunctionDefinition> functions;
	
	
	public Executor()
	{
		globalLists = new ArrayList<>();
		globalNumbers = new ArrayList<>();
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addList(TerminalNode terminalNode , List<TerminalNode> list,int level)
	{
		globalLists.add(new ListElement(terminalNode.toString(),(ArrayList)list,level));
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
