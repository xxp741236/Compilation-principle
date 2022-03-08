// Generated from C:/Users/x1762/Desktop/Lab/src/main/java/L2\CmmLexer.g4 by ANTLR 4.9.2
package L2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INT=2, FLOAT=3, WS=4, STRUCT=5, RETURN=6, IF=7, ELSE=8, WHILE=9, 
		BREAK=10, ID=11, SEMI=12, COMMA=13, ASSIGNOP=14, RELOP=15, PLUS=16, MINUS=17, 
		STAR=18, DIV=19, AND=20, OR=21, DOT=22, NOT=23, LP=24, RP=25, LB=26, RB=27, 
		LC=28, RC=29, SL_COMMENT=30, ML_COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "INT", "FLOAT", "WS", "STRUCT", "RETURN", "IF", "ELSE", "WHILE", 
			"BREAK", "ID", "SEMI", "COMMA", "ASSIGNOP", "RELOP", "PLUS", "MINUS", 
			"STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", "RP", "LB", "RB", "LC", 
			"RC", "SL_COMMENT", "ML_COMMENT", "DIGIT", "LEETER", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'struct'", "'return'", "'if'", "'else'", 
			"'while'", "'break'", null, "';'", "','", "'='", null, "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'.'", "'!'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INT", "FLOAT", "WS", "STRUCT", "RETURN", "IF", "ELSE", 
			"WHILE", "BREAK", "ID", "SEMI", "COMMA", "ASSIGNOP", "RELOP", "PLUS", 
			"MINUS", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", "RP", "LB", 
			"RB", "LC", "RC", "SL_COMMENT", "ML_COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmmLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2P\n\2\3\3\3\3\3\3"+
		"\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\6\3]\n\3\r\3\16\3^\3\3\3\3\6\3c\n"+
		"\3\r\3\16\3d\5\3g\n\3\3\4\6\4j\n\4\r\4\16\4k\3\4\3\4\7\4p\n\4\f\4\16\4"+
		"s\13\4\3\4\3\4\5\4w\n\4\3\4\7\4z\n\4\f\4\16\4}\13\4\5\4\177\n\4\3\4\3"+
		"\4\6\4\u0083\n\4\r\4\16\4\u0084\3\4\3\4\5\4\u0089\n\4\3\4\7\4\u008c\n"+
		"\4\f\4\16\4\u008f\13\4\5\4\u0091\n\4\3\4\6\4\u0094\n\4\r\4\16\4\u0095"+
		"\3\4\3\4\6\4\u009a\n\4\r\4\16\4\u009b\5\4\u009e\n\4\3\5\6\5\u00a1\n\5"+
		"\r\5\16\5\u00a2\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00cb\n\f\3\f\7\f\u00ce\n\f\f\f"+
		"\16\f\u00d1\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00e2\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\7\37"+
		"\u0106\n\37\f\37\16\37\u0109\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 "+
		"\u0113\n \f \16 \u0116\13 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\4\u0107"+
		"\u0114\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\2C\2E\2\3\2\r\3\2\63;\3\2\62;\4\2ZZzz\5\2\62;CHch\3\2"+
		"\629\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2>>@@\4\2C\\c|\6\2\62;C\\aa"+
		"c|\2\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3O\3\2\2\2\5f\3\2\2\2\7\u009d\3"+
		"\2\2\2\t\u00a0\3\2\2\2\13\u00a6\3\2\2\2\r\u00ad\3\2\2\2\17\u00b4\3\2\2"+
		"\2\21\u00b7\3\2\2\2\23\u00bc\3\2\2\2\25\u00c2\3\2\2\2\27\u00ca\3\2\2\2"+
		"\31\u00d2\3\2\2\2\33\u00d4\3\2\2\2\35\u00d6\3\2\2\2\37\u00e1\3\2\2\2!"+
		"\u00e3\3\2\2\2#\u00e5\3\2\2\2%\u00e7\3\2\2\2\'\u00e9\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00ee\3\2\2\2-\u00f1\3\2\2\2/\u00f3\3\2\2\2\61\u00f5\3\2\2\2\63"+
		"\u00f7\3\2\2\2\65\u00f9\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0101\3\2\2\2?\u010e\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E"+
		"\u0120\3\2\2\2GH\7k\2\2HI\7p\2\2IP\7v\2\2JK\7h\2\2KL\7n\2\2LM\7q\2\2M"+
		"N\7c\2\2NP\7v\2\2OG\3\2\2\2OJ\3\2\2\2P\4\3\2\2\2Qg\7\62\2\2RV\t\2\2\2"+
		"SU\t\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2Wg\3\2\2\2XV\3\2\2\2"+
		"YZ\7\62\2\2Z\\\t\4\2\2[]\t\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_g\3\2\2\2`b\7\62\2\2ac\t\6\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2eg\3\2\2\2fQ\3\2\2\2fR\3\2\2\2fY\3\2\2\2f`\3\2\2\2g\6\3\2\2\2hj"+
		"\5A!\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mq\7\60\2\2np"+
		"\5A!\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r~\3\2\2\2sq\3\2\2\2tv\t"+
		"\7\2\2uw\t\b\2\2vu\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\t\3\2\2yx\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~t\3\2\2\2~\177\3\2\2"+
		"\2\177\u009e\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5A!\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0090\3\2\2\2\u0086\u0088\t\7\2\2\u0087\u0089\t\b\2\2\u0088\u0087\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008d\3\2\2\2\u008a\u008c\t\3\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0086\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u009e\3\2\2\2\u0092\u0094\5A!\2\u0093\u0092\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\7\60\2\2\u0098\u009a\5A!\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009di\3\2\2\2\u009d\u0080\3\2\2\2\u009d\u0093\3\2\2\2\u009e\b\3"+
		"\2\2\2\u009f\u00a1\t\t\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\5"+
		"\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\f\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\16\3\2\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7h\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\22\3\2\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7"+
		"t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7m\2\2\u00c7\26"+
		"\3\2\2\2\u00c8\u00cb\5C\"\2\u00c9\u00cb\7a\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\5E#\2\u00cd\u00cc\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\30"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7=\2\2\u00d3\32\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\36\3\2\2\2\u00d8"+
		"\u00e2\t\n\2\2\u00d9\u00da\7@\2\2\u00da\u00e2\7?\2\2\u00db\u00dc\7>\2"+
		"\2\u00dc\u00e2\7?\2\2\u00dd\u00de\7?\2\2\u00de\u00e2\7?\2\2\u00df\u00e0"+
		"\7#\2\2\u00e0\u00e2\7?\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2 \3\2\2\2"+
		"\u00e3\u00e4\7-\2\2\u00e4\"\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6$\3\2\2\2"+
		"\u00e7\u00e8\7,\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea(\3\2\2\2"+
		"\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7~\2"+
		"\2\u00ef\u00f0\7~\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2.\3\2\2"+
		"\2\u00f3\u00f4\7#\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6\62\3\2"+
		"\2\2\u00f7\u00f8\7+\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7]\2\2\u00fa\66\3"+
		"\2\2\2\u00fb\u00fc\7_\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7}\2\2\u00fe:\3\2"+
		"\2\2\u00ff\u0100\7\177\2\2\u0100<\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103"+
		"\7\61\2\2\u0103\u0107\3\2\2\2\u0104\u0106\13\2\2\2\u0105\u0104\3\2\2\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\f\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b\37\2\2\u010d>\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\7,\2\2"+
		"\u0110\u0114\3\2\2\2\u0111\u0113\13\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7,\2\2\u0118\u0119\7\61\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\b \2\2\u011b@\3\2\2\2\u011c\u011d\t\3\2\2\u011dB\3\2"+
		"\2\2\u011e\u011f\t\13\2\2\u011fD\3\2\2\2\u0120\u0121\t\f\2\2\u0121F\3"+
		"\2\2\2\32\2OV^dfkqv{~\u0084\u0088\u008d\u0090\u0095\u009b\u009d\u00a2"+
		"\u00ca\u00cf\u00e1\u0107\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}