// Generated from Lisp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, INT=32, 
		WS=33;
	public static final int
		RULE_inp = 0, RULE_expr = 1, RULE_ide = 2, RULE_unevaluatedId = 3, RULE_list = 4, 
		RULE_atom = 5, RULE_nestedList = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"inp", "expr", "ide", "unevaluatedId", "list", "atom", "nestedList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'define'", "')'", "'defun'", "'mapcar'", "'lambda'", "'+'", 
			"'-'", "'*'", "'/'", "'sqrt'", "'exp'", "'pow'", "'cdr'", "'car'", "'cons'", 
			"'if'", "'set!'", "'and'", "'or'", "'not'", "'<'", "'>'", "'<='", "'>='", 
			"'='", "'!='", "'T'", "'NIL'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Lisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitInp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InpContext inp() throws RecognitionException {
		InpContext _localctx = new InpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitFuncall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LstContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseBoolContext extends ExprContext {
		public FalseBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitFalseBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IdeContext> ide() {
			return getRuleContexts(IdeContext.class);
		}
		public IdeContext ide(int i) {
			return getRuleContext(IdeContext.class,i);
		}
		public LambdaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitGeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CarContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineContext extends ExprContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnevaluatedIdContext unevaluatedId() {
			return getRuleContext(UnevaluatedIdContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DefineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NeqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsContext extends ExprContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public UnevaluatedIdContext unevaluatedId() {
			return getRuleContext(UnevaluatedIdContext.class,0);
		}
		public ConsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetContext extends ExprContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefunContext extends ExprContext {
		public List<IdeContext> ide() {
			return getRuleContexts(IdeContext.class);
		}
		public IdeContext ide(int i) {
			return getRuleContext(IdeContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefunContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDefun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CdrContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CdrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCdr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfstatContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfstatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapcarContext extends ExprContext {
		public UnevaluatedIdContext unevaluatedId() {
			return getRuleContext(UnevaluatedIdContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MapcarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitMapcar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueBoolContext extends ExprContext {
		public TrueBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitTrueBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__0);
				setState(17);
				match(T__1);
				setState(18);
				ide();
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(19);
					expr();
					}
					break;
				case 2:
					{
					setState(20);
					unevaluatedId();
					}
					break;
				case 3:
					{
					setState(21);
					list();
					}
					break;
				}
				setState(24);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new DefunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(T__3);
				setState(28);
				ide();
				setState(29);
				match(T__0);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << ID))) != 0)) {
					{
					{
					setState(30);
					ide();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__2);
				setState(37);
				expr();
				setState(38);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new MapcarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(T__4);
				setState(42);
				unevaluatedId();
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					list();
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 );
				setState(48);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new LambdaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(T__0);
				setState(51);
				match(T__5);
				setState(52);
				match(T__0);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << ID))) != 0)) {
					{
					{
					setState(53);
					ide();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__2);
				setState(60);
				expr();
				setState(61);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__0);
				setState(64);
				match(T__6);
				setState(65);
				expr();
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					expr();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0) );
				setState(71);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(T__0);
				setState(74);
				match(T__7);
				setState(75);
				expr();
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					expr();
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0) );
				setState(81);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(T__0);
				setState(84);
				match(T__8);
				setState(85);
				expr();
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					expr();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0) );
				setState(91);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(T__0);
				setState(94);
				match(T__9);
				setState(95);
				expr();
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					expr();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0) );
				setState(101);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new SqrtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(T__0);
				setState(104);
				match(T__10);
				setState(105);
				expr();
				setState(106);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				match(T__0);
				setState(109);
				match(T__11);
				setState(110);
				expr();
				setState(111);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new PowContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				match(T__0);
				setState(114);
				match(T__12);
				setState(115);
				expr();
				setState(116);
				expr();
				setState(117);
				match(T__2);
				}
				break;
			case 12:
				_localctx = new CdrContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(119);
				match(T__0);
				setState(120);
				match(T__13);
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(121);
					list();
					}
					break;
				case 2:
					{
					setState(122);
					expr();
					}
					break;
				}
				setState(125);
				match(T__2);
				}
				break;
			case 13:
				_localctx = new CarContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(127);
				match(T__0);
				setState(128);
				match(T__14);
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					list();
					}
					break;
				case 2:
					{
					setState(130);
					expr();
					}
					break;
				}
				setState(133);
				match(T__2);
				}
				break;
			case 14:
				_localctx = new ConsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(135);
				match(T__0);
				setState(136);
				match(T__15);
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(137);
					list();
					}
					break;
				case 2:
					{
					setState(138);
					unevaluatedId();
					}
					break;
				}
				setState(141);
				list();
				setState(142);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new LstContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				list();
				}
				break;
			case 16:
				_localctx = new IfstatContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(145);
				match(T__0);
				setState(146);
				match(T__16);
				setState(147);
				expr();
				setState(148);
				expr();
				setState(149);
				expr();
				setState(150);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(152);
				match(T__0);
				setState(153);
				match(T__17);
				setState(154);
				ide();
				setState(155);
				expr();
				setState(156);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(158);
				match(T__0);
				setState(159);
				match(T__18);
				setState(160);
				expr();
				setState(161);
				expr();
				setState(162);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(164);
				match(T__0);
				setState(165);
				match(T__19);
				setState(166);
				expr();
				setState(167);
				expr();
				setState(168);
				match(T__2);
				}
				break;
			case 20:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(170);
				match(T__0);
				setState(171);
				match(T__20);
				setState(172);
				expr();
				setState(173);
				match(T__2);
				}
				break;
			case 21:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(175);
				match(T__0);
				setState(176);
				match(T__21);
				setState(177);
				expr();
				setState(178);
				expr();
				setState(179);
				match(T__2);
				}
				break;
			case 22:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(181);
				match(T__0);
				setState(182);
				match(T__22);
				setState(183);
				expr();
				setState(184);
				expr();
				setState(185);
				match(T__2);
				}
				break;
			case 23:
				_localctx = new LeqContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(187);
				match(T__0);
				setState(188);
				match(T__23);
				setState(189);
				expr();
				setState(190);
				expr();
				setState(191);
				match(T__2);
				}
				break;
			case 24:
				_localctx = new GeqContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(193);
				match(T__0);
				setState(194);
				match(T__24);
				setState(195);
				expr();
				setState(196);
				expr();
				setState(197);
				match(T__2);
				}
				break;
			case 25:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(199);
				match(T__0);
				setState(200);
				match(T__25);
				setState(201);
				expr();
				setState(202);
				expr();
				setState(203);
				match(T__2);
				}
				break;
			case 26:
				_localctx = new NeqContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(205);
				match(T__0);
				setState(206);
				match(T__26);
				setState(207);
				expr();
				setState(208);
				expr();
				setState(209);
				match(T__2);
				}
				break;
			case 27:
				_localctx = new TrueBoolContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(211);
				match(T__27);
				}
				break;
			case 28:
				_localctx = new FalseBoolContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(212);
					match(T__0);
					setState(213);
					match(T__2);
					}
					break;
				case T__28:
					{
					setState(214);
					match(T__28);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 29:
				_localctx = new IfstatContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(217);
				match(T__0);
				setState(218);
				match(T__16);
				setState(219);
				expr();
				setState(220);
				expr();
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					expr();
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0) );
				setState(226);
				match(T__2);
				}
				break;
			case 30:
				_localctx = new FuncallContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(228);
				match(T__0);
				setState(229);
				expr();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0)) {
					{
					{
					setState(230);
					expr();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(T__2);
				}
				break;
			case 31:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(238);
				ide();
				}
				break;
			case 32:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(239);
				match(INT);
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

	public static class IdeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public IdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ide; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdeContext ide() throws RecognitionException {
		IdeContext _localctx = new IdeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnevaluatedIdContext extends ParserRuleContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public UnevaluatedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unevaluatedId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitUnevaluatedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnevaluatedIdContext unevaluatedId() throws RecognitionException {
		UnevaluatedIdContext _localctx = new UnevaluatedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unevaluatedId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__29);
			setState(245);
			ide();
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<NestedListContext> nestedList() {
			return getRuleContexts(NestedListContext.class);
		}
		public NestedListContext nestedList(int i) {
			return getRuleContext(NestedListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__29);
			setState(248);
			match(T__0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << ID))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case ID:
					{
					setState(249);
					atom();
					}
					break;
				case T__0:
					{
					setState(250);
					nestedList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__2);
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

	public static class AtomContext extends ParserRuleContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			ide();
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

	public static class NestedListContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<NestedListContext> nestedList() {
			return getRuleContexts(NestedListContext.class);
		}
		public NestedListContext nestedList(int i) {
			return getRuleContext(NestedListContext.class,i);
		}
		public NestedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitNestedList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedListContext nestedList() throws RecognitionException {
		NestedListContext _localctx = new NestedListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nestedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << ID))) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case ID:
					{
					setState(261);
					atom();
					}
					break;
				case T__0:
					{
					setState(262);
					nestedList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\31\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"F\n\3\r\3\16\3G\3\3\3\3\3\3\3\3\3\3\3\3\6\3P\n\3\r\3\16\3Q\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\3\3\3\3\3\3\3\6\3d\n\3\r\3\16"+
		"\3e\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0086\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00da\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3\u00e1\n\3\r\3\16\3\u00e2\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u00ea\n\3\f\3\16\3\u00ed\13\3\3\3\3\3\3\3\3\3\5\3\u00f3\n\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00fe\n\6\f\6\16\6\u0101\13\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\7\b\u010a\n\b\f\b\16\b\u010d\13\b\3\b\3\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\3\5\2\4\4\6\37!!\2\u013b\2\20\3\2\2\2\4\u00f2\3\2"+
		"\2\2\6\u00f4\3\2\2\2\b\u00f6\3\2\2\2\n\u00f9\3\2\2\2\f\u0104\3\2\2\2\16"+
		"\u0106\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\7\3\2\2\23\24\7\4\2\2"+
		"\24\30\5\6\4\2\25\31\5\4\3\2\26\31\5\b\5\2\27\31\5\n\6\2\30\25\3\2\2\2"+
		"\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\33\7\5\2\2\33\u00f3\3\2"+
		"\2\2\34\35\7\3\2\2\35\36\7\6\2\2\36\37\5\6\4\2\37#\7\3\2\2 \"\5\6\4\2"+
		"! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\5\2"+
		"\2\'(\5\4\3\2()\7\5\2\2)\u00f3\3\2\2\2*+\7\3\2\2+,\7\7\2\2,.\5\b\5\2-"+
		"/\5\n\6\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2"+
		"\2\62\63\7\5\2\2\63\u00f3\3\2\2\2\64\65\7\3\2\2\65\66\7\b\2\2\66:\7\3"+
		"\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<"+
		":\3\2\2\2=>\7\5\2\2>?\5\4\3\2?@\7\5\2\2@\u00f3\3\2\2\2AB\7\3\2\2BC\7\t"+
		"\2\2CE\5\4\3\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IJ\7\5\2\2J\u00f3\3\2\2\2KL\7\3\2\2LM\7\n\2\2MO\5\4\3\2NP\5\4\3\2"+
		"ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\5\2\2T\u00f3\3"+
		"\2\2\2UV\7\3\2\2VW\7\13\2\2WY\5\4\3\2XZ\5\4\3\2YX\3\2\2\2Z[\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\5\2\2^\u00f3\3\2\2\2_`\7\3\2\2`a\7"+
		"\f\2\2ac\5\4\3\2bd\5\4\3\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gh\7\5\2\2h\u00f3\3\2\2\2ij\7\3\2\2jk\7\r\2\2kl\5\4\3\2lm\7\5\2"+
		"\2m\u00f3\3\2\2\2no\7\3\2\2op\7\16\2\2pq\5\4\3\2qr\7\5\2\2r\u00f3\3\2"+
		"\2\2st\7\3\2\2tu\7\17\2\2uv\5\4\3\2vw\5\4\3\2wx\7\5\2\2x\u00f3\3\2\2\2"+
		"yz\7\3\2\2z}\7\20\2\2{~\5\n\6\2|~\5\4\3\2}{\3\2\2\2}|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\5\2\2\u0080\u00f3\3\2\2\2\u0081\u0082\7\3\2\2\u0082\u0085"+
		"\7\21\2\2\u0083\u0086\5\n\6\2\u0084\u0086\5\4\3\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\5\2\2\u0088\u00f3"+
		"\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008d\7\22\2\2\u008b\u008e\5\n\6\2"+
		"\u008c\u008e\5\b\5\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7\5\2\2\u0091\u00f3\3\2\2\2\u0092"+
		"\u00f3\5\n\6\2\u0093\u0094\7\3\2\2\u0094\u0095\7\23\2\2\u0095\u0096\5"+
		"\4\3\2\u0096\u0097\5\4\3\2\u0097\u0098\5\4\3\2\u0098\u0099\7\5\2\2\u0099"+
		"\u00f3\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009c\7\24\2\2\u009c\u009d\5"+
		"\6\4\2\u009d\u009e\5\4\3\2\u009e\u009f\7\5\2\2\u009f\u00f3\3\2\2\2\u00a0"+
		"\u00a1\7\3\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\5"+
		"\4\3\2\u00a4\u00a5\7\5\2\2\u00a5\u00f3\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7"+
		"\u00a8\7\26\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\5\4\3\2\u00aa\u00ab\7"+
		"\5\2\2\u00ab\u00f3\3\2\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\7\27\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\u00b0\7\5\2\2\u00b0\u00f3\3\2\2\2\u00b1\u00b2\7\3"+
		"\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\5\4\3\2\u00b5"+
		"\u00b6\7\5\2\2\u00b6\u00f3\3\2\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\7\31"+
		"\2\2\u00b9\u00ba\5\4\3\2\u00ba\u00bb\5\4\3\2\u00bb\u00bc\7\5\2\2\u00bc"+
		"\u00f3\3\2\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\5"+
		"\4\3\2\u00c0\u00c1\5\4\3\2\u00c1\u00c2\7\5\2\2\u00c2\u00f3\3\2\2\2\u00c3"+
		"\u00c4\7\3\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\5"+
		"\4\3\2\u00c7\u00c8\7\5\2\2\u00c8\u00f3\3\2\2\2\u00c9\u00ca\7\3\2\2\u00ca"+
		"\u00cb\7\34\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\5\4\3\2\u00cd\u00ce\7"+
		"\5\2\2\u00ce\u00f3\3\2\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\7\35\2\2\u00d1"+
		"\u00d2\5\4\3\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4\7\5\2\2\u00d4\u00f3\3\2"+
		"\2\2\u00d5\u00f3\7\36\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00da\7\5\2\2\u00d8"+
		"\u00da\7\37\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00f3\3"+
		"\2\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\5\4\3\2\u00de"+
		"\u00e0\5\4\3\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7\5\2\2\u00e5\u00f3\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00eb\5\4"+
		"\3\2\u00e8\u00ea\5\4\3\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f3\5\6\4\2\u00f1"+
		"\u00f3\7\"\2\2\u00f2\22\3\2\2\2\u00f2\34\3\2\2\2\u00f2*\3\2\2\2\u00f2"+
		"\64\3\2\2\2\u00f2A\3\2\2\2\u00f2K\3\2\2\2\u00f2U\3\2\2\2\u00f2_\3\2\2"+
		"\2\u00f2i\3\2\2\2\u00f2n\3\2\2\2\u00f2s\3\2\2\2\u00f2y\3\2\2\2\u00f2\u0081"+
		"\3\2\2\2\u00f2\u0089\3\2\2\2\u00f2\u0092\3\2\2\2\u00f2\u0093\3\2\2\2\u00f2"+
		"\u009a\3\2\2\2\u00f2\u00a0\3\2\2\2\u00f2\u00a6\3\2\2\2\u00f2\u00ac\3\2"+
		"\2\2\u00f2\u00b1\3\2\2\2\u00f2\u00b7\3\2\2\2\u00f2\u00bd\3\2\2\2\u00f2"+
		"\u00c3\3\2\2\2\u00f2\u00c9\3\2\2\2\u00f2\u00cf\3\2\2\2\u00f2\u00d5\3\2"+
		"\2\2\u00f2\u00d9\3\2\2\2\u00f2\u00db\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\5\3\2\2\2\u00f4\u00f5\t\2\2\2"+
		"\u00f5\7\3\2\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\6\4\2\u00f8\t\3\2\2"+
		"\2\u00f9\u00fa\7 \2\2\u00fa\u00ff\7\3\2\2\u00fb\u00fe\5\f\7\2\u00fc\u00fe"+
		"\5\16\b\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7\5\2\2\u0103\13\3\2\2\2\u0104\u0105\5\6\4\2\u0105"+
		"\r\3\2\2\2\u0106\u010b\7\3\2\2\u0107\u010a\5\f\7\2\u0108\u010a\5\16\b"+
		"\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\5\2\2\u010f\17\3\2\2\2\25\30#\60:GQ[e}\u0085\u008d\u00d9\u00e2"+
		"\u00eb\u00f2\u00fd\u00ff\u0109\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}