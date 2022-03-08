// Generated from C:/Users/x1762/Desktop/Lab/src/main/java/L2\CmmParser.g4 by ANTLR 4.9.2
package L2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 */
	void enterExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 */
	void exitExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 */
	void enterExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 */
	void exitExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void enterNormspf(CmmParser.NormspfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void exitNormspf(CmmParser.NormspfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void enterStructspf(CmmParser.StructspfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void exitStructspf(CmmParser.StructspfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structspf1}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructspf1(CmmParser.Structspf1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structspf1}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructspf1(CmmParser.Structspf1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code structspf0}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructspf0(CmmParser.Structspf0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structspf0}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructspf0(CmmParser.Structspf0Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 */
	void enterOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 */
	void exitOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(CmmParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(CmmParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fundec1}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void enterFundec1(CmmParser.Fundec1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fundec1}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void exitFundec1(CmmParser.Fundec1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code fundec0}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void enterFundec0(CmmParser.Fundec0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fundec0}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void exitFundec0(CmmParser.Fundec0Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(CmmParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(CmmParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 */
	void enterParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 */
	void exitParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 */
	void enterCompSt(CmmParser.CompStContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 */
	void exitCompSt(CmmParser.CompStContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmts}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmts(CmmParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmts}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmts(CmmParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtret}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtret(CmmParser.StmtretContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtret}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtret(CmmParser.StmtretContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtjug}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtjug(CmmParser.StmtjugContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtjug}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtjug(CmmParser.StmtjugContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 */
	void enterDefList(CmmParser.DefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 */
	void exitDefList(CmmParser.DefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CmmParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CmmParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 */
	void enterDecList(CmmParser.DecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 */
	void exitDecList(CmmParser.DecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CmmParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CmmParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expbin}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpbin(CmmParser.ExpbinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expbin}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpbin(CmmParser.ExpbinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expfunc}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpfunc(CmmParser.ExpfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expfunc}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpfunc(CmmParser.ExpfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expequ}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpequ(CmmParser.ExpequContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expequ}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpequ(CmmParser.ExpequContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expnothing}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpnothing(CmmParser.ExpnothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expnothing}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpnothing(CmmParser.ExpnothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exparr}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExparr(CmmParser.ExparrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exparr}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExparr(CmmParser.ExparrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expval}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpval(CmmParser.ExpvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expval}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpval(CmmParser.ExpvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expstruct}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpstruct(CmmParser.ExpstructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expstruct}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpstruct(CmmParser.ExpstructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expnot}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpnot(CmmParser.ExpnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expnot}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpnot(CmmParser.ExpnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expid}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpid(CmmParser.ExpidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expid}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpid(CmmParser.ExpidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expopt}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpopt(CmmParser.ExpoptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expopt}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpopt(CmmParser.ExpoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CmmParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CmmParser.ArgsContext ctx);
}