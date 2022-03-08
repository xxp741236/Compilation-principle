parser grammar CmmParser;
options {
 tokenVocab = CmmLexer;
}
//高级定义
program : extDef* EOF;
extDef : specifier extDecList SEMI # extDefnorm//正常声明
    | specifier SEMI # extDefnorm
    | specifier funDec compSt # extDeffun;//函数声明
extDecList : varDec (COMMA varDec)*;
//标志
specifier : TYPE # normspf
    | structSpecifier # structspf;
structSpecifier : STRUCT optTag LC defList RC # structspf1
    | STRUCT tag # structspf0;
optTag : ID | ;
tag : ID;
//声明
varDec : ID (LB INT RB)*;
funDec : ID LP varList RP # fundec1
    | ID LP RP # fundec0 ;
varList : paramDec (COMMA paramDec)*;
paramDec : specifier varDec;
//状态
compSt : LC defList stmtList RC;
stmtList : stmt*;
stmt : exp SEMI # stmts//其他表达式
| compSt #stmts
| RETURN exp SEMI #stmtret
| IF LP exp RP stmt #stmtjug
| IF LP exp RP stmt ELSE stmt #stmtjug
| WHILE LP exp RP stmt #stmtjug;
//本地定义
defList : def*;
def : specifier decList SEMI; //具体声明
decList : dec (COMMA dec)*;
dec : varDec | varDec ASSIGNOP exp;
//表达式
exp : LP exp RP # expnothing
| ID LP (args |) RP # expfunc
| exp LB exp RB # exparr
| exp DOT ID # expstruct
| <assoc=right> (MINUS | NOT) exp #expnot
| exp (STAR | DIV) exp #expopt
| exp (PLUS | MINUS) exp # expopt
| exp RELOP exp # expopt
| exp AND exp # expbin
| exp OR exp # expbin
|  <assoc=right> exp ASSIGNOP exp # expequ
| ID # expid
| INT # expval
| FLOAT # expval;
args : exp (COMMA exp)*;