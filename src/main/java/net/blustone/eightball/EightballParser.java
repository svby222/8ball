package net.blustone.eightball;// Generated from E:\Projects\Other\eightball\src\main\resources\Eightball.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightballParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPLICIT_PAGE=1, COLON=2, SEMI=3, LP=4, RP=5, COMMA=6, BEGIN_PAGE=7, END=8, 
		IMAGE=9, FLASH=10, TEXT=11, LOG=12, SCHEME=13, ID=14, INT=15, WS=16, STRING=17;
	public static final String[] tokenNames = {
		"<INVALID>", "IMPLICIT_PAGE", "':'", "';'", "'('", "')'", "','", "'page'", 
		"'end'", "'image'", "'flash'", "'text'", "'log'", "'scheme'", "ID", "INT", 
		"WS", "STRING"
	};
	public static final int
		RULE_endStatement = 0, RULE_imageStatement = 1, RULE_flashStatement = 2, 
		RULE_textStatement = 3, RULE_logStatement = 4, RULE_schemeStatement = 5, 
		RULE_scheme = 6, RULE_log = 7, RULE_inPageStatement = 8, RULE_property = 9, 
		RULE_propertySet = 10, RULE_pageBlock = 11, RULE_page = 12, RULE_anything = 13, 
		RULE_program = 14;
	public static final String[] ruleNames = {
		"endStatement", "imageStatement", "flashStatement", "textStatement", "logStatement", 
		"schemeStatement", "scheme", "log", "inPageStatement", "property", "propertySet", 
		"pageBlock", "page", "anything", "program"
	};

	@Override
	public String getGrammarFileName() { return "Eightball.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public EightballParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(EightballParser.END, 0); }
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitEndStatement(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(END);
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

	public static class ImageStatementContext extends ParserRuleContext {
		public PropertySetContext propertySet() {
			return getRuleContext(PropertySetContext.class,0);
		}
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public TerminalNode IMAGE() { return getToken(EightballParser.IMAGE, 0); }
		public ImageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterImageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitImageStatement(this);
		}
	}

	public final ImageStatementContext imageStatement() throws RecognitionException {
		ImageStatementContext _localctx = new ImageStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(IMAGE);
			setState(33); match(STRING);
			setState(35);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(34); propertySet();
				}
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

	public static class FlashStatementContext extends ParserRuleContext {
		public PropertySetContext propertySet() {
			return getRuleContext(PropertySetContext.class,0);
		}
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public TerminalNode FLASH() { return getToken(EightballParser.FLASH, 0); }
		public FlashStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterFlashStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitFlashStatement(this);
		}
	}

	public final FlashStatementContext flashStatement() throws RecognitionException {
		FlashStatementContext _localctx = new FlashStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_flashStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(FLASH);
			setState(38); match(STRING);
			setState(40);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(39); propertySet();
				}
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

	public static class TextStatementContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(EightballParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public TextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterTextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitTextStatement(this);
		}
	}

	public final TextStatementContext textStatement() throws RecognitionException {
		TextStatementContext _localctx = new TextStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(TEXT);
			setState(43); match(STRING);
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

	public static class LogStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EightballParser.ID, 0); }
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public LogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitLogStatement(this);
		}
	}

	public final LogStatementContext logStatement() throws RecognitionException {
		LogStatementContext _localctx = new LogStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(ID);
			setState(46); match(COLON);
			setState(47); match(STRING);
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

	public static class SchemeStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EightballParser.ID, 0); }
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public SchemeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterSchemeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitSchemeStatement(this);
		}
	}

	public final SchemeStatementContext schemeStatement() throws RecognitionException {
		SchemeStatementContext _localctx = new SchemeStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_schemeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(ID);
			setState(50); match(COLON);
			setState(51); match(STRING);
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

	public static class SchemeContext extends ParserRuleContext {
		public List<SchemeStatementContext> schemeStatement() {
			return getRuleContexts(SchemeStatementContext.class);
		}
		public TerminalNode ID() { return getToken(EightballParser.ID, 0); }
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public SchemeStatementContext schemeStatement(int i) {
			return getRuleContext(SchemeStatementContext.class,i);
		}
		public TerminalNode END() { return getToken(EightballParser.END, 0); }
		public TerminalNode SCHEME() { return getToken(EightballParser.SCHEME, 0); }
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(SCHEME);
			setState(54); match(ID);
			setState(55); match(COLON);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(56); schemeStatement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(END);
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(EightballParser.LOG, 0); }
		public PropertySetContext propertySet() {
			return getRuleContext(PropertySetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public TerminalNode END() { return getToken(EightballParser.END, 0); }
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public LogStatementContext logStatement(int i) {
			return getRuleContext(LogStatementContext.class,i);
		}
		public List<LogStatementContext> logStatement() {
			return getRuleContexts(LogStatementContext.class);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(LOG);
			setState(65); match(STRING);
			setState(67);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(66); propertySet();
				}
			}

			setState(69); match(COLON);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(70); logStatement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(END);
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

	public static class InPageStatementContext extends ParserRuleContext {
		public ImageStatementContext imageStatement() {
			return getRuleContext(ImageStatementContext.class,0);
		}
		public FlashStatementContext flashStatement() {
			return getRuleContext(FlashStatementContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public TextStatementContext textStatement() {
			return getRuleContext(TextStatementContext.class,0);
		}
		public InPageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterInPageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitInPageStatement(this);
		}
	}

	public final InPageStatementContext inPageStatement() throws RecognitionException {
		InPageStatementContext _localctx = new InPageStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inPageStatement);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case IMAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); imageStatement();
				}
				break;
			case FLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); flashStatement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); textStatement();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); log();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EightballParser.ID); }
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public TerminalNode ID(int i) {
			return getToken(EightballParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(EightballParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EightballParser.INT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(ID);
			setState(85); match(COLON);
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PropertySetContext extends ParserRuleContext {
		public TerminalNode RP() { return getToken(EightballParser.RP, 0); }
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode LP() { return getToken(EightballParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EightballParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EightballParser.COMMA, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterPropertySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitPropertySet(this);
		}
	}

	public final PropertySetContext propertySet() throws RecognitionException {
		PropertySetContext _localctx = new PropertySetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertySet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(LP);
			setState(89); property();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90); match(COMMA);
				setState(91); property();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(RP);
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

	public static class PageBlockContext extends ParserRuleContext {
		public List<InPageStatementContext> inPageStatement() {
			return getRuleContexts(InPageStatementContext.class);
		}
		public InPageStatementContext inPageStatement(int i) {
			return getRuleContext(InPageStatementContext.class,i);
		}
		public PageBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterPageBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitPageBlock(this);
		}
	}

	public final PageBlockContext pageBlock() throws RecognitionException {
		PageBlockContext _localctx = new PageBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pageBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMAGE) | (1L << FLASH) | (1L << TEXT) | (1L << LOG))) != 0)) {
				{
				{
				setState(99); inPageStatement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EightballParser.ID, 0); }
		public PropertySetContext propertySet() {
			return getRuleContext(PropertySetContext.class,0);
		}
		public TerminalNode BEGIN_PAGE() { return getToken(EightballParser.BEGIN_PAGE, 0); }
		public PageBlockContext pageBlock() {
			return getRuleContext(PageBlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EightballParser.COLON, 0); }
		public TerminalNode END() { return getToken(EightballParser.END, 0); }
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(BEGIN_PAGE);
			setState(107);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106); match(ID);
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(109); propertySet();
				}
			}

			setState(112); match(COLON);
			setState(113); pageBlock();
			setState(114); match(END);
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

	public static class AnythingContext extends ParserRuleContext {
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitAnything(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_anything);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			switch (_input.LA(1)) {
			case SCHEME:
				{
				setState(116); scheme();
				}
				break;
			case BEGIN_PAGE:
				{
				setState(117); page();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<AnythingContext> anything() {
			return getRuleContexts(AnythingContext.class);
		}
		public TerminalNode EOF() { return getToken(EightballParser.EOF, 0); }
		public AnythingContext anything(int i) {
			return getRuleContext(AnythingContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EightballListener ) ((EightballListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_PAGE || _la==SCHEME) {
				{
				{
				setState(120); anything();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(EOF);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\23\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"F\n\t\3\t\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nU\n\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f_\n\f\f\f\16\fb\13\f\3\f\3\f\3"+
		"\r\7\rg\n\r\f\r\16\rj\13\r\3\16\3\16\5\16n\n\16\3\16\5\16q\n\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\5\17y\n\17\3\20\7\20|\n\20\f\20\16\20\177\13\20"+
		"\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2\20"+
		"\21\23\23\u0081\2 \3\2\2\2\4\"\3\2\2\2\6\'\3\2\2\2\b,\3\2\2\2\n/\3\2\2"+
		"\2\f\63\3\2\2\2\16\67\3\2\2\2\20B\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26Z"+
		"\3\2\2\2\30h\3\2\2\2\32k\3\2\2\2\34x\3\2\2\2\36}\3\2\2\2 !\7\n\2\2!\3"+
		"\3\2\2\2\"#\7\13\2\2#%\7\23\2\2$&\5\26\f\2%$\3\2\2\2%&\3\2\2\2&\5\3\2"+
		"\2\2\'(\7\f\2\2(*\7\23\2\2)+\5\26\f\2*)\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,"+
		"-\7\r\2\2-.\7\23\2\2.\t\3\2\2\2/\60\7\20\2\2\60\61\7\4\2\2\61\62\7\23"+
		"\2\2\62\13\3\2\2\2\63\64\7\20\2\2\64\65\7\4\2\2\65\66\7\23\2\2\66\r\3"+
		"\2\2\2\678\7\17\2\289\7\20\2\29=\7\4\2\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\n\2\2A\17\3\2\2\2BC\7\16"+
		"\2\2CE\7\23\2\2DF\5\26\f\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GK\7\4\2\2HJ\5"+
		"\n\6\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7"+
		"\n\2\2O\21\3\2\2\2PU\5\4\3\2QU\5\6\4\2RU\5\b\5\2SU\5\20\t\2TP\3\2\2\2"+
		"TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\23\3\2\2\2VW\7\20\2\2WX\7\4\2\2XY\t\2"+
		"\2\2Y\25\3\2\2\2Z[\7\6\2\2[`\5\24\13\2\\]\7\b\2\2]_\5\24\13\2^\\\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\7\2\2d\27\3\2"+
		"\2\2eg\5\22\n\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\31\3\2\2\2jh"+
		"\3\2\2\2km\7\t\2\2ln\7\20\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\26\f\2"+
		"po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\4\2\2st\5\30\r\2tu\7\n\2\2u\33\3\2"+
		"\2\2vy\5\16\b\2wy\5\32\16\2xv\3\2\2\2xw\3\2\2\2y\35\3\2\2\2z|\5\34\17"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7\2\2\3\u0081\37\3\2\2\2\16%*=EKT`hmpx}";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}