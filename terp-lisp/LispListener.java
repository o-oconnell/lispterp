// Generated from Lisp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#inp}.
	 * @param ctx the parse tree
	 */
	void enterInp(LispParser.InpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#inp}.
	 * @param ctx the parse tree
	 */
	void exitInp(LispParser.InpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code define}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefine(LispParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code define}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefine(LispParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defun}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefun(LispParser.DefunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defun}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefun(LispParser.DefunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapcar}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMapcar(LispParser.MapcarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapcar}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMapcar(LispParser.MapcarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(LispParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(LispParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LispParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LispParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(LispParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(LispParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(LispParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(LispParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LispParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LispParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(LispParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(LispParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExp(LispParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExp(LispParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(LispParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(LispParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cdr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCdr(LispParser.CdrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cdr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCdr(LispParser.CdrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code car}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCar(LispParser.CarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code car}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCar(LispParser.CarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cons}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCons(LispParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cons}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCons(LispParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lst}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLst(LispParser.LstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lst}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLst(LispParser.LstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstat}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(LispParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstat}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(LispParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code set}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSet(LispParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code set}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSet(LispParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LispParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LispParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(LispParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(LispParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(LispParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(LispParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LispParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LispParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(LispParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(LispParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeq(LispParser.LeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeq(LispParser.LeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeq(LispParser.GeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeq(LispParser.GeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(LispParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(LispParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeq(LispParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neq}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeq(LispParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueBool(LispParser.TrueBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueBool(LispParser.TrueBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseBool(LispParser.FalseBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseBool(LispParser.FalseBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(LispParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcall}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(LispParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LispParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LispParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LispParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LispParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#ide}.
	 * @param ctx the parse tree
	 */
	void enterIde(LispParser.IdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#ide}.
	 * @param ctx the parse tree
	 */
	void exitIde(LispParser.IdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#unevaluatedId}.
	 * @param ctx the parse tree
	 */
	void enterUnevaluatedId(LispParser.UnevaluatedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#unevaluatedId}.
	 * @param ctx the parse tree
	 */
	void exitUnevaluatedId(LispParser.UnevaluatedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LispParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LispParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#nestedList}.
	 * @param ctx the parse tree
	 */
	void enterNestedList(LispParser.NestedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#nestedList}.
	 * @param ctx the parse tree
	 */
	void exitNestedList(LispParser.NestedListContext ctx);
}