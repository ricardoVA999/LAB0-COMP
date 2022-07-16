// Generated from YAPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LOOP", "POOL", 
			"THEN", "WHILE", "NEW", "NOT", "LET", "FALSE", "TRUE", "SELF", "SELF_TYPE", 
			"BOOL", "INT", "STRING", "VOID", "SEMICOLON", "COLON", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "LPAR", "RPAR", "COMMA", "QUOTES", "APOSTROPHE", 
			"ADD", "SUB", "MULTIPLY", "DIVIDE", "NEGATION", "LESS_OP", "LESS_EQ_OP", 
			"EQUAL_OP", "DOT", "AT", "ASIGN", "TYPE_ID", "OBJ_ID", "ALPHA", "INTEGER", 
			"DIGIT", "CAP", "ALPHA_NUM", "STRING_LIT", "BOOL_LIT", "COMMENT", "OTHER_COMMENT", 
			"NEWLINE", "WHITESPACE", "ERR_TOKEN"
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


	public YAPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000:\u01b3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0080\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u008a\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0090\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0096\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u009c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ae\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bc\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00c6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00da\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00e6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ee\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00f6\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00fe\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0005-\u0162\b-\n-"+
		"\f-\u0165\t-\u0001.\u0001.\u0001/\u0004/\u016a\b/\u000b/\f/\u016b\u0001"+
		"0\u00010\u00011\u00011\u00012\u00012\u00032\u0174\b2\u00013\u00013\u0001"+
		"3\u00013\u00053\u017a\b3\n3\f3\u017d\t3\u00013\u00013\u00014\u00014\u0003"+
		"4\u0183\b4\u00015\u00015\u00015\u00015\u00055\u0189\b5\n5\f5\u018c\t5"+
		"\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00056\u0196"+
		"\b6\n6\f6\u0199\t6\u00016\u00016\u00016\u00016\u00016\u00017\u00037\u01a1"+
		"\b7\u00017\u00017\u00047\u01a5\b7\u000b7\f7\u01a6\u00017\u00017\u0001"+
		"8\u00048\u01ac\b8\u000b8\f8\u01ad\u00018\u00018\u00019\u00019\u0002\u018a"+
		"\u0197\u0000:\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:\u0001\u0000\u0006"+
		"\u0003\u0000AZ__az\u0001\u000009\u0002\u0000AZ__\b\u0000\"\"\'\'\\\\b"+
		"bffnnrrtt\u0004\u0000\n\n\r\r\"\"\\\\\u0003\u0000\b\n\f\r  \u01cc\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0001\u007f"+
		"\u0001\u0000\u0000\u0000\u0003\u0089\u0001\u0000\u0000\u0000\u0005\u008f"+
		"\u0001\u0000\u0000\u0000\u0007\u0095\u0001\u0000\u0000\u0000\t\u009b\u0001"+
		"\u0000\u0000\u0000\u000b\u00ad\u0001\u0000\u0000\u0000\r\u00bb\u0001\u0000"+
		"\u0000\u0000\u000f\u00c5\u0001\u0000\u0000\u0000\u0011\u00cf\u0001\u0000"+
		"\u0000\u0000\u0013\u00d9\u0001\u0000\u0000\u0000\u0015\u00e5\u0001\u0000"+
		"\u0000\u0000\u0017\u00ed\u0001\u0000\u0000\u0000\u0019\u00f5\u0001\u0000"+
		"\u0000\u0000\u001b\u00fd\u0001\u0000\u0000\u0000\u001d\u00ff\u0001\u0000"+
		"\u0000\u0000\u001f\u0105\u0001\u0000\u0000\u0000!\u010a\u0001\u0000\u0000"+
		"\u0000#\u010f\u0001\u0000\u0000\u0000%\u0119\u0001\u0000\u0000\u0000\'"+
		"\u011e\u0001\u0000\u0000\u0000)\u0122\u0001\u0000\u0000\u0000+\u0129\u0001"+
		"\u0000\u0000\u0000-\u012e\u0001\u0000\u0000\u0000/\u0130\u0001\u0000\u0000"+
		"\u00001\u0132\u0001\u0000\u0000\u00003\u0134\u0001\u0000\u0000\u00005"+
		"\u0136\u0001\u0000\u0000\u00007\u0138\u0001\u0000\u0000\u00009\u013a\u0001"+
		"\u0000\u0000\u0000;\u013c\u0001\u0000\u0000\u0000=\u013e\u0001\u0000\u0000"+
		"\u0000?\u0140\u0001\u0000\u0000\u0000A\u0142\u0001\u0000\u0000\u0000C"+
		"\u0144\u0001\u0000\u0000\u0000E\u0146\u0001\u0000\u0000\u0000G\u0148\u0001"+
		"\u0000\u0000\u0000I\u014a\u0001\u0000\u0000\u0000K\u014c\u0001\u0000\u0000"+
		"\u0000M\u014e\u0001\u0000\u0000\u0000O\u0150\u0001\u0000\u0000\u0000Q"+
		"\u0153\u0001\u0000\u0000\u0000S\u0155\u0001\u0000\u0000\u0000U\u0157\u0001"+
		"\u0000\u0000\u0000W\u0159\u0001\u0000\u0000\u0000Y\u015c\u0001\u0000\u0000"+
		"\u0000[\u015f\u0001\u0000\u0000\u0000]\u0166\u0001\u0000\u0000\u0000_"+
		"\u0169\u0001\u0000\u0000\u0000a\u016d\u0001\u0000\u0000\u0000c\u016f\u0001"+
		"\u0000\u0000\u0000e\u0173\u0001\u0000\u0000\u0000g\u0175\u0001\u0000\u0000"+
		"\u0000i\u0182\u0001\u0000\u0000\u0000k\u0184\u0001\u0000\u0000\u0000m"+
		"\u0191\u0001\u0000\u0000\u0000o\u01a4\u0001\u0000\u0000\u0000q\u01ab\u0001"+
		"\u0000\u0000\u0000s\u01b1\u0001\u0000\u0000\u0000uv\u0005C\u0000\u0000"+
		"vw\u0005L\u0000\u0000wx\u0005A\u0000\u0000xy\u0005S\u0000\u0000y\u0080"+
		"\u0005S\u0000\u0000z{\u0005c\u0000\u0000{|\u0005l\u0000\u0000|}\u0005"+
		"a\u0000\u0000}~\u0005s\u0000\u0000~\u0080\u0005s\u0000\u0000\u007fu\u0001"+
		"\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u0080\u0002\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005E\u0000\u0000\u0082\u0083\u0005L\u0000\u0000"+
		"\u0083\u0084\u0005S\u0000\u0000\u0084\u008a\u0005E\u0000\u0000\u0085\u0086"+
		"\u0005e\u0000\u0000\u0086\u0087\u0005l\u0000\u0000\u0087\u0088\u0005s"+
		"\u0000\u0000\u0088\u008a\u0005e\u0000\u0000\u0089\u0081\u0001\u0000\u0000"+
		"\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u0004\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005F\u0000\u0000\u008c\u0090\u0005I\u0000\u0000\u008d"+
		"\u008e\u0005f\u0000\u0000\u008e\u0090\u0005i\u0000\u0000\u008f\u008b\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0006\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005I\u0000\u0000\u0092\u0096\u0005F\u0000"+
		"\u0000\u0093\u0094\u0005i\u0000\u0000\u0094\u0096\u0005f\u0000\u0000\u0095"+
		"\u0091\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\b\u0001\u0000\u0000\u0000\u0097\u0098\u0005I\u0000\u0000\u0098\u009c"+
		"\u0005N\u0000\u0000\u0099\u009a\u0005i\u0000\u0000\u009a\u009c\u0005n"+
		"\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\n\u0001\u0000\u0000\u0000\u009d\u009e\u0005I\u0000"+
		"\u0000\u009e\u009f\u0005N\u0000\u0000\u009f\u00a0\u0005H\u0000\u0000\u00a0"+
		"\u00a1\u0005E\u0000\u0000\u00a1\u00a2\u0005R\u0000\u0000\u00a2\u00a3\u0005"+
		"I\u0000\u0000\u00a3\u00a4\u0005T\u0000\u0000\u00a4\u00ae\u0005S\u0000"+
		"\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7"+
		"\u00a8\u0005h\u0000\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9\u00aa\u0005"+
		"r\u0000\u0000\u00aa\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005t\u0000"+
		"\u0000\u00ac\u00ae\u0005s\u0000\u0000\u00ad\u009d\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ae\f\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005I\u0000\u0000\u00b0\u00b1\u0005S\u0000\u0000\u00b1\u00b2\u0005"+
		"V\u0000\u0000\u00b2\u00b3\u0005O\u0000\u0000\u00b3\u00b4\u0005I\u0000"+
		"\u0000\u00b4\u00bc\u0005D\u0000\u0000\u00b5\u00b6\u0005i\u0000\u0000\u00b6"+
		"\u00b7\u0005s\u0000\u0000\u00b7\u00b8\u0005v\u0000\u0000\u00b8\u00b9\u0005"+
		"o\u0000\u0000\u00b9\u00ba\u0005i\u0000\u0000\u00ba\u00bc\u0005d\u0000"+
		"\u0000\u00bb\u00af\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bc\u000e\u0001\u0000\u0000\u0000\u00bd\u00be\u0005L\u0000\u0000"+
		"\u00be\u00bf\u0005O\u0000\u0000\u00bf\u00c0\u0005O\u0000\u0000\u00c0\u00c6"+
		"\u0005P\u0000\u0000\u00c1\u00c2\u0005l\u0000\u0000\u00c2\u00c3\u0005o"+
		"\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4\u00c6\u0005p\u0000\u0000"+
		"\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c6\u0010\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005P\u0000\u0000\u00c8"+
		"\u00c9\u0005O\u0000\u0000\u00c9\u00ca\u0005O\u0000\u0000\u00ca\u00d0\u0005"+
		"L\u0000\u0000\u00cb\u00cc\u0005p\u0000\u0000\u00cc\u00cd\u0005o\u0000"+
		"\u0000\u00cd\u00ce\u0005o\u0000\u0000\u00ce\u00d0\u0005l\u0000\u0000\u00cf"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00d0"+
		"\u0012\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005T\u0000\u0000\u00d2\u00d3"+
		"\u0005H\u0000\u0000\u00d3\u00d4\u0005E\u0000\u0000\u00d4\u00da\u0005N"+
		"\u0000\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6\u00d7\u0005h\u0000\u0000"+
		"\u00d7\u00d8\u0005e\u0000\u0000\u00d8\u00da\u0005n\u0000\u0000\u00d9\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00da\u0014"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005W\u0000\u0000\u00dc\u00dd\u0005"+
		"H\u0000\u0000\u00dd\u00de\u0005I\u0000\u0000\u00de\u00df\u0005L\u0000"+
		"\u0000\u00df\u00e6\u0005E\u0000\u0000\u00e0\u00e1\u0005w\u0000\u0000\u00e1"+
		"\u00e2\u0005h\u0000\u0000\u00e2\u00e3\u0005i\u0000\u0000\u00e3\u00e4\u0005"+
		"l\u0000\u0000\u00e4\u00e6\u0005e\u0000\u0000\u00e5\u00db\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e6\u0016\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005N\u0000\u0000\u00e8\u00e9\u0005E\u0000\u0000\u00e9"+
		"\u00ee\u0005W\u0000\u0000\u00ea\u00eb\u0005n\u0000\u0000\u00eb\u00ec\u0005"+
		"e\u0000\u0000\u00ec\u00ee\u0005w\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u0018\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005N\u0000\u0000\u00f0\u00f1\u0005O\u0000\u0000\u00f1"+
		"\u00f6\u0005T\u0000\u0000\u00f2\u00f3\u0005n\u0000\u0000\u00f3\u00f4\u0005"+
		"o\u0000\u0000\u00f4\u00f6\u0005t\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u001a\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005L\u0000\u0000\u00f8\u00f9\u0005E\u0000\u0000\u00f9"+
		"\u00fe\u0005T\u0000\u0000\u00fa\u00fb\u0005l\u0000\u0000\u00fb\u00fc\u0005"+
		"e\u0000\u0000\u00fc\u00fe\u0005t\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fe\u001c\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005f\u0000\u0000\u0100\u0101\u0005a\u0000\u0000\u0101"+
		"\u0102\u0005l\u0000\u0000\u0102\u0103\u0005s\u0000\u0000\u0103\u0104\u0005"+
		"e\u0000\u0000\u0104\u001e\u0001\u0000\u0000\u0000\u0105\u0106\u0005t\u0000"+
		"\u0000\u0106\u0107\u0005r\u0000\u0000\u0107\u0108\u0005u\u0000\u0000\u0108"+
		"\u0109\u0005e\u0000\u0000\u0109 \u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"s\u0000\u0000\u010b\u010c\u0005e\u0000\u0000\u010c\u010d\u0005l\u0000"+
		"\u0000\u010d\u010e\u0005f\u0000\u0000\u010e\"\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005S\u0000\u0000\u0110\u0111\u0005E\u0000\u0000\u0111\u0112"+
		"\u0005L\u0000\u0000\u0112\u0113\u0005F\u0000\u0000\u0113\u0114\u0005_"+
		"\u0000\u0000\u0114\u0115\u0005T\u0000\u0000\u0115\u0116\u0005Y\u0000\u0000"+
		"\u0116\u0117\u0005P\u0000\u0000\u0117\u0118\u0005E\u0000\u0000\u0118$"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005B\u0000\u0000\u011a\u011b\u0005"+
		"o\u0000\u0000\u011b\u011c\u0005o\u0000\u0000\u011c\u011d\u0005l\u0000"+
		"\u0000\u011d&\u0001\u0000\u0000\u0000\u011e\u011f\u0005I\u0000\u0000\u011f"+
		"\u0120\u0005n\u0000\u0000\u0120\u0121\u0005t\u0000\u0000\u0121(\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005S\u0000\u0000\u0123\u0124\u0005t\u0000"+
		"\u0000\u0124\u0125\u0005r\u0000\u0000\u0125\u0126\u0005i\u0000\u0000\u0126"+
		"\u0127\u0005n\u0000\u0000\u0127\u0128\u0005g\u0000\u0000\u0128*\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005v\u0000\u0000\u012a\u012b\u0005o\u0000"+
		"\u0000\u012b\u012c\u0005i\u0000\u0000\u012c\u012d\u0005d\u0000\u0000\u012d"+
		",\u0001\u0000\u0000\u0000\u012e\u012f\u0005;\u0000\u0000\u012f.\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005:\u0000\u0000\u01310\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005{\u0000\u0000\u01332\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005}\u0000\u0000\u01354\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		"[\u0000\u0000\u01376\u0001\u0000\u0000\u0000\u0138\u0139\u0005]\u0000"+
		"\u0000\u01398\u0001\u0000\u0000\u0000\u013a\u013b\u0005(\u0000\u0000\u013b"+
		":\u0001\u0000\u0000\u0000\u013c\u013d\u0005)\u0000\u0000\u013d<\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005,\u0000\u0000\u013f>\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005\"\u0000\u0000\u0141@\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005\'\u0000\u0000\u0143B\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005+\u0000\u0000\u0145D\u0001\u0000\u0000\u0000\u0146\u0147\u0005"+
		"-\u0000\u0000\u0147F\u0001\u0000\u0000\u0000\u0148\u0149\u0005*\u0000"+
		"\u0000\u0149H\u0001\u0000\u0000\u0000\u014a\u014b\u0005/\u0000\u0000\u014b"+
		"J\u0001\u0000\u0000\u0000\u014c\u014d\u0005~\u0000\u0000\u014dL\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005<\u0000\u0000\u014fN\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005<\u0000\u0000\u0151\u0152\u0005=\u0000\u0000\u0152"+
		"P\u0001\u0000\u0000\u0000\u0153\u0154\u0005=\u0000\u0000\u0154R\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005.\u0000\u0000\u0156T\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005@\u0000\u0000\u0158V\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005<\u0000\u0000\u015a\u015b\u0005-\u0000\u0000\u015bX\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0003c1\u0000\u015d\u015e\u0003[-\u0000"+
		"\u015eZ\u0001\u0000\u0000\u0000\u015f\u0163\u0003].\u0000\u0160\u0162"+
		"\u0003e2\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\\\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0007\u0000\u0000\u0000\u0167^\u0001\u0000\u0000\u0000"+
		"\u0168\u016a\u0007\u0001\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c`\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0007\u0001\u0000\u0000\u016eb\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0007\u0002\u0000\u0000\u0170d\u0001\u0000\u0000\u0000\u0171\u0174\u0003"+
		"].\u0000\u0172\u0174\u0003a0\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0174f\u0001\u0000\u0000\u0000\u0175"+
		"\u017b\u0005\"\u0000\u0000\u0176\u0177\u0005\\\u0000\u0000\u0177\u017a"+
		"\u0007\u0003\u0000\u0000\u0178\u017a\b\u0004\u0000\u0000\u0179\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0005\"\u0000\u0000\u017fh\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0003\u001f\u000f\u0000\u0181\u0183\u0003\u001d"+
		"\u000e\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183j\u0001\u0000\u0000\u0000\u0184\u0185\u0005-\u0000\u0000"+
		"\u0185\u0186\u0005-\u0000\u0000\u0186\u018a\u0001\u0000\u0000\u0000\u0187"+
		"\u0189\t\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0005\n\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u00065\u0000\u0000\u0190l\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005.\u0000\u0000\u0192\u0193\u0005.\u0000\u0000\u0193"+
		"\u0197\u0001\u0000\u0000\u0000\u0194\u0196\t\u0000\u0000\u0000\u0195\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019a"+
		"\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0005.\u0000\u0000\u019b\u019c\u0005.\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u00066\u0000\u0000\u019en\u0001\u0000\u0000\u0000"+
		"\u019f\u01a1\u0005\r\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a5\u0005\n\u0000\u0000\u01a3\u01a5\u0005\r\u0000\u0000\u01a4\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u00067\u0000\u0000\u01a9p\u0001\u0000\u0000\u0000\u01aa\u01ac\u0007\u0005"+
		"\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u00068\u0000"+
		"\u0000\u01b0r\u0001\u0000\u0000\u0000\u01b1\u01b2\t\u0000\u0000\u0000"+
		"\u01b2t\u0001\u0000\u0000\u0000\u001b\u0000\u007f\u0089\u008f\u0095\u009b"+
		"\u00ad\u00bb\u00c5\u00cf\u00d9\u00e5\u00ed\u00f5\u00fd\u0163\u016b\u0173"+
		"\u0179\u017b\u0182\u018a\u0197\u01a0\u01a4\u01a6\u01ad\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}