// Generated from C:/Users/x1762/Desktop/Lab/src/L2\CmmLexer.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INT=2, FLOAT=3, HEX=4, OCT=5, WS=6, STRUCT=7, RETURN=8, IF=9, 
		ELSE=10, WHILE=11, BREAK=12, ID=13, SEMI=14, COMMA=15, ASSIGNOP=16, RELOP=17, 
		PLUS=18, MINUS=19, STAR=20, DIV=21, AND=22, OR=23, DOT=24, NOT=25, LP=26, 
		RP=27, LB=28, RB=29, LC=30, RC=31, SL_COMMENT=32, ML_COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "INT", "FLOAT", "HEX", "OCT", "WS", "STRUCT", "RETURN", "IF", 
			"ELSE", "WHILE", "BREAK", "ID", "SEMI", "COMMA", "ASSIGNOP", "RELOP", 
			"PLUS", "MINUS", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", "RP", 
			"LB", "RB", "LC", "RC", "SL_COMMENT", "ML_COMMENT", "DIGIT", "LEETER", 
			"WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'struct'", "'return'", "'if'", 
			"'else'", "'while'", "'break'", null, "';'", "','", "'='", null, "'+'", 
			"'-'", "'*'", "'/'", "'&&'", "'||'", "'.'", "'!'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INT", "FLOAT", "HEX", "OCT", "WS", "STRUCT", "RETURN", 
			"IF", "ELSE", "WHILE", "BREAK", "ID", "SEMI", "COMMA", "ASSIGNOP", "RELOP", 
			"PLUS", "MINUS", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", "RP", 
			"LB", "RB", "LC", "RC", "SL_COMMENT", "ML_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2T\n\2"+
		"\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\5\3^\n\3\3\4\6\4a\n\4\r\4\16\4b"+
		"\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\5\4n\n\4\3\4\7\4q\n\4\f\4\16"+
		"\4t\13\4\5\4v\n\4\3\4\3\4\6\4z\n\4\r\4\16\4{\3\4\3\4\5\4\u0080\n\4\3\4"+
		"\7\4\u0083\n\4\f\4\16\4\u0086\13\4\5\4\u0088\n\4\3\4\6\4\u008b\n\4\r\4"+
		"\16\4\u008c\3\4\3\4\6\4\u0091\n\4\r\4\16\4\u0092\5\4\u0095\n\4\3\5\3\5"+
		"\3\5\6\5\u009a\n\5\r\5\16\5\u009b\3\6\3\6\6\6\u00a0\n\6\r\6\16\6\u00a1"+
		"\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00cf\n\16"+
		"\3\16\7\16\u00d2\n\16\f\16\16\16\u00d5\13\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e6\n\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3!\7!\u010a\n!\f!\16!\u010d\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\7\"\u0117\n\"\f\"\16\"\u011a\13\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%"+
		"\3%\4\u010b\u0118\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2\3\2\r\3\2\63;\3\2\62;\4\2GGgg\4"+
		"\2--//\4\2ZZzz\5\2\62;CHch\3\2\629\5\2\13\f\17\17\"\"\4\2>>@@\4\2C\\c"+
		"|\6\2\62;C\\aac|\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\3S\3\2\2\2\5]\3\2\2\2\7\u0094\3\2\2\2\t\u0096\3\2\2\2\13\u009d\3\2"+
		"\2\2\r\u00a4\3\2\2\2\17\u00aa\3\2\2\2\21\u00b1\3\2\2\2\23\u00b8\3\2\2"+
		"\2\25\u00bb\3\2\2\2\27\u00c0\3\2\2\2\31\u00c6\3\2\2\2\33\u00ce\3\2\2\2"+
		"\35\u00d6\3\2\2\2\37\u00d8\3\2\2\2!\u00da\3\2\2\2#\u00e5\3\2\2\2%\u00e7"+
		"\3\2\2\2\'\u00e9\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2"+
		"/\u00f2\3\2\2\2\61\u00f5\3\2\2\2\63\u00f7\3\2\2\2\65\u00f9\3\2\2\2\67"+
		"\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0101\3\2\2\2?\u0103\3\2"+
		"\2\2A\u0105\3\2\2\2C\u0112\3\2\2\2E\u0120\3\2\2\2G\u0122\3\2\2\2I\u0124"+
		"\3\2\2\2KL\7k\2\2LM\7p\2\2MT\7v\2\2NO\7h\2\2OP\7n\2\2PQ\7q\2\2QR\7c\2"+
		"\2RT\7v\2\2SK\3\2\2\2SN\3\2\2\2T\4\3\2\2\2U^\7\62\2\2VZ\t\2\2\2WY\t\3"+
		"\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]U\3"+
		"\2\2\2]V\3\2\2\2^\6\3\2\2\2_a\5E#\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2cd\3\2\2\2dh\7\60\2\2eg\5E#\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2iu\3\2\2\2jh\3\2\2\2km\t\4\2\2ln\t\5\2\2ml\3\2\2\2mn\3\2\2\2nr\3"+
		"\2\2\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3"+
		"\2\2\2uk\3\2\2\2uv\3\2\2\2v\u0095\3\2\2\2wy\7\60\2\2xz\5E#\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0087\3\2\2\2}\177\t\4\2\2~\u0080\t\5"+
		"\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084\3\2\2\2\u0081\u0083\t"+
		"\3\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087}\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0095\3\2\2\2\u0089\u008b\5E#\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\7\60\2\2\u008f\u0091\5E#\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094`\3\2\2\2\u0094w\3\2\2\2\u0094\u008a\3\2\2\2\u0095"+
		"\b\3\2\2\2\u0096\u0097\7\62\2\2\u0097\u0099\t\6\2\2\u0098\u009a\t\7\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\n\3\2\2\2\u009d\u009f\7\62\2\2\u009e\u00a0\t\b\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\f\3\2\2\2\u00a3\u00a5\t\t\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\7\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7e\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7"+
		"\22\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\26\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7"+
		"k\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\30\3\2\2\2\u00c6\u00c7"+
		"\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7m\2\2\u00cb\32\3\2\2\2\u00cc\u00cf\5G$\2\u00cd\u00cf\7a\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\5I"+
		"%\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\34\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7=\2\2"+
		"\u00d7\36\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9 \3\2\2\2\u00da\u00db\7?\2\2"+
		"\u00db\"\3\2\2\2\u00dc\u00e6\t\n\2\2\u00dd\u00de\7@\2\2\u00de\u00e6\7"+
		"?\2\2\u00df\u00e0\7>\2\2\u00e0\u00e6\7?\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e6"+
		"\7?\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e6\7?\2\2\u00e5\u00dc\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7/\2"+
		"\2\u00ea(\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7\61\2"+
		"\2\u00ee,\3\2\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\7(\2\2\u00f1.\3\2\2\2"+
		"\u00f2\u00f3\7~\2\2\u00f3\u00f4\7~\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\7"+
		"\60\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\64\3\2\2\2\u00f9\u00fa"+
		"\7*\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7+\2\2\u00fc8\3\2\2\2\u00fd\u00fe"+
		"\7]\2\2\u00fe:\3\2\2\2\u00ff\u0100\7_\2\2\u0100<\3\2\2\2\u0101\u0102\7"+
		"}\2\2\u0102>\3\2\2\2\u0103\u0104\7\177\2\2\u0104@\3\2\2\2\u0105\u0106"+
		"\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u010b\3\2\2\2\u0108\u010a\13\2\2"+
		"\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\f\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b!\2\2\u0111B\3\2\2\2\u0112\u0113\7\61\2\2"+
		"\u0113\u0114\7,\2\2\u0114\u0118\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d\7\61"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\"\2\2\u011fD\3\2\2\2\u0120\u0121"+
		"\t\3\2\2\u0121F\3\2\2\2\u0122\u0123\t\13\2\2\u0123H\3\2\2\2\u0124\u0125"+
		"\t\f\2\2\u0125J\3\2\2\2\32\2SZ]bhmru{\177\u0084\u0087\u008c\u0092\u0094"+
		"\u009b\u00a1\u00a6\u00ce\u00d3\u00e5\u010b\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}