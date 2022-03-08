// Generated from C:/Users/x1762/Desktop/Lab/src/main/java/L2\CmmParser.g4 by ANTLR 4.9.2
package L2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormspf(CmmParser.NormspfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structspf}
	 * labeled alternative in {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructspf(CmmParser.StructspfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structspf1}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructspf1(CmmParser.Structspf1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code structspf0}
	 * labeled alternative in {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructspf0(CmmParser.Structspf0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(CmmParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fundec1}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundec1(CmmParser.Fundec1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fundec0}
	 * labeled alternative in {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundec0(CmmParser.Fundec0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(CmmParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSt(CmmParser.CompStContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmts}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(CmmParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtret}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtret(CmmParser.StmtretContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtjug}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtjug(CmmParser.StmtjugContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefList(CmmParser.DefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CmmParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecList(CmmParser.DecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CmmParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expbin}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpbin(CmmParser.ExpbinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expfunc}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpfunc(CmmParser.ExpfuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expequ}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpequ(CmmParser.ExpequContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expnothing}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpnothing(CmmParser.ExpnothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exparr}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExparr(CmmParser.ExparrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expval}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpval(CmmParser.ExpvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expstruct}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpstruct(CmmParser.ExpstructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expnot}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpnot(CmmParser.ExpnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expid}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpid(CmmParser.ExpidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expopt}
	 * labeled alternative in {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpopt(CmmParser.ExpoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CmmParser.ArgsContext ctx);
}