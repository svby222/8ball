package net.blustone.eightball;// Generated from E:\Projects\Other\eightball\src\main\resources\Eightball.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightballLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPLICIT_PAGE=1, COLON=2, SEMI=3, LP=4, RP=5, COMMA=6, BEGIN_PAGE=7, END=8, 
		IMAGE=9, FLASH=10, TEXT=11, LOG=12, SCHEME=13, ID=14, INT=15, WS=16, STRING=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IMPLICIT_PAGE", "':'", "';'", "'('", "')'", "','", "'page'", "'end'", 
		"'image'", "'flash'", "'text'", "'log'", "'scheme'", "ID", "INT", "WS", 
		"STRING"
	};
	public static final String[] ruleNames = {
		"IMPLICIT_PAGE", "COLON", "SEMI", "LP", "RP", "COMMA", "BEGIN_PAGE", "END", 
		"IMAGE", "FLASH", "TEXT", "LOG", "SCHEME", "ID", "INT", "WS", "STRING", 
		"HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};


	public EightballLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eightball.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\7\17f\n\17\f\17\16\17i\13\17\3\20\6\20l\n\20\r\20\16\20m\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\5\24\u0084\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u008f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\2#\23\1%\2\1\'\2\1)\2\1"+
		"+\2\1\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2$$^^\5\2\62"+
		";CHch\n\2$$))^^ddhhppttvv\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3-\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2"+
		"\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23G\3\2\2"+
		"\2\25M\3\2\2\2\27S\3\2\2\2\31X\3\2\2\2\33\\\3\2\2\2\35c\3\2\2\2\37k\3"+
		"\2\2\2!o\3\2\2\2#s\3\2\2\2%}\3\2\2\2\'\u0083\3\2\2\2)\u008e\3\2\2\2+\u0090"+
		"\3\2\2\2-.\7r\2\2./\7c\2\2/\60\7i\2\2\60\61\7g\2\2\61\62\3\2\2\2\62\63"+
		"\4\62;\2\63\4\3\2\2\2\64\65\7<\2\2\65\6\3\2\2\2\66\67\7=\2\2\67\b\3\2"+
		"\2\289\7*\2\29\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7.\2\2=\16\3\2\2\2>?\7"+
		"r\2\2?@\7c\2\2@A\7i\2\2AB\7g\2\2B\20\3\2\2\2CD\7g\2\2DE\7p\2\2EF\7f\2"+
		"\2F\22\3\2\2\2GH\7k\2\2HI\7o\2\2IJ\7c\2\2JK\7i\2\2KL\7g\2\2L\24\3\2\2"+
		"\2MN\7h\2\2NO\7n\2\2OP\7c\2\2PQ\7u\2\2QR\7j\2\2R\26\3\2\2\2ST\7v\2\2T"+
		"U\7g\2\2UV\7z\2\2VW\7v\2\2W\30\3\2\2\2XY\7n\2\2YZ\7q\2\2Z[\7i\2\2[\32"+
		"\3\2\2\2\\]\7u\2\2]^\7e\2\2^_\7j\2\2_`\7g\2\2`a\7o\2\2ab\7g\2\2b\34\3"+
		"\2\2\2cg\t\2\2\2df\t\3\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\36"+
		"\3\2\2\2ig\3\2\2\2jl\4\62;\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		" \3\2\2\2op\t\4\2\2pq\3\2\2\2qr\b\21\2\2r\"\3\2\2\2sx\7$\2\2tw\5\'\24"+
		"\2uw\n\5\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\7$\2\2|$\3\2\2\2}~\t\6\2\2~&\3\2\2\2\177\u0080\7^\2\2\u0080"+
		"\u0084\t\7\2\2\u0081\u0084\5+\26\2\u0082\u0084\5)\25\2\u0083\177\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7^\2\2\u0086\u0087\4\62\65\2\u0087\u0088\4\629\2\u0088\u008f\4\629\2"+
		"\u0089\u008a\7^\2\2\u008a\u008b\4\629\2\u008b\u008f\4\629\2\u008c\u008d"+
		"\7^\2\2\u008d\u008f\4\629\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f*\3\2\2\2\u0090\u0091\7^\2\2\u0091\u0092\7w\2\2\u0092"+
		"\u0093\5%\23\2\u0093\u0094\5%\23\2\u0094\u0095\5%\23\2\u0095\u0096\5%"+
		"\23\2\u0096,\3\2\2\2\t\2gmvx\u0083\u008e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}