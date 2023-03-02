// Generated from Lisp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#inp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInp(LispParser.InpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code define}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(LispParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defun}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun(LispParser.DefunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapcar}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapcar(LispParser.MapcarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(LispParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LispParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LispParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LispParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LispParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(LispParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LispParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(LispParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cdr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdr(LispParser.CdrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code car}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCar(LispParser.CarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(LispParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lst}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLst(LispParser.LstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstat}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(LispParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code set}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(LispParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LispParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LispParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LispParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LispParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(LispParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeq(LispParser.LeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeq(LispParser.GeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(LispParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(LispParser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBool(LispParser.TrueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBool(LispParser.FalseBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall(LispParser.FuncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LispParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LispParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#ide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIde(LispParser.IdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#unevaluatedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnevaluatedId(LispParser.UnevaluatedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LispParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#nestedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedList(LispParser.NestedListContext ctx);
}