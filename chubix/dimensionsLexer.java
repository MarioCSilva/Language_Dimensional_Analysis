// Generated from dimensions.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dimensionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, DOUBLE=15, WS=16, LINE_COMMENT=17, 
		ERROR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "DOUBLE", "WS", "LINE_COMMENT", 
			"ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'dim'", "'('", "':'", "')'", "'unit'", "'+'", "'-'", "'^'", 
			"'*'", "'/'", "'Integer'", "'Double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "DOUBLE", "WS", "LINE_COMMENT", "ERROR"
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


	public dimensionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dimensions.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17T\n\17\f"+
		"\17\16\17W\13\17\3\20\5\20Z\n\20\3\20\6\20]\n\20\r\20\16\20^\3\20\3\20"+
		"\6\20c\n\20\r\20\16\20d\5\20g\n\20\3\21\6\21j\n\21\r\21\16\21k\3\21\3"+
		"\21\3\22\3\22\7\22r\n\22\f\22\16\22u\13\22\3\22\5\22x\n\22\3\22\3\22\3"+
		"\23\3\23\3s\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"--//\3\2\62;\5\2\13\f\17\17\"\"\3\3\f\f\2\u0083\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17"+
		"8\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@\3\2\2\2\31B\3\2\2\2"+
		"\33J\3\2\2\2\35Q\3\2\2\2\37Y\3\2\2\2!i\3\2\2\2#o\3\2\2\2%{\3\2\2\2\'("+
		"\7=\2\2(\4\3\2\2\2)*\7f\2\2*+\7k\2\2+,\7o\2\2,\6\3\2\2\2-.\7*\2\2.\b\3"+
		"\2\2\2/\60\7<\2\2\60\n\3\2\2\2\61\62\7+\2\2\62\f\3\2\2\2\63\64\7w\2\2"+
		"\64\65\7p\2\2\65\66\7k\2\2\66\67\7v\2\2\67\16\3\2\2\289\7-\2\29\20\3\2"+
		"\2\2:;\7/\2\2;\22\3\2\2\2<=\7`\2\2=\24\3\2\2\2>?\7,\2\2?\26\3\2\2\2@A"+
		"\7\61\2\2A\30\3\2\2\2BC\7K\2\2CD\7p\2\2DE\7v\2\2EF\7g\2\2FG\7i\2\2GH\7"+
		"g\2\2HI\7t\2\2I\32\3\2\2\2JK\7F\2\2KL\7q\2\2LM\7w\2\2MN\7d\2\2NO\7n\2"+
		"\2OP\7g\2\2P\34\3\2\2\2QU\t\2\2\2RT\t\3\2\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2V\36\3\2\2\2WU\3\2\2\2XZ\t\4\2\2YX\3\2\2\2YZ\3\2\2\2Z\\"+
		"\3\2\2\2[]\t\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_f\3\2\2\2"+
		"`b\7\60\2\2ac\t\5\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2"+
		"\2f`\3\2\2\2fg\3\2\2\2g \3\2\2\2hj\t\6\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2lm\3\2\2\2mn\b\21\2\2n\"\3\2\2\2os\7%\2\2pr\13\2\2\2qp\3\2"+
		"\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2vx\t\7\2\2wv\3\2"+
		"\2\2xy\3\2\2\2yz\b\22\2\2z$\3\2\2\2{|\13\2\2\2|&\3\2\2\2\13\2UY^dfksw"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}