lexer grammar CmmLexer;

TYPE: 'int' | 'float';
INT : '0' | [1-9][0-9]*
    | '0'('X'|'x')[0-9A-Fa-f]+
    | '0'[0-7]+;
FLOAT: DIGIT+'.'DIGIT*([eE]('+'|'-')?[0-9]*)?
    | '.'DIGIT+([eE]('+'|'-')?[0-9]*)?
    | DIGIT+'.'DIGIT+;
WS : [ \t\r\n]+ -> skip ;
STRUCT: 'struct';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
BREAK: 'break';
ID : (LEETER | '_') WORD* ;

SEMI: ';';
COMMA: ',';
ASSIGNOP: '=';
RELOP: '>' | '<' | '>=' | '<=' | '==' | '!=';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
AND: '&&';
OR: '||';
DOT: '.';
NOT: '!';
LP: '(';
RP: ')';
LB: '[';
RB: ']';
LC: '{';
RC: '}';

SL_COMMENT: '//' .*? '\n' ->skip;
ML_COMMENT:'/*' .*? '*/' ->skip;

fragment
DIGIT : [0-9] ;
fragment
LEETER : [a-zA-Z] ;
fragment
WORD : [a-zA-Z0-9_] ;