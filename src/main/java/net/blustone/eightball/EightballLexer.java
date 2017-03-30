// Generated from G:\Projects\Other\_8ball\src\main\java\net\blustone\eightball\Eightball.g4 by ANTLR 4.1
package net.blustone.eightball;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightballLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
            IMPLICIT_PAGE = 1, COLON = 2, SEMI = 3, LP = 4, RP = 5, COMMA = 6, BEGIN_PAGE = 7, END = 8,
            IMAGE = 9, FLASH = 10, TEXT = 11, LOG = 12, SCHEME = 13, LINK = 14, ID = 15, INT = 16,
            WS = 17, STRING = 18;
    public static String[] modeNames = {
            "DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
            "IMPLICIT_PAGE", "':'", "';'", "'('", "')'", "','", "'page'", "'end'",
            "'image'", "'flash'", "'text'", "'log'", "'scheme'", "'link'", "ID", "INT",
            "WS", "STRING"
    };
    public static final String[] ruleNames = {
            "IMPLICIT_PAGE", "COLON", "SEMI", "LP", "RP", "COMMA", "BEGIN_PAGE", "END",
            "IMAGE", "FLASH", "TEXT", "LOG", "SCHEME", "LINK", "ID", "INT", "WS",
            "STRING", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
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
            case 16:
                WS_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\24\u00a3\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3" +
                    "\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3" +
                    "\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20" +
                    "r\n\20\f\20\16\20u\13\20\3\21\6\21x\n\21\r\21\16\21y\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\7\23\u0083\n\23\f\23\16\23\u0086\13\23\3\23\3\23\3" +
                    "\24\3\24\3\25\3\25\3\25\3\25\5\25\u0090\n\25\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\3\26\3\26\3\26\5\26\u009b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\2\30\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f" +
                    "\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\2%\24\1\'\2\1)\2\1" +
                    "+\2\1-\2\1\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2$$^^" +
                    "\5\2\62;CHch\n\2$$))^^ddhhppttvv\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" +
                    "\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" +
                    "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3" +
                    "\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3/\3\2\2\2\5;\3\2" +
                    "\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21J\3\2" +
                    "\2\2\23N\3\2\2\2\25T\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33c\3\2\2\2\35j\3" +
                    "\2\2\2\37o\3\2\2\2!w\3\2\2\2#{\3\2\2\2%\177\3\2\2\2\'\u0089\3\2\2\2)\u008f" +
                    "\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\60\7r\2\2\60\61\7c\2\2\61\62\7" +
                    "i\2\2\62\63\7g\2\2\63\64\3\2\2\2\648\4\63;\2\65\67\4\62;\2\66\65\3\2\2" +
                    "\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\4\3\2\2\2:8\3\2\2\2;<\7<\2\2<\6" +
                    "\3\2\2\2=>\7=\2\2>\b\3\2\2\2?@\7*\2\2@\n\3\2\2\2AB\7+\2\2B\f\3\2\2\2C" +
                    "D\7.\2\2D\16\3\2\2\2EF\7r\2\2FG\7c\2\2GH\7i\2\2HI\7g\2\2I\20\3\2\2\2J" +
                    "K\7g\2\2KL\7p\2\2LM\7f\2\2M\22\3\2\2\2NO\7k\2\2OP\7o\2\2PQ\7c\2\2QR\7" +
                    "i\2\2RS\7g\2\2S\24\3\2\2\2TU\7h\2\2UV\7n\2\2VW\7c\2\2WX\7u\2\2XY\7j\2" +
                    "\2Y\26\3\2\2\2Z[\7v\2\2[\\\7g\2\2\\]\7z\2\2]^\7v\2\2^\30\3\2\2\2_`\7n" +
                    "\2\2`a\7q\2\2ab\7i\2\2b\32\3\2\2\2cd\7u\2\2de\7e\2\2ef\7j\2\2fg\7g\2\2" +
                    "gh\7o\2\2hi\7g\2\2i\34\3\2\2\2jk\7n\2\2kl\7k\2\2lm\7p\2\2mn\7m\2\2n\36" +
                    "\3\2\2\2os\t\2\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t" +
                    " \3\2\2\2us\3\2\2\2vx\4\62;\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2" +
                    "z\"\3\2\2\2{|\t\4\2\2|}\3\2\2\2}~\b\22\2\2~$\3\2\2\2\177\u0084\7$\2\2" +
                    "\u0080\u0083\5)\25\2\u0081\u0083\n\5\2\2\u0082\u0080\3\2\2\2\u0082\u0081" +
                    "\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085" +
                    "\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088&\3\2\2\2\u0089" +
                    "\u008a\t\6\2\2\u008a(\3\2\2\2\u008b\u008c\7^\2\2\u008c\u0090\t\7\2\2\u008d" +
                    "\u0090\5-\27\2\u008e\u0090\5+\26\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2" +
                    "\2\2\u008f\u008e\3\2\2\2\u0090*\3\2\2\2\u0091\u0092\7^\2\2\u0092\u0093" +
                    "\4\62\65\2\u0093\u0094\4\629\2\u0094\u009b\4\629\2\u0095\u0096\7^\2\2" +
                    "\u0096\u0097\4\629\2\u0097\u009b\4\629\2\u0098\u0099\7^\2\2\u0099\u009b" +
                    "\4\629\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0098\3\2\2\2\u009b" +
                    ",\3\2\2\2\u009c\u009d\7^\2\2\u009d\u009e\7w\2\2\u009e\u009f\5\'\24\2\u009f" +
                    "\u00a0\5\'\24\2\u00a0\u00a1\5\'\24\2\u00a1\u00a2\5\'\24\2\u00a2.\3\2\2" +
                    "\2\n\28sy\u0082\u0084\u008f\u009a";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}