/**
 * Define a grammar called Hello
 */
grammar ListLanguage;
 
@header {
    package antlr_classes;
}

IF					:	'if';
THEN				:   'then';
ELSE				:  	'else';
VAR					: 	'var';
FOREACH				: 	'foreach';

IN					:  	'in';
AT					:  	'@';
PRINT				:  	'print';
NUMERICAL_VAR_OP 	: 	'number';
BOOLEAN 			: 	'true' | 'false';

LIST_VAR_OP			: 	'list';

fragment 
	LETTER: [a-z|A-Z];
fragment
	DIGIT: [0-9];
ID				 	: 	LETTER+;
NUMBER 			 	: 	DIGIT+;
ACTION_OPERATOR  	: 	'+' | '*' | '-';
LOGICAL_OPERATOR 	: 	'==' | '!-' | '>' | '>=' | '<' | '<=';
ASSIGN			 	: 	'=';
LPAREN           	: 	'(';
RPAREN           	: 	')';
LBRACE           	: 	'{';
RBRACE           	: 	'}';
COMA             	: 	',';
SEMI             	: 	';';
LBRACK           	: 	'[';
RBRACK           	:  	']';
AND_OPERATOR		:  	'&&';
OR_OPERATOR			:  	'||';

WS					: 	[ \t\n\r]+ ->skip;


help_if				: elementary_condition SEMI;
compilation_unit 	: operation*  '<EOF>';
operation			: numerical_var_dec | list_var_dec | (function_call SEMI) | function_def | if_statement | loop;
numerical_var_dec 	: NUMERICAL_VAR_OP  ID  ASSIGN  NUMBER  SEMI;
list_var_dec 		: LIST_VAR_OP  ID  ASSIGN  list  SEMI;
list 				: LBRACE NUMBER (COMA NUMBER)* RBRACE;
list_element 		: ID  LBRACK  NUMBER  RBRACK ;

value 				: NUMBER | list_element;
if_statement 		:  IF condition  THEN  LBRACE  (operation)*  RBRACE SEMI		
						ELSE  LBRACE  (operation)*  RBRACE SEMI;
condition 			: LPAREN elementary_condition  ((AND_OPERATOR | OR_OPERATOR)  elementary_condition )* RPAREN;

//elementary_condition : (value  LOGICAL_OPERATOR  value) 
//					| (function_call  LOGICAL_OPERATOR  value) 
//					| (value  LOGICAL_OPERATOR  function_call)
//					| (ID LOGICAL_OPERATOR value)
//					| (value LOGICAL_OPERATOR ID);
elementary_condition : 
					(ID LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR value)
					| (value LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR function_call)
					| (function_call LOGICAL_OPERATOR ID)
					| (value LOGICAL_OPERATOR value)
					| (value LOGICAL_OPERATOR function_call)
					| (function_call LOGICAL_OPERATOR value)
					| (function_call LOGICAL_OPERATOR function_call)
					| (value LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR value)
					| (function_call LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR function_call)
					| (list LOGICAL_OPERATOR list);								
function_def		: (AT ID  LPAREN  function_def_args  RPAREN 
					LBRACE
						(operation)*
					RBRACE SEMI)
					|
					(AT ID  LPAREN  RPAREN 
					LBRACE
						(operation)*
					RBRACE SEMI);
function_call		: ID function_call_args;
		
function_def_args: ((NUMERICAL_VAR_OP  ID) | (LIST_VAR_OP  ID))  
					(COMA ((NUMERICAL_VAR_OP  ID) | (LIST_VAR_OP  ID)))*;
function_call_args :( LPAREN (value | ID)
						(COMA (value | ID))*  RPAREN )
						| (ID LPAREN RPAREN );
loop				: FOREACH  LPAREN  VAR  IN  ID  RPAREN  LBRACE  operation *  RBRACE SEMI; 
write		    	: PRINT  LPAREN  ID  RPAREN SEMI; 
