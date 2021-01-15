// Generated from ESDF.g4 by ANTLR 4.9.1
package maow.esdf.internal;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ESDFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEADER_BREAK=1, ASSIGN=2, ATTRIBUTE=3, ANNOTATION=4, NESTED=5, HEADER=6, 
		ID=7, STRING=8, NL=9, WS=10, MULTICOMMENT=11;
	public static final int
		RULE_doc = 0, RULE_header = 1, RULE_headerStatement = 2, RULE_headerElement = 3, 
		RULE_statement = 4, RULE_end = 5, RULE_element = 6, RULE_attribute = 7, 
		RULE_annotation = 8, RULE_nestedElement = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"doc", "header", "headerStatement", "headerElement", "statement", "end", 
			"element", "attribute", "annotation", "nestedElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "':'", "'.'", "'@'", "'>'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HEADER_BREAK", "ASSIGN", "ATTRIBUTE", "ANNOTATION", "NESTED", 
			"HEADER", "ID", "STRING", "NL", "WS", "MULTICOMMENT"
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
	public String getGrammarFileName() { return "ESDF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ESDFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ESDFParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20);
				header();
				}
				break;
			}
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				statement();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << ANNOTATION) | (1L << NESTED) | (1L << ID) | (1L << NL))) != 0) );
			setState(28);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_BREAK() { return getToken(ESDFParser.HEADER_BREAK, 0); }
		public TerminalNode NL() { return getToken(ESDFParser.NL, 0); }
		public List<HeaderStatementContext> headerStatement() {
			return getRuleContexts(HeaderStatementContext.class);
		}
		public HeaderStatementContext headerStatement(int i) {
			return getRuleContext(HeaderStatementContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << ANNOTATION) | (1L << NESTED) | (1L << HEADER) | (1L << ID) | (1L << NL))) != 0)) {
				{
				{
				setState(30);
				headerStatement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(HEADER_BREAK);
			setState(37);
			match(NL);
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

	public static class HeaderStatementContext extends ParserRuleContext {
		public HeaderElementContext headerElement() {
			return getRuleContext(HeaderElementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NL() { return getToken(ESDFParser.NL, 0); }
		public TerminalNode HEADER_BREAK() { return getToken(ESDFParser.HEADER_BREAK, 0); }
		public HeaderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitHeaderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderStatementContext headerStatement() throws RecognitionException {
		HeaderStatementContext _localctx = new HeaderStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headerStatement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				headerElement();
				setState(40);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(NL);
				setState(44);
				match(HEADER_BREAK);
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

	public static class HeaderElementContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(ESDFParser.HEADER, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public HeaderElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitHeaderElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderElementContext headerElement() throws RecognitionException {
		HeaderElementContext _localctx = new HeaderElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headerElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(HEADER);
			setState(48);
			element();
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

	public static class StatementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public NestedElementContext nestedElement() {
			return getRuleContext(NestedElementContext.class,0);
		}
		public TerminalNode NL() { return getToken(ESDFParser.NL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				element();
				setState(51);
				end();
				}
				break;
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				attribute();
				setState(54);
				end();
				}
				break;
			case ANNOTATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				annotation();
				setState(57);
				end();
				}
				break;
			case NESTED:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				nestedElement();
				setState(60);
				end();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(NL);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ESDFParser.NL, 0); }
		public TerminalNode EOF() { return getToken(ESDFParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ESDFParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ESDFParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ESDFParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(68);
				match(ASSIGN);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(69);
					match(STRING);
					}
				}

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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(ESDFParser.ATTRIBUTE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ATTRIBUTE);
			setState(75);
			element();
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(ESDFParser.ANNOTATION, 0); }
		public TerminalNode ID() { return getToken(ESDFParser.ID, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ANNOTATION);
			setState(78);
			match(ID);
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

	public static class NestedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<TerminalNode> NESTED() { return getTokens(ESDFParser.NESTED); }
		public TerminalNode NESTED(int i) {
			return getToken(ESDFParser.NESTED, i);
		}
		public NestedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ESDFVisitor ) return ((ESDFVisitor<? extends T>)visitor).visitNestedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedElementContext nestedElement() throws RecognitionException {
		NestedElementContext _localctx = new NestedElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nestedElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(NESTED);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NESTED );
			setState(85);
			element();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rZ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\5\2\30\n\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\7\3\"\n\3\f\3\16"+
		"\3%\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\bI\n\b\5\bK\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\6\13T\n\13\r"+
		"\13\16\13U\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\3\13\13"+
		"\2[\2\27\3\2\2\2\4#\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\nA\3\2\2\2\fC\3\2"+
		"\2\2\16E\3\2\2\2\20L\3\2\2\2\22O\3\2\2\2\24S\3\2\2\2\26\30\5\4\3\2\27"+
		"\26\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\33\5\n\6\2\32\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\2\2\3\37"+
		"\3\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2"+
		"\2%#\3\2\2\2&\'\7\3\2\2\'(\7\13\2\2(\5\3\2\2\2)*\5\b\5\2*+\5\f\7\2+\60"+
		"\3\2\2\2,\60\5\n\6\2-.\7\13\2\2.\60\7\3\2\2/)\3\2\2\2/,\3\2\2\2/-\3\2"+
		"\2\2\60\7\3\2\2\2\61\62\7\b\2\2\62\63\5\16\b\2\63\t\3\2\2\2\64\65\5\16"+
		"\b\2\65\66\5\f\7\2\66B\3\2\2\2\678\5\20\t\289\5\f\7\29B\3\2\2\2:;\5\22"+
		"\n\2;<\5\f\7\2<B\3\2\2\2=>\5\24\13\2>?\5\f\7\2?B\3\2\2\2@B\7\13\2\2A\64"+
		"\3\2\2\2A\67\3\2\2\2A:\3\2\2\2A=\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\t\2\2"+
		"\2D\r\3\2\2\2EJ\7\t\2\2FH\7\4\2\2GI\7\n\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JF\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LM\7\5\2\2MN\5\16\b\2N\21\3\2\2\2"+
		"OP\7\6\2\2PQ\7\t\2\2Q\23\3\2\2\2RT\7\7\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VW\3\2\2\2WX\5\16\b\2X\25\3\2\2\2\n\27\34#/AHJU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}