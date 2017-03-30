// Generated from G:\Projects\Other\_8ball\src\main\java\net\blustone\eightball\Eightball.g4 by ANTLR 4.1
package net.blustone.eightball;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightballParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
			IMPLICIT_PAGE = 1, COLON = 2, SEMI = 3, LP = 4, RP = 5, COMMA = 6, BEGIN_PAGE = 7, END = 8,
			IMAGE = 9, FLASH = 10, TEXT = 11, LOG = 12, SCHEME = 13, LINK = 14, ID = 15, INT = 16,
			WS = 17, STRING = 18;
	public static final String[] tokenNames = {
			"<INVALID>", "IMPLICIT_PAGE", "':'", "';'", "'('", "')'", "','", "'page'",
			"'end'", "'image'", "'flash'", "'text'", "'log'", "'scheme'", "'link'",
			"ID", "INT", "WS", "STRING"
	};
	public static final int
			RULE_endStatement = 0, RULE_imageStatement = 1, RULE_flashStatement = 2,
			RULE_textStatement = 3, RULE_linkStatement = 4, RULE_logStatement = 5,
			RULE_schemeStatement = 6, RULE_scheme = 7, RULE_log = 8, RULE_inPageStatement = 9,
			RULE_property = 10, RULE_propertySet = 11, RULE_pageBlock = 12, RULE_page = 13,
			RULE_anything = 14, RULE_program = 15;
	public static final String[] ruleNames = {
			"endStatement", "imageStatement", "flashStatement", "textStatement", "linkStatement",
			"logStatement", "schemeStatement", "scheme", "log", "inPageStatement",
			"property", "propertySet", "pageBlock", "page", "anything", "program"
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
				setState(32);
				match(END);
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
				setState(34);
				match(IMAGE);
				setState(35);
				match(STRING);
				setState(37);
				_la = _input.LA(1);
			if (_la==LP) {
				{
					setState(36);
					propertySet();
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
				setState(39);
				match(FLASH);
				setState(40);
				match(STRING);
				setState(42);
				_la = _input.LA(1);
			if (_la==LP) {
				{
					setState(41);
					propertySet();
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
				setState(44);
				match(TEXT);
				setState(45);
				match(STRING);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkStatementContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(EightballParser.ID, 0);
		}

		public TerminalNode IMPLICIT_PAGE() {
			return getToken(EightballParser.IMPLICIT_PAGE, 0);
		}

		public TerminalNode LINK() {
			return getToken(EightballParser.LINK, 0);
		}

		public LinkStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_linkStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof EightballListener) ((EightballListener) listener).enterLinkStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof EightballListener) ((EightballListener) listener).exitLinkStatement(this);
		}
	}

	public final LinkStatementContext linkStatement() throws RecognitionException {
		LinkStatementContext _localctx = new LinkStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_linkStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(47);
				match(LINK);
				setState(48);
				_la = _input.LA(1);
				if (!(_la == IMPLICIT_PAGE || _la == ID)) {
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
		enterRule(_localctx, 10, RULE_logStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(50);
				match(ID);
				setState(51);
				match(COLON);
				setState(52);
				match(STRING);
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
		enterRule(_localctx, 12, RULE_schemeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(54);
				match(ID);
				setState(55);
				match(COLON);
				setState(56);
				match(STRING);
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
		enterRule(_localctx, 14, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(58);
				match(SCHEME);
				setState(59);
				match(ID);
				setState(60);
				match(COLON);
				setState(64);
				_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
					setState(61);
					schemeStatement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(67);
				match(END);
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
		enterRule(_localctx, 16, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(69);
				match(LOG);
				setState(70);
				match(STRING);
				setState(72);
				_la = _input.LA(1);
			if (_la==LP) {
				{
					setState(71);
					propertySet();
				}
			}

				setState(74);
				match(COLON);
				setState(78);
				_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
					setState(75);
					logStatement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(81);
				match(END);
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

		public LinkStatementContext linkStatement() {
			return getRuleContext(LinkStatementContext.class, 0);
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
		enterRule(_localctx, 18, RULE_inPageStatement);
		try {
			setState(88);
			switch (_input.LA(1)) {
				case LINK:
					enterOuterAlt(_localctx, 1);
				{
					setState(83);
					linkStatement();
				}
				break;
				case IMAGE:
					enterOuterAlt(_localctx, 2);
				{
					setState(84);
					imageStatement();
				}
				break;
				case FLASH:
					enterOuterAlt(_localctx, 3);
				{
					setState(85);
					flashStatement();
				}
				break;
				case TEXT:
					enterOuterAlt(_localctx, 4);
				{
					setState(86);
					textStatement();
				}
				break;
				case LOG:
					enterOuterAlt(_localctx, 5);
				{
					setState(87);
					log();
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
		enterRule(_localctx, 20, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(90);
				match(ID);
				setState(91);
				match(COLON);
				setState(92);
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
		enterRule(_localctx, 22, RULE_propertySet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(94);
				match(LP);
				setState(95);
				property();
				setState(100);
				_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
					setState(96);
					match(COMMA);
					setState(97);
					property();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(103);
				match(RP);
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
		enterRule(_localctx, 24, RULE_pageBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(108);
				_errHandler.sync(this);
			_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMAGE) | (1L << FLASH) | (1L << TEXT) | (1L << LOG) | (1L << LINK))) != 0)) {
					{
				{
					setState(105);
					inPageStatement();
				}
				}
					setState(110);
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
		enterRule(_localctx, 26, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				match(BEGIN_PAGE);
				setState(113);
				_la = _input.LA(1);
			if (_la==ID) {
				{
					setState(112);
					match(ID);
				}
			}

				setState(116);
				_la = _input.LA(1);
			if (_la==LP) {
				{
					setState(115);
					propertySet();
				}
			}

				setState(118);
				match(COLON);
				setState(119);
				pageBlock();
				setState(120);
				match(END);
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
		enterRule(_localctx, 28, RULE_anything);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(124);
				switch (_input.LA(1)) {
			case SCHEME:
				{
					setState(122);
					scheme();
				}
				break;
			case BEGIN_PAGE:
				{
					setState(123);
					page();
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
		enterRule(_localctx, 30, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(129);
				_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_PAGE || _la==SCHEME) {
				{
				{
					setState(126);
					anything();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(132);
				match(EOF);
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
			"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\24\u0089\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2" +
					"\3\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7" +
					"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tA\n\t\f\t\16\tD\13\t\3" +
					"\t\3\t\3\n\3\n\3\n\5\nK\n\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\n\3\n\3" +
					"\13\3\13\3\13\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r" +
					"e\n\r\f\r\16\rh\13\r\3\r\3\r\3\16\7\16m\n\16\f\16\16\16p\13\16\3\17\3" +
					"\17\5\17t\n\17\3\17\5\17w\n\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\177" +
					"\n\20\3\21\7\21\u0082\n\21\f\21\16\21\u0085\13\21\3\21\3\21\3\21\2\22" +
					"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\3\3\21\21\4\2\21\22\24" +
					"\24\u0087\2\"\3\2\2\2\4$\3\2\2\2\6)\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\f" +
					"\64\3\2\2\2\168\3\2\2\2\20<\3\2\2\2\22G\3\2\2\2\24Z\3\2\2\2\26\\\3\2\2" +
					"\2\30`\3\2\2\2\32n\3\2\2\2\34q\3\2\2\2\36~\3\2\2\2 \u0083\3\2\2\2\"#\7" +
					"\n\2\2#\3\3\2\2\2$%\7\13\2\2%\'\7\24\2\2&(\5\30\r\2\'&\3\2\2\2\'(\3\2" +
					"\2\2(\5\3\2\2\2)*\7\f\2\2*,\7\24\2\2+-\5\30\r\2,+\3\2\2\2,-\3\2\2\2-\7" +
					"\3\2\2\2./\7\r\2\2/\60\7\24\2\2\60\t\3\2\2\2\61\62\7\20\2\2\62\63\t\2" +
					"\2\2\63\13\3\2\2\2\64\65\7\21\2\2\65\66\7\4\2\2\66\67\7\24\2\2\67\r\3" +
					"\2\2\289\7\21\2\29:\7\4\2\2:;\7\24\2\2;\17\3\2\2\2<=\7\17\2\2=>\7\21\2" +
					"\2>B\7\4\2\2?A\5\16\b\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2" +
					"\2\2DB\3\2\2\2EF\7\n\2\2F\21\3\2\2\2GH\7\16\2\2HJ\7\24\2\2IK\5\30\r\2" +
					"JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LP\7\4\2\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2" +
					"PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\n\2\2T\23\3\2\2\2U[\5\n\6" +
					"\2V[\5\4\3\2W[\5\6\4\2X[\5\b\5\2Y[\5\22\n\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2" +
					"\2\2ZX\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\]\7\21\2\2]^\7\4\2\2^_\t\3\2\2_" +
					"\27\3\2\2\2`a\7\6\2\2af\5\26\f\2bc\7\b\2\2ce\5\26\f\2db\3\2\2\2eh\3\2" +
					"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\7\2\2j\31\3\2\2\2km\5" +
					"\24\13\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\33\3\2\2\2pn\3\2\2\2" +
					"qs\7\t\2\2rt\7\21\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\30\r\2vu\3\2\2" +
					"\2vw\3\2\2\2wx\3\2\2\2xy\7\4\2\2yz\5\32\16\2z{\7\n\2\2{\35\3\2\2\2|\177" +
					"\5\20\t\2}\177\5\34\17\2~|\3\2\2\2~}\3\2\2\2\177\37\3\2\2\2\u0080\u0082" +
					"\5\36\20\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2" +
					"\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087" +
					"\7\2\2\3\u0087!\3\2\2\2\16\',BJPZfnsv~\u0083";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}