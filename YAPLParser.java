// Generated from YAPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FI=3, IF=4, IN=5, INHERITS=6, ISVOID=7, LOOP=8, POOL=9, 
		THEN=10, WHILE=11, NEW=12, NOT=13, LET=14, FALSE=15, TRUE=16, SELF=17, 
		SELF_TYPE=18, BOOL=19, INT=20, STRING=21, VOID=22, SEMICOLON=23, COLON=24, 
		LBRACE=25, RBRACE=26, LBRACKET=27, RBRACKET=28, LPAR=29, RPAR=30, COMMA=31, 
		QUOTES=32, APOSTROPHE=33, ADD=34, SUB=35, MULTIPLY=36, DIVIDE=37, NEGATION=38, 
		LESS_OP=39, LESS_EQ_OP=40, EQUAL_OP=41, DOT=42, AT=43, ASIGN=44, TYPE_ID=45, 
		OBJ_ID=46, ALPHA=47, INTEGER=48, DIGIT=49, CAP=50, ALPHA_NUM=51, STRING_LIT=52, 
		BOOL_LIT=53, COMMENT=54, OTHER_COMMENT=55, NEWLINE=56, WHITESPACE=57, 
		ERR_TOKEN=58;
	public static final int
		RULE_program = 0, RULE_class = 1, RULE_feature = 2, RULE_formal = 3, RULE_expr = 4, 
		RULE_var_type = 5, RULE_var_id = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class", "feature", "formal", "expr", "var_type", "var_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'false'", "'true'", "'self'", "'SELF_TYPE'", "'Bool'", 
			"'Int'", "'String'", "'void'", "';'", "':'", "'{'", "'}'", "'['", "']'", 
			"'('", "')'", "','", "'\"'", "'''", "'+'", "'-'", "'*'", "'/'", "'~'", 
			"'<'", "'<='", "'='", "'.'", "'@'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LOOP", 
			"POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "FALSE", "TRUE", "SELF", 
			"SELF_TYPE", "BOOL", "INT", "STRING", "VOID", "SEMICOLON", "COLON", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "COMMA", "QUOTES", 
			"APOSTROPHE", "ADD", "SUB", "MULTIPLY", "DIVIDE", "NEGATION", "LESS_OP", 
			"LESS_EQ_OP", "EQUAL_OP", "DOT", "AT", "ASIGN", "TYPE_ID", "OBJ_ID", 
			"ALPHA", "INTEGER", "DIGIT", "CAP", "ALPHA_NUM", "STRING_LIT", "BOOL_LIT", 
			"COMMENT", "OTHER_COMMENT", "NEWLINE", "WHITESPACE", "ERR_TOKEN"
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
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YAPLParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				class_();
				setState(15);
				match(SEMICOLON);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YAPLParser.CLASS, 0); }
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(YAPLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CLASS);
			setState(22);
			var_type();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				var_type();
				}
			}

			setState(27);
			match(LBRACE);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELF || _la==OBJ_ID) {
				{
				{
				setState(28);
				feature();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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

	public static class FeatureContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(YAPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(YAPLParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YAPLParser.SEMICOLON, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public TerminalNode ASIGN() { return getToken(YAPLParser.ASIGN, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				var_id();
				setState(37);
				match(LPAR);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELF || _la==OBJ_ID) {
					{
					setState(38);
					formal();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(39);
						match(COMMA);
						setState(40);
						formal();
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(48);
				match(RPAR);
				setState(49);
				match(COLON);
				setState(50);
				var_type();
				setState(51);
				match(LBRACE);
				setState(52);
				expr(0);
				setState(53);
				match(RBRACE);
				setState(54);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				var_id();
				setState(57);
				match(COLON);
				setState(58);
				var_type();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGN) {
					{
					setState(59);
					match(ASIGN);
					setState(60);
					expr(0);
					}
				}

				setState(63);
				match(SEMICOLON);
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

	public static class FormalContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			var_id();
			setState(68);
			match(COLON);
			setState(69);
			var_type();
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
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public List<TerminalNode> ASIGN() { return getTokens(YAPLParser.ASIGN); }
		public TerminalNode ASIGN(int i) {
			return getToken(YAPLParser.ASIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(YAPLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(YAPLParser.LPAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public TerminalNode LBRACKET() { return getToken(YAPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(YAPLParser.RBRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(YAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YAPLParser.SEMICOLON, i);
		}
		public TerminalNode LET() { return getToken(YAPLParser.LET, 0); }
		public List<TerminalNode> COLON() { return getTokens(YAPLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(YAPLParser.COLON, i);
		}
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public TerminalNode IN() { return getToken(YAPLParser.IN, 0); }
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(YAPLParser.ISVOID, 0); }
		public TerminalNode NEGATION() { return getToken(YAPLParser.NEGATION, 0); }
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public TerminalNode RPAR() { return getToken(YAPLParser.RPAR, 0); }
		public TerminalNode INTEGER() { return getToken(YAPLParser.INTEGER, 0); }
		public TerminalNode STRING_LIT() { return getToken(YAPLParser.STRING_LIT, 0); }
		public TerminalNode TRUE() { return getToken(YAPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(YAPLParser.FALSE, 0); }
		public TerminalNode ADD() { return getToken(YAPLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YAPLParser.SUB, 0); }
		public TerminalNode MULTIPLY() { return getToken(YAPLParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(YAPLParser.DIVIDE, 0); }
		public TerminalNode LESS_OP() { return getToken(YAPLParser.LESS_OP, 0); }
		public TerminalNode LESS_EQ_OP() { return getToken(YAPLParser.LESS_EQ_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(YAPLParser.EQUAL_OP, 0); }
		public TerminalNode DOT() { return getToken(YAPLParser.DOT, 0); }
		public TerminalNode AT() { return getToken(YAPLParser.AT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(72);
				var_id();
				setState(73);
				match(ASIGN);
				setState(74);
				expr(24);
				}
				break;
			case 2:
				{
				setState(76);
				var_id();
				setState(77);
				match(LPAR);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					expr(0);
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(79);
						match(COMMA);
						setState(80);
						expr(0);
						}
						}
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(88);
				match(LPAR);
				}
				break;
			case 3:
				{
				setState(90);
				match(IF);
				setState(91);
				expr(0);
				setState(92);
				match(THEN);
				setState(93);
				expr(0);
				setState(94);
				match(ELSE);
				setState(95);
				expr(0);
				setState(96);
				match(FI);
				}
				break;
			case 4:
				{
				setState(98);
				match(WHILE);
				setState(99);
				expr(0);
				setState(100);
				match(LOOP);
				setState(101);
				expr(0);
				setState(102);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(104);
				match(LBRACKET);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					expr(0);
					setState(106);
					match(SEMICOLON);
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << FALSE) | (1L << TRUE) | (1L << SELF) | (1L << LBRACKET) | (1L << LPAR) | (1L << NEGATION) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING_LIT))) != 0) );
				setState(112);
				match(RBRACKET);
				}
				break;
			case 6:
				{
				setState(114);
				match(LET);
				setState(115);
				var_id();
				setState(116);
				match(COLON);
				setState(117);
				var_type();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGN) {
					{
					setState(118);
					match(ASIGN);
					setState(119);
					expr(0);
					}
				}

				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					var_id();
					setState(124);
					match(COLON);
					setState(125);
					var_type();
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASIGN) {
						{
						setState(126);
						match(ASIGN);
						setState(127);
						expr(0);
						}
					}

					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(IN);
				setState(136);
				expr(18);
				}
				break;
			case 7:
				{
				setState(138);
				match(NEW);
				setState(139);
				var_type();
				}
				break;
			case 8:
				{
				setState(140);
				match(ISVOID);
				setState(141);
				expr(16);
				}
				break;
			case 9:
				{
				setState(142);
				match(NEGATION);
				setState(143);
				expr(11);
				}
				break;
			case 10:
				{
				setState(144);
				match(NOT);
				setState(145);
				expr(7);
				}
				break;
			case 11:
				{
				setState(146);
				match(LPAR);
				setState(147);
				expr(0);
				setState(148);
				match(RPAR);
				}
				break;
			case 12:
				{
				setState(150);
				var_id();
				}
				break;
			case 13:
				{
				setState(151);
				match(INTEGER);
				}
				break;
			case 14:
				{
				setState(152);
				match(STRING_LIT);
				}
				break;
			case 15:
				{
				setState(153);
				match(TRUE);
				}
				break;
			case 16:
				{
				setState(154);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(158);
						match(ADD);
						setState(159);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(161);
						match(SUB);
						setState(162);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(164);
						match(MULTIPLY);
						setState(165);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(167);
						match(DIVIDE);
						setState(168);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(LESS_OP);
						setState(171);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(173);
						match(LESS_EQ_OP);
						setState(174);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(176);
						match(EQUAL_OP);
						setState(177);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(179);
							match(AT);
							setState(180);
							var_type();
							}
						}

						setState(183);
						match(DOT);
						setState(184);
						var_id();
						setState(185);
						match(LPAR);
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << FALSE) | (1L << TRUE) | (1L << SELF) | (1L << LBRACKET) | (1L << LPAR) | (1L << NEGATION) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING_LIT))) != 0)) {
							{
							setState(186);
							expr(0);
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(187);
								match(COMMA);
								setState(188);
								expr(0);
								}
								}
								setState(193);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(196);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(YAPLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(YAPLParser.STRING, 0); }
		public TerminalNode TYPE_ID() { return getToken(YAPLParser.TYPE_ID, 0); }
		public TerminalNode SELF_TYPE() { return getToken(YAPLParser.SELF_TYPE, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF_TYPE) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << TYPE_ID))) != 0)) ) {
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode OBJ_ID() { return getToken(YAPLParser.OBJ_ID, 0); }
		public TerminalNode SELF() { return getToken(YAPLParser.SELF, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitVar_id(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==OBJ_ID) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0003\u0002/\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"B\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b\u0004\n\u0004\f\u0004"+
		"U\t\u0004\u0003\u0004W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004m\b"+
		"\u0004\u000b\u0004\f\u0004n\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004y\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0081\b\u0004\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004"+
		"\u0086\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00be\b\u0004\n\u0004\f\u0004\u00c1\t\u0004\u0003"+
		"\u0004\u00c3\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c7\b\u0004"+
		"\n\u0004\f\u0004\u00ca\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0000\u0001\b\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0002\u0002\u0000\u0012\u0015--\u0002\u0000\u0011\u0011..\u00ef\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004"+
		"A\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\b\u009b\u0001"+
		"\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000\u0000\f\u00cd\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0017"+
		"\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0019\u0003\n\u0005"+
		"\u0000\u0017\u0018\u0005\u0006\u0000\u0000\u0018\u001a\u0003\n\u0005\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001f\u0005\u0019\u0000\u0000"+
		"\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u001a\u0000\u0000#\u0003\u0001\u0000\u0000\u0000"+
		"$%\u0003\f\u0006\u0000%.\u0005\u001d\u0000\u0000&+\u0003\u0006\u0003\u0000"+
		"\'(\u0005\u001f\u0000\u0000(*\u0003\u0006\u0003\u0000)\'\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.&\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u001e\u0000\u000012\u0005\u0018\u0000\u000023\u0003\n\u0005\u0000"+
		"34\u0005\u0019\u0000\u000045\u0003\b\u0004\u000056\u0005\u001a\u0000\u0000"+
		"67\u0005\u0017\u0000\u00007B\u0001\u0000\u0000\u000089\u0003\f\u0006\u0000"+
		"9:\u0005\u0018\u0000\u0000:=\u0003\n\u0005\u0000;<\u0005,\u0000\u0000"+
		"<>\u0003\b\u0004\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0005\u0017\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A$\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000B\u0005\u0001"+
		"\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\u0018\u0000\u0000EF\u0003"+
		"\n\u0005\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0006\u0004\uffff\uffff"+
		"\u0000HI\u0003\f\u0006\u0000IJ\u0005,\u0000\u0000JK\u0003\b\u0004\u0018"+
		"K\u009c\u0001\u0000\u0000\u0000LM\u0003\f\u0006\u0000MV\u0005\u001d\u0000"+
		"\u0000NS\u0003\b\u0004\u0000OP\u0005\u001f\u0000\u0000PR\u0003\b\u0004"+
		"\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0005\u001d\u0000\u0000Y\u009c\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003\b\u0004\u0000\\]\u0005"+
		"\n\u0000\u0000]^\u0003\b\u0004\u0000^_\u0005\u0002\u0000\u0000_`\u0003"+
		"\b\u0004\u0000`a\u0005\u0003\u0000\u0000a\u009c\u0001\u0000\u0000\u0000"+
		"bc\u0005\u000b\u0000\u0000cd\u0003\b\u0004\u0000de\u0005\b\u0000\u0000"+
		"ef\u0003\b\u0004\u0000fg\u0005\t\u0000\u0000g\u009c\u0001\u0000\u0000"+
		"\u0000hl\u0005\u001b\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005\u0017\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0005\u001c\u0000\u0000q\u009c\u0001\u0000\u0000"+
		"\u0000rs\u0005\u000e\u0000\u0000st\u0003\f\u0006\u0000tu\u0005\u0018\u0000"+
		"\u0000ux\u0003\n\u0005\u0000vw\u0005,\u0000\u0000wy\u0003\b\u0004\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0084\u0001\u0000"+
		"\u0000\u0000z{\u0005\u001f\u0000\u0000{|\u0003\f\u0006\u0000|}\u0005\u0018"+
		"\u0000\u0000}\u0080\u0003\n\u0005\u0000~\u007f\u0005,\u0000\u0000\u007f"+
		"\u0081\u0003\b\u0004\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082z\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0005\u0000\u0000\u0088\u0089\u0003\b\u0004\u0012\u0089\u009c\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\f\u0000\u0000\u008b\u009c\u0003\n\u0005"+
		"\u0000\u008c\u008d\u0005\u0007\u0000\u0000\u008d\u009c\u0003\b\u0004\u0010"+
		"\u008e\u008f\u0005&\u0000\u0000\u008f\u009c\u0003\b\u0004\u000b\u0090"+
		"\u0091\u0005\r\u0000\u0000\u0091\u009c\u0003\b\u0004\u0007\u0092\u0093"+
		"\u0005\u001d\u0000\u0000\u0093\u0094\u0003\b\u0004\u0000\u0094\u0095\u0005"+
		"\u001e\u0000\u0000\u0095\u009c\u0001\u0000\u0000\u0000\u0096\u009c\u0003"+
		"\f\u0006\u0000\u0097\u009c\u00050\u0000\u0000\u0098\u009c\u00054\u0000"+
		"\u0000\u0099\u009c\u0005\u0010\u0000\u0000\u009a\u009c\u0005\u000f\u0000"+
		"\u0000\u009bG\u0001\u0000\u0000\u0000\u009bL\u0001\u0000\u0000\u0000\u009b"+
		"Z\u0001\u0000\u0000\u0000\u009bb\u0001\u0000\u0000\u0000\u009bh\u0001"+
		"\u0000\u0000\u0000\u009br\u0001\u0000\u0000\u0000\u009b\u008a\u0001\u0000"+
		"\u0000\u0000\u009b\u008c\u0001\u0000\u0000\u0000\u009b\u008e\u0001\u0000"+
		"\u0000\u0000\u009b\u0090\u0001\u0000\u0000\u0000\u009b\u0092\u0001\u0000"+
		"\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000"+
		"\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u00c8\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\n\u000f\u0000\u0000\u009e\u009f\u0005\"\u0000"+
		"\u0000\u009f\u00c7\u0003\b\u0004\u0010\u00a0\u00a1\n\u000e\u0000\u0000"+
		"\u00a1\u00a2\u0005#\u0000\u0000\u00a2\u00c7\u0003\b\u0004\u000f\u00a3"+
		"\u00a4\n\r\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5\u00c7\u0003"+
		"\b\u0004\u000e\u00a6\u00a7\n\f\u0000\u0000\u00a7\u00a8\u0005%\u0000\u0000"+
		"\u00a8\u00c7\u0003\b\u0004\r\u00a9\u00aa\n\n\u0000\u0000\u00aa\u00ab\u0005"+
		"\'\u0000\u0000\u00ab\u00c7\u0003\b\u0004\u000b\u00ac\u00ad\n\t\u0000\u0000"+
		"\u00ad\u00ae\u0005(\u0000\u0000\u00ae\u00c7\u0003\b\u0004\n\u00af\u00b0"+
		"\n\b\u0000\u0000\u00b0\u00b1\u0005)\u0000\u0000\u00b1\u00c7\u0003\b\u0004"+
		"\t\u00b2\u00b5\n\u0017\u0000\u0000\u00b3\u00b4\u0005+\u0000\u0000\u00b4"+
		"\u00b6\u0003\n\u0005\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005*\u0000\u0000\u00b8\u00b9\u0003\f\u0006\u0000\u00b9\u00c2\u0005"+
		"\u001d\u0000\u0000\u00ba\u00bf\u0003\b\u0004\u0000\u00bb\u00bc\u0005\u001f"+
		"\u0000\u0000\u00bc\u00be\u0003\b\u0004\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u001e\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u009d\u0001\u0000\u0000\u0000\u00c6\u00a0\u0001\u0000\u0000"+
		"\u0000\u00c6\u00a3\u0001\u0000\u0000\u0000\u00c6\u00a6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00a9\u0001\u0000\u0000\u0000\u00c6\u00ac\u0001\u0000\u0000"+
		"\u0000\u00c6\u00af\u0001\u0000\u0000\u0000\u00c6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000"+
		"\u00cc\u000b\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000"+
		"\u00ce\r\u0001\u0000\u0000\u0000\u0013\u0013\u0019\u001f+.=ASVnx\u0080"+
		"\u0084\u009b\u00b5\u00bf\u00c2\u00c6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}