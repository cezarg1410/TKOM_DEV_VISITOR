package execution;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageBaseVisitor;
import antlr_classes.ListLanguageParser;
import antlr_classes.ListLanguageParser.Compilation_unitContext;
import antlr_classes.ListLanguageParser.ConditionContext;
import antlr_classes.ListLanguageParser.Elementary_conditionContext;
import antlr_classes.ListLanguageParser.Function_callContext;
import antlr_classes.ListLanguageParser.Function_defContext;
import antlr_classes.ListLanguageParser.Help_ifContext;
import antlr_classes.ListLanguageParser.If_statementContext;
import antlr_classes.ListLanguageParser.ListContext;
import antlr_classes.ListLanguageParser.List_elementContext;
import antlr_classes.ListLanguageParser.List_var_decContext;
import antlr_classes.ListLanguageParser.LoopContext;
import antlr_classes.ListLanguageParser.Numerical_var_decContext;
import antlr_classes.ListLanguageParser.OperationContext;
import antlr_classes.ListLanguageParser.ValueContext;
import antlr_classes.ListLanguageParser.WriteContext;

public class EvalVisitor extends ListLanguageBaseVisitor<Integer> {

	public ListLanguageParser parser;
	public Executor exec;
	public int level = 0;
	
	public EvalVisitor(ListLanguageParser parser, Executor exec)
	{
		this.exec = exec;
		this.parser = parser;
		
	}
	
	@Override
	public Integer visitHelp_if(Help_ifContext ctx) {
		// TODO Auto-generated method stub
		return super.visitHelp_if(ctx);
	}

	@Override
	public Integer visitCompilation_unit(Compilation_unitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompilation_unit(ctx);
	}

	@Override
	public Integer visitOperation(OperationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperation(ctx);
	}

	@Override
	public Integer visitNumerical_var_dec(Numerical_var_decContext ctx) {
		exec.addOperation(ctx);
//		if(exec.elementExists(ctx.ID().toString(),level))
//			throw new RuntimeException("Element już istnieje");
//		exec.addNumericalVar(ctx.ID(), ctx.NUMBER(), level);
		return super.visitNumerical_var_dec(ctx);
	}

	@Override
	public Integer visitList_var_dec(List_var_decContext ctx) {
//		if(exec.elementExists(ctx.ID().toString(),level))
//			throw new RuntimeException("Element już istnieje");
//		exec.addList(ctx.ID(), ctx.list().NUMBER(), level);
//		Logging.logAll("Utworzono listę ",ctx);
		exec.addOperation(ctx);
		return super.visitList_var_dec(ctx);
	}

	@Override
	public Integer visitList(ListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitList(ctx);
	}

	@Override
	public Integer visitList_element(List_elementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitList_element(ctx);
	}

	@Override
	public Integer visitValue(ValueContext ctx) {
		// TODO Auto-generated method stub5
		return super.visitValue(ctx);
	}

	@Override
	public Integer visitIf_statement(If_statementContext ctx) {

		//switch(ctx.condition().elementary_condition().l)
		
//		for(Elementary_conditionContext cond : ctx.condition().elementary_condition())
//		{
//			evalElementaryCondistion(cond);
//		}
		exec.addOperation(ctx);
		return super.visitIf_statement(ctx);
	}

	@Override
	public Integer visitCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition(ctx);
	}

	@Override
	public Integer visitElementary_condition(Elementary_conditionContext ctx) {
		// TODO Auto-generated method stub
		//evalElementaryCondition(ctx);
		return super.visitElementary_condition(ctx);
	}

	@Override
	public Integer visitFunction_def(Function_defContext ctx) {
		exec.addFunctionDefContext(ctx);
		return super.visitFunction_def(ctx);
	}

	@Override
	public Integer visitFunction_call(Function_callContext ctx) {
		exec.addOperation(ctx);
		return super.visitFunction_call(ctx);
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {
		exec.addOperation(ctx);
		return super.visitLoop(ctx);
	}

	@Override
	public Integer visitWrite(WriteContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWrite(ctx);
	}

	@Override
	protected Integer aggregateResult(Integer aggregate, Integer nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected Integer defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, Integer currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public Integer visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public Integer visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public Integer visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public Integer visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	private Integer evalVariable(ParseTree pt)
	{
//		if(pt instanceof ValueContext)
//		{
//			ValueContext vc = (ValueContext) pt;
//			if(vc.NUMBER() != null)
//			{
//				return Integer.parseInt(vc.NUMBER().toString());
//			}
//			if(exec.getCurrentFunction() == null)
//			{
//				exec.getListElement(vc.list_element().ID(), vc.list_element().NUMBER());
//			}
//			else 
//			{
//				
//			}
//		}
//		
		
		
		
		return 0;
	}
	
	
	private boolean evalElementaryCondition(Elementary_conditionContext cond) {
	
		Integer first = evalVariable(cond.getChild(0));
		Integer second = evalVariable(cond.getChild(0));

		if(cond.getChild(0) instanceof ValueContext)
		{
			int a = 2;
		}
		
		switch(cond.LOGICAL_OPERATOR().getText())
		{
			case "===":
			{
				break;
			}
			case "==":
			{
				
				System.out.println("==");
				break;
			}
			case "!=":
			{
				break;
			}
			case ">":
			{
				break;
			}
			case "<":
			{
				break;
			}
			case "<=":
			{
				break;
			}
			case ">=":
			{
				break;
			}
	}
	
	return true;
}
	
	
}
