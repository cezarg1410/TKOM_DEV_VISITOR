// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package antlr_classes;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ListLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ListLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#help_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp_if(ListLanguageParser.Help_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(ListLanguageParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ListLanguageParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#numerical_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical_var_dec(ListLanguageParser.Numerical_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#list_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_var_dec(ListLanguageParser.List_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ListLanguageParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(ListLanguageParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ListLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ListLanguageParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ListLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#elementary_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementary_condition(ListLanguageParser.Elementary_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(ListLanguageParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(ListLanguageParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#function_def_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def_args(ListLanguageParser.Function_def_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ListLanguageParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListLanguageParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(ListLanguageParser.WriteContext ctx);
}