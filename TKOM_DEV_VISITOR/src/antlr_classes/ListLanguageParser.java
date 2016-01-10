// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package antlr_classes;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ListLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, THEN=3, ELSE=4, VAR=5, FOREACH=6, IN=7, AT=8, PRINT=9, NUMERICAL_VAR_OP=10, 
		BOOLEAN=11, LIST_VAR_OP=12, ID=13, NUMBER=14, ACTION_OPERATOR=15, LOGICAL_OPERATOR=16, 
		ASSIGN=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, COMA=22, SEMI=23, 
		LBRACK=24, RBRACK=25, AND_OPERATOR=26, OR_OPERATOR=27, WS=28;
	public static final int
		RULE_help_if = 0, RULE_compilation_unit = 1, RULE_operation = 2, RULE_numerical_var_dec = 3, 
		RULE_list_var_dec = 4, RULE_list = 5, RULE_list_element = 6, RULE_value = 7, 
		RULE_if_statement = 8, RULE_condition = 9, RULE_elementary_condition = 10, 
		RULE_function_def = 11, RULE_function_call = 12, RULE_function_def_args = 13, 
		RULE_function_call_args = 14, RULE_loop = 15, RULE_write = 16;
	public static final String[] ruleNames = {
		"help_if", "compilation_unit", "operation", "numerical_var_dec", "list_var_dec", 
		"list", "list_element", "value", "if_statement", "condition", "elementary_condition", 
		"function_def", "function_call", "function_def_args", "function_call_args", 
		"loop", "write"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<EOF>'", "'if'", "'then'", "'else'", "'var'", "'foreach'", "'in'", 
		"'@'", "'print'", "'number'", null, "'list'", null, null, null, null, 
		"'='", "'('", "')'", "'{'", "'}'", "','", "';'", "'['", "']'", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IF", "THEN", "ELSE", "VAR", "FOREACH", "IN", "AT", "PRINT", 
		"NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", "ID", "NUMBER", "ACTION_OPERATOR", 
		"LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ListLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ListLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Help_ifContext extends ParserRuleContext {
		public Elementary_conditionContext elementary_condition() {
			return getRuleContext(Elementary_conditionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Help_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitHelp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Help_ifContext help_if() throws RecognitionException {
		Help_ifContext _localctx = new Help_ifContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_help_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			elementary_condition();
			setState(35);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(37);
				operation();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public Numerical_var_decContext numerical_var_dec() {
			return getRuleContext(Numerical_var_decContext.class,0);
		}
		public List_var_decContext list_var_dec() {
			return getRuleContext(List_var_decContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				numerical_var_dec();
				}
				break;
			case LIST_VAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				list_var_dec();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(47);
				function_call();
				setState(48);
				match(SEMI);
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				function_def();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				if_statement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numerical_var_decContext extends ParserRuleContext {
		public TerminalNode NUMERICAL_VAR_OP() { return getToken(ListLanguageParser.NUMERICAL_VAR_OP, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Numerical_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_var_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitNumerical_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_var_decContext numerical_var_dec() throws RecognitionException {
		Numerical_var_decContext _localctx = new Numerical_var_decContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(NUMERICAL_VAR_OP);
			setState(56);
			match(ID);
			setState(57);
			match(ASSIGN);
			setState(58);
			match(NUMBER);
			setState(59);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_var_decContext extends ParserRuleContext {
		public TerminalNode LIST_VAR_OP() { return getToken(ListLanguageParser.LIST_VAR_OP, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_var_decContext list_var_dec() throws RecognitionException {
		List_var_decContext _localctx = new List_var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LIST_VAR_OP);
			setState(62);
			match(ID);
			setState(63);
			match(ASSIGN);
			setState(64);
			list();
			setState(65);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ListLanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ListLanguageParser.NUMBER, i);
		}
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBRACE);
			setState(68);
			match(NUMBER);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(69);
				match(COMA);
				setState(70);
				match(NUMBER);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(ListLanguageParser.LBRACK, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public TerminalNode RBRACK() { return getToken(ListLanguageParser.RBRACK, 0); }
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(LBRACK);
			setState(80);
			match(NUMBER);
			setState(81);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				list_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ListLanguageParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ListLanguageParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ListLanguageParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ListLanguageParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ListLanguageParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ListLanguageParser.RBRACE, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ListLanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ListLanguageParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(ListLanguageParser.ELSE, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IF);
			setState(88);
			condition();
			setState(89);
			match(THEN);
			setState(90);
			match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				operation();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RBRACE);
			setState(98);
			match(SEMI);
			setState(99);
			match(ELSE);
			setState(100);
			match(LBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				operation();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(RBRACE);
			setState(108);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public List<Elementary_conditionContext> elementary_condition() {
			return getRuleContexts(Elementary_conditionContext.class);
		}
		public Elementary_conditionContext elementary_condition(int i) {
			return getRuleContext(Elementary_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<TerminalNode> AND_OPERATOR() { return getTokens(ListLanguageParser.AND_OPERATOR); }
		public TerminalNode AND_OPERATOR(int i) {
			return getToken(ListLanguageParser.AND_OPERATOR, i);
		}
		public List<TerminalNode> OR_OPERATOR() { return getTokens(ListLanguageParser.OR_OPERATOR); }
		public TerminalNode OR_OPERATOR(int i) {
			return getToken(ListLanguageParser.OR_OPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LPAREN);
			setState(111);
			elementary_condition();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(113);
				elementary_condition();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elementary_conditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public TerminalNode LOGICAL_OPERATOR() { return getToken(ListLanguageParser.LOGICAL_OPERATOR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public Elementary_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementary_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitElementary_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elementary_conditionContext elementary_condition() throws RecognitionException {
		Elementary_conditionContext _localctx = new Elementary_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementary_condition);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(121);
				match(ID);
				setState(122);
				match(LOGICAL_OPERATOR);
				setState(123);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124);
				match(ID);
				setState(125);
				match(LOGICAL_OPERATOR);
				setState(126);
				value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(127);
				value();
				setState(128);
				match(LOGICAL_OPERATOR);
				setState(129);
				match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(131);
				match(ID);
				setState(132);
				match(LOGICAL_OPERATOR);
				setState(133);
				list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(134);
				list();
				setState(135);
				match(LOGICAL_OPERATOR);
				setState(136);
				match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(138);
				match(ID);
				setState(139);
				match(LOGICAL_OPERATOR);
				setState(140);
				function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(141);
				function_call();
				setState(142);
				match(LOGICAL_OPERATOR);
				setState(143);
				match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(145);
				value();
				setState(146);
				match(LOGICAL_OPERATOR);
				setState(147);
				value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(149);
				value();
				setState(150);
				match(LOGICAL_OPERATOR);
				setState(151);
				function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(153);
				function_call();
				setState(154);
				match(LOGICAL_OPERATOR);
				setState(155);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(157);
				function_call();
				setState(158);
				match(LOGICAL_OPERATOR);
				setState(159);
				function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(161);
				value();
				setState(162);
				match(LOGICAL_OPERATOR);
				setState(163);
				list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(165);
				list();
				setState(166);
				match(LOGICAL_OPERATOR);
				setState(167);
				value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(169);
				function_call();
				setState(170);
				match(LOGICAL_OPERATOR);
				setState(171);
				list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(173);
				list();
				setState(174);
				match(LOGICAL_OPERATOR);
				setState(175);
				function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(177);
				list();
				setState(178);
				match(LOGICAL_OPERATOR);
				setState(179);
				list();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ListLanguageParser.AT, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public Function_def_argsContext function_def_args() {
			return getRuleContext(Function_def_argsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_def);
		int _la;
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(183);
				match(AT);
				setState(184);
				match(ID);
				setState(185);
				match(LPAREN);
				setState(186);
				function_def_args();
				setState(187);
				match(RPAREN);
				setState(188);
				match(LBRACE);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(189);
					operation();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(RBRACE);
				setState(196);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(198);
				match(AT);
				setState(199);
				match(ID);
				setState(200);
				match(LPAREN);
				setState(201);
				match(RPAREN);
				setState(202);
				match(LBRACE);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(203);
					operation();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(RBRACE);
				setState(210);
				match(SEMI);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public Function_call_argsContext function_call_args() {
			return getRuleContext(Function_call_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			setState(214);
			function_call_args();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_def_argsContext extends ParserRuleContext {
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public List<TerminalNode> NUMERICAL_VAR_OP() { return getTokens(ListLanguageParser.NUMERICAL_VAR_OP); }
		public TerminalNode NUMERICAL_VAR_OP(int i) {
			return getToken(ListLanguageParser.NUMERICAL_VAR_OP, i);
		}
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public List<TerminalNode> LIST_VAR_OP() { return getTokens(ListLanguageParser.LIST_VAR_OP); }
		public TerminalNode LIST_VAR_OP(int i) {
			return getToken(ListLanguageParser.LIST_VAR_OP, i);
		}
		public Function_def_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_def_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_def_argsContext function_def_args() throws RecognitionException {
		Function_def_argsContext _localctx = new Function_def_argsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_def_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				{
				{
				setState(216);
				match(NUMERICAL_VAR_OP);
				setState(217);
				match(ID);
				}
				}
				break;
			case LIST_VAR_OP:
				{
				{
				setState(218);
				match(LIST_VAR_OP);
				setState(219);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(222);
				match(COMA);
				setState(227);
				switch (_input.LA(1)) {
				case NUMERICAL_VAR_OP:
					{
					{
					setState(223);
					match(NUMERICAL_VAR_OP);
					setState(224);
					match(ID);
					}
					}
					break;
				case LIST_VAR_OP:
					{
					{
					setState(225);
					match(LIST_VAR_OP);
					setState(226);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public Function_call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_call_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argsContext function_call_args() throws RecognitionException {
		Function_call_argsContext _localctx = new Function_call_argsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call_args);
		int _la;
		try {
			setState(253);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(234);
				match(LPAREN);
				setState(237);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(235);
					value();
					}
					break;
				case 2:
					{
					setState(236);
					match(ID);
					}
					break;
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(239);
					match(COMA);
					setState(242);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(240);
						value();
						}
						break;
					case 2:
						{
						setState(241);
						match(ID);
						}
						break;
					}
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(RPAREN);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(250);
				match(ID);
				setState(251);
				match(LPAREN);
				setState(252);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ListLanguageParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode VAR() { return getToken(ListLanguageParser.VAR, 0); }
		public TerminalNode IN() { return getToken(ListLanguageParser.IN, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(FOREACH);
			setState(256);
			match(LPAREN);
			setState(257);
			match(VAR);
			setState(258);
			match(IN);
			setState(259);
			match(ID);
			setState(260);
			match(RPAREN);
			setState(261);
			match(LBRACE);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(262);
				operation();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(RBRACE);
			setState(269);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ListLanguageParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(PRINT);
			setState(272);
			match(LPAREN);
			setState(273);
			match(ID);
			setState(274);
			match(RPAREN);
			setState(275);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"u\n\13\f\13\16\13x\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\r"+
		"\3\r\5\r\u00d6\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00df\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\7\17\u00e8\n\17\f\17\16\17\u00eb"+
		"\13\17\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3\20\5\20\u00f5\n\20\7"+
		"\20\u00f7\n\20\f\20\16\20\u00fa\13\20\3\20\3\20\3\20\3\20\5\20\u0100\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010a\n\21\f\21\16\21"+
		"\u010d\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\34\35\u012b\2$\3\2"+
		"\2\2\4*\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n?\3\2\2\2\fE\3\2\2\2\16P\3\2"+
		"\2\2\20W\3\2\2\2\22Y\3\2\2\2\24p\3\2\2\2\26\u00b7\3\2\2\2\30\u00d5\3\2"+
		"\2\2\32\u00d7\3\2\2\2\34\u00de\3\2\2\2\36\u00ff\3\2\2\2 \u0101\3\2\2\2"+
		"\"\u0111\3\2\2\2$%\5\26\f\2%&\7\31\2\2&\3\3\2\2\2\')\5\6\4\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\3\2\2.\5\3\2"+
		"\2\2/8\5\b\5\2\608\5\n\6\2\61\62\5\32\16\2\62\63\7\31\2\2\638\3\2\2\2"+
		"\648\5\30\r\2\658\5\22\n\2\668\5 \21\2\67/\3\2\2\2\67\60\3\2\2\2\67\61"+
		"\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\7\f\2"+
		"\2:;\7\17\2\2;<\7\23\2\2<=\7\20\2\2=>\7\31\2\2>\t\3\2\2\2?@\7\16\2\2@"+
		"A\7\17\2\2AB\7\23\2\2BC\5\f\7\2CD\7\31\2\2D\13\3\2\2\2EF\7\26\2\2FK\7"+
		"\20\2\2GH\7\30\2\2HJ\7\20\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LN\3\2\2\2MK\3\2\2\2NO\7\27\2\2O\r\3\2\2\2PQ\7\17\2\2QR\7\32\2\2RS\7\20"+
		"\2\2ST\7\33\2\2T\17\3\2\2\2UX\7\20\2\2VX\5\16\b\2WU\3\2\2\2WV\3\2\2\2"+
		"X\21\3\2\2\2YZ\7\4\2\2Z[\5\24\13\2[\\\7\5\2\2\\`\7\26\2\2]_\5\6\4\2^]"+
		"\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\27\2\2"+
		"de\7\31\2\2ef\7\6\2\2fj\7\26\2\2gi\5\6\4\2hg\3\2\2\2il\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\27\2\2no\7\31\2\2o\23\3\2\2\2pq\7"+
		"\24\2\2qv\5\26\f\2rs\t\2\2\2su\5\26\f\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\25\2\2z\25\3\2\2\2{|\7\17\2\2|}\7\22"+
		"\2\2}\u00b8\7\17\2\2~\177\7\17\2\2\177\u0080\7\22\2\2\u0080\u00b8\5\20"+
		"\t\2\u0081\u0082\5\20\t\2\u0082\u0083\7\22\2\2\u0083\u0084\7\17\2\2\u0084"+
		"\u00b8\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7\22\2\2\u0087\u00b8\5"+
		"\f\7\2\u0088\u0089\5\f\7\2\u0089\u008a\7\22\2\2\u008a\u008b\7\17\2\2\u008b"+
		"\u00b8\3\2\2\2\u008c\u008d\7\17\2\2\u008d\u008e\7\22\2\2\u008e\u00b8\5"+
		"\32\16\2\u008f\u0090\5\32\16\2\u0090\u0091\7\22\2\2\u0091\u0092\7\17\2"+
		"\2\u0092\u00b8\3\2\2\2\u0093\u0094\5\20\t\2\u0094\u0095\7\22\2\2\u0095"+
		"\u0096\5\20\t\2\u0096\u00b8\3\2\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7"+
		"\22\2\2\u0099\u009a\5\32\16\2\u009a\u00b8\3\2\2\2\u009b\u009c\5\32\16"+
		"\2\u009c\u009d\7\22\2\2\u009d\u009e\5\20\t\2\u009e\u00b8\3\2\2\2\u009f"+
		"\u00a0\5\32\16\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00b8"+
		"\3\2\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\f\7\2"+
		"\u00a6\u00b8\3\2\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa"+
		"\5\20\t\2\u00aa\u00b8\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\22\2"+
		"\2\u00ad\u00ae\5\f\7\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1"+
		"\7\22\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\5\f\7"+
		"\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\f\7\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"{\3\2\2\2\u00b7~\3\2\2\2\u00b7\u0081\3\2\2\2\u00b7\u0085\3\2\2\2\u00b7"+
		"\u0088\3\2\2\2\u00b7\u008c\3\2\2\2\u00b7\u008f\3\2\2\2\u00b7\u0093\3\2"+
		"\2\2\u00b7\u0097\3\2\2\2\u00b7\u009b\3\2\2\2\u00b7\u009f\3\2\2\2\u00b7"+
		"\u00a3\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b3\3\2\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb"+
		"\7\17\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\7\25"+
		"\2\2\u00be\u00c2\7\26\2\2\u00bf\u00c1\5\6\4\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\31\2\2\u00c7"+
		"\u00d6\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\17\2\2\u00ca\u00cb\7"+
		"\24\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00d0\7\26\2\2\u00cd\u00cf\5\6\4\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\27\2\2"+
		"\u00d4\u00d6\7\31\2\2\u00d5\u00b9\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d6\31"+
		"\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5\36\20\2\u00d9\33\3\2\2\2\u00da"+
		"\u00db\7\f\2\2\u00db\u00df\7\17\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00df\7"+
		"\17\2\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e9\3\2\2\2\u00e0"+
		"\u00e5\7\30\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e6\7\17\2\2\u00e3\u00e4\7"+
		"\16\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\35\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef"+
		"\7\24\2\2\u00ed\u00f0\5\20\t\2\u00ee\u00f0\7\17\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00ef\u00ee\3\2\2\2\u00f0\u00f8\3\2\2\2\u00f1\u00f4\7\30\2\2\u00f2"+
		"\u00f5\5\20\t\2\u00f3\u00f5\7\17\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u0100\7\25\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\7\24\2\2\u00fe"+
		"\u0100\7\25\2\2\u00ff\u00ec\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\37\3\2\2"+
		"\2\u0101\u0102\7\b\2\2\u0102\u0103\7\24\2\2\u0103\u0104\7\7\2\2\u0104"+
		"\u0105\7\t\2\2\u0105\u0106\7\17\2\2\u0106\u0107\7\25\2\2\u0107\u010b\7"+
		"\26\2\2\u0108\u010a\5\6\4\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u010f\7\27\2\2\u010f\u0110\7\31\2\2\u0110!\3\2\2\2\u0111\u0112"+
		"\7\13\2\2\u0112\u0113\7\24\2\2\u0113\u0114\7\17\2\2\u0114\u0115\7\25\2"+
		"\2\u0115\u0116\7\31\2\2\u0116#\3\2\2\2\25*\67KW`jv\u00b7\u00c2\u00d0\u00d5"+
		"\u00de\u00e5\u00e9\u00ef\u00f4\u00f8\u00ff\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}