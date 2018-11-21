// Generated from /home/jesus/IdeaProjects/PsiCoder2/Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_FUNCIONPRINCIPAL=1, TK_FINPRINCIPAL=2, TK_CHAR=3, TK_BOOL=4, TK_CAD=5, 
		TK_INT=6, TK_DOUBLE=7, TK_ROMPER=8, TK_LEER=9, TK_IMPRIMIR=10, TK_FUNCION=11, 
		TK_HACER=12, TK_RETORNAR=13, TK_FINFUNCION=14, TK_SI=15, TK_ENTONCES=16, 
		TK_FINSI=17, TK_SINO=18, TK_PARA=19, TK_FINPARA=20, TK_MIENTRAS=21, TK_FINMIENTRAS=22, 
		TK_SELECCIONAR=23, TK_ENTRE=24, TK_FINSELECCIONAR=25, TK_CASO=26, TK_DEFECTO=27, 
		TK_ESTRUCTURA=28, TK_FINESTRUCTURA=29, COMMENT=30, LINE_COMMENT=31, ID=32, 
		WS=33, TK_PAR_IZQ=34, TK_PAR_DER=35, TK_PYC=36, TK_PUNTO=37, TK_COMA=38, 
		TK_ASIG=39, TK_DOSP=40, TK_ENTERO=41, TK_REAL=42, TK_CADENA=43, TK_CARACTER=44, 
		VERDADERO=45, FALSO=46, TK_MAS=47, TK_MENOS=48, TK_MULT=49, TK_DIV=50, 
		TK_MOD=51, TK_MENOR=52, TK_MAYOR=53, TK_MENOR_IGUAL=54, TK_MAYOR_IGUAL=55, 
		TK_IGUAL=56, TK_Y=57, TK_O=58, TK_DIF=59, TK_NEG=60;
	public static final int
		RULE_s = 0, RULE_code = 1, RULE_declaracion = 2, RULE_simple = 3, RULE_esperado = 4, 
		RULE_siguiente = 5, RULE_eleccion = 6, RULE_complex = 7, RULE_adicion = 8, 
		RULE_control = 9, RULE_stream = 10, RULE_cuerpo = 11, RULE_otro = 12, 
		RULE_mas = 13, RULE_aritmetico = 14, RULE_operacion = 15, RULE_condicion = 16, 
		RULE_otrascond = 17, RULE_tipo = 18, RULE_f = 19, RULE_tiporet = 20, RULE_ify = 21, 
		RULE_elsey = 22, RULE_fory = 23, RULE_whiley = 24, RULE_do_whiley = 25, 
		RULE_switchy = 26, RULE_casey = 27, RULE_e = 28, RULE_valor = 29, RULE_operando = 30, 
		RULE_logico = 31;
	public static final String[] ruleNames = {
		"s", "code", "declaracion", "simple", "esperado", "siguiente", "eleccion", 
		"complex", "adicion", "control", "stream", "cuerpo", "otro", "mas", "aritmetico", 
		"operacion", "condicion", "otrascond", "tipo", "f", "tiporet", "ify", 
		"elsey", "fory", "whiley", "do_whiley", "switchy", "casey", "e", "valor", 
		"operando", "logico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'funcion_principal'", "'fin_principal'", "'caracter'", "'booleano'", 
		"'cadena'", "'entero'", "'real'", "'romper'", "'leer'", "'imprimir'", 
		"'funcion'", "'hacer'", "'retornar'", "'fin_funcion'", "'si'", "'entonces'", 
		"'fin_si'", "'si_no'", "'para'", "'fin_para'", "'mientras'", "'fin_mientras'", 
		"'seleccionar'", "'entre'", "'fin_seleccionar'", "'caso'", "'defecto'", 
		"'estructura'", "'fin_estructura'", null, null, null, null, "'('", "')'", 
		"';'", "'.'", "','", "'='", "':'", null, null, null, null, "'verdadero'", 
		"'falso'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'&&'", "'||'", "'!='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_FUNCIONPRINCIPAL", "TK_FINPRINCIPAL", "TK_CHAR", "TK_BOOL", 
		"TK_CAD", "TK_INT", "TK_DOUBLE", "TK_ROMPER", "TK_LEER", "TK_IMPRIMIR", 
		"TK_FUNCION", "TK_HACER", "TK_RETORNAR", "TK_FINFUNCION", "TK_SI", "TK_ENTONCES", 
		"TK_FINSI", "TK_SINO", "TK_PARA", "TK_FINPARA", "TK_MIENTRAS", "TK_FINMIENTRAS", 
		"TK_SELECCIONAR", "TK_ENTRE", "TK_FINSELECCIONAR", "TK_CASO", "TK_DEFECTO", 
		"TK_ESTRUCTURA", "TK_FINESTRUCTURA", "COMMENT", "LINE_COMMENT", "ID", 
		"WS", "TK_PAR_IZQ", "TK_PAR_DER", "TK_PYC", "TK_PUNTO", "TK_COMA", "TK_ASIG", 
		"TK_DOSP", "TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER", "VERDADERO", 
		"FALSO", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", "TK_MENOR", 
		"TK_MAYOR", "TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", "TK_IGUAL", "TK_Y", "TK_O", 
		"TK_DIF", "TK_NEG"
	};
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
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsicoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public TerminalNode TK_FUNCIONPRINCIPAL() { return getToken(PsicoderParser.TK_FUNCIONPRINCIPAL, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode TK_FINPRINCIPAL() { return getToken(PsicoderParser.TK_FINPRINCIPAL, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PsicoderParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FUNCIONPRINCIPAL:
			case TK_FUNCION:
			case TK_ESTRUCTURA:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_FUNCION || _la==TK_ESTRUCTURA) {
					{
					setState(66);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_FUNCION:
						{
						setState(64);
						f();
						}
						break;
					case TK_ESTRUCTURA:
						{
						setState(65);
						e();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(TK_FUNCIONPRINCIPAL);
				setState(72);
				code();
				setState(73);
				match(TK_FINPRINCIPAL);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<ControlContext> control() {
			return getRuleContexts(ControlContext.class);
		}
		public ControlContext control(int i) {
			return getRuleContext(ControlContext.class,i);
		}
		public List<StreamContext> stream() {
			return getRuleContexts(StreamContext.class);
		}
		public StreamContext stream(int i) {
			return getRuleContext(StreamContext.class,i);
		}
		public List<TerminalNode> TK_PYC() { return getTokens(PsicoderParser.TK_PYC); }
		public TerminalNode TK_PYC(int i) {
			return getToken(PsicoderParser.TK_PYC, i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(78);
						declaracion();
						}
						break;
					case 2:
						{
						setState(79);
						control();
						}
						break;
					case 3:
						{
						setState(80);
						stream();
						setState(81);
						match(TK_PYC);
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			simple();
			setState(89);
			match(TK_PYC);
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

	public static class SimpleContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public EsperadoContext esperado() {
			return getRuleContext(EsperadoContext.class,0);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CHAR:
			case TK_BOOL:
			case TK_CAD:
			case TK_INT:
			case TK_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				tipo();
				setState(92);
				esperado();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				esperado();
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

	public static class EsperadoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public SiguienteContext siguiente() {
			return getRuleContext(SiguienteContext.class,0);
		}
		public EsperadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterEsperado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitEsperado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitEsperado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperadoContext esperado() throws RecognitionException {
		EsperadoContext _localctx = new EsperadoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_esperado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			siguiente();
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

	public static class SiguienteContext extends ParserRuleContext {
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public EleccionContext eleccion() {
			return getRuleContext(EleccionContext.class,0);
		}
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public SiguienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siguiente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSiguiente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSiguiente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSiguiente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiguienteContext siguiente() throws RecognitionException {
		SiguienteContext _localctx = new SiguienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_siguiente);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(TK_ASIG);
				setState(101);
				eleccion();
				setState(102);
				complex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class EleccionContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AritmeticoContext aritmetico() {
			return getRuleContext(AritmeticoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public EleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterEleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitEleccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitEleccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EleccionContext eleccion() throws RecognitionException {
		EleccionContext _localctx = new EleccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eleccion);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				aritmetico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(ID);
				setState(111);
				match(TK_PAR_IZQ);
				setState(112);
				simple();
				setState(113);
				match(TK_PAR_DER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class ComplexContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public AdicionContext adicion() {
			return getRuleContext(AdicionContext.class,0);
		}
		public ComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexContext complex() throws RecognitionException {
		ComplexContext _localctx = new ComplexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complex);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(TK_COMA);
				setState(119);
				adicion();
				}
				break;
			case TK_FINESTRUCTURA:
			case TK_PAR_DER:
			case TK_PYC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AdicionContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AdicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAdicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdicionContext adicion() throws RecognitionException {
		AdicionContext _localctx = new AdicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_adicion);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CHAR:
			case TK_BOOL:
			case TK_CAD:
			case TK_INT:
			case TK_DOUBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				simple();
				}
				break;
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				valor();
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

	public static class ControlContext extends ParserRuleContext {
		public IfyContext ify() {
			return getRuleContext(IfyContext.class,0);
		}
		public ForyContext fory() {
			return getRuleContext(ForyContext.class,0);
		}
		public WhileyContext whiley() {
			return getRuleContext(WhileyContext.class,0);
		}
		public Do_whileyContext do_whiley() {
			return getRuleContext(Do_whileyContext.class,0);
		}
		public SwitchyContext switchy() {
			return getRuleContext(SwitchyContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_control);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				ify();
				}
				break;
			case TK_PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				fory();
				}
				break;
			case TK_MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				whiley();
				}
				break;
			case TK_HACER:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				do_whiley();
				}
				break;
			case TK_SELECCIONAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				switchy();
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

	public static class StreamContext extends ParserRuleContext {
		public TerminalNode TK_ROMPER() { return getToken(PsicoderParser.TK_ROMPER, 0); }
		public TerminalNode TK_LEER() { return getToken(PsicoderParser.TK_LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_IMPRIMIR() { return getToken(PsicoderParser.TK_IMPRIMIR, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public StreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stream);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(TK_ROMPER);
				}
				break;
			case TK_LEER:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(TK_LEER);
				setState(136);
				match(TK_PAR_IZQ);
				setState(137);
				match(ID);
				setState(138);
				match(TK_PAR_DER);
				}
				break;
			case TK_IMPRIMIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(TK_IMPRIMIR);
				setState(140);
				match(TK_PAR_IZQ);
				setState(141);
				cuerpo();
				setState(142);
				match(TK_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(ID);
				setState(145);
				match(TK_PAR_IZQ);
				setState(146);
				simple();
				setState(147);
				match(TK_PAR_DER);
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

	public static class CuerpoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OtroContext otro() {
			return getRuleContext(OtroContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCuerpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpo);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				valor();
				setState(152);
				otro();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(ID);
				setState(155);
				otro();
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

	public static class OtroContext extends ParserRuleContext {
		public MasContext mas() {
			return getRuleContext(MasContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOtro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOtro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_otro);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				mas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class MasContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public MasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterMas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitMas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitMas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MasContext mas() throws RecognitionException {
		MasContext _localctx = new MasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TK_COMA);
			setState(164);
			cuerpo();
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

	public static class AritmeticoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public AritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticoContext aritmetico() throws RecognitionException {
		AritmeticoContext _localctx = new AritmeticoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aritmetico);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				valor();
				setState(167);
				operacion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ID);
				setState(170);
				operacion();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public List<MasContext> mas() {
			return getRuleContexts(MasContext.class);
		}
		public MasContext mas(int i) {
			return getRuleContext(MasContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(173);
						operando();
						setState(174);
						valor();
						}
						break;
					case 2:
						{
						setState(176);
						operando();
						setState(177);
						match(ID);
						}
						break;
					case 3:
						{
						setState(179);
						mas();
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public OtrascondContext otrascond() {
			return getRuleContext(OtrascondContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AritmeticoContext aritmetico() {
			return getRuleContext(AritmeticoContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicion);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				setState(186);
				logico();
				setState(187);
				otrascond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				valor();
				setState(190);
				logico();
				setState(191);
				otrascond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				aritmetico();
				setState(194);
				logico();
				setState(195);
				valor();
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

	public static class OtrascondContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AritmeticoContext aritmetico() {
			return getRuleContext(AritmeticoContext.class,0);
		}
		public OtrascondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otrascond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOtrascond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOtrascond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOtrascond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrascondContext otrascond() throws RecognitionException {
		OtrascondContext _localctx = new OtrascondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_otrascond);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				aritmetico();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TK_CHAR() { return getToken(PsicoderParser.TK_CHAR, 0); }
		public TerminalNode TK_BOOL() { return getToken(PsicoderParser.TK_BOOL, 0); }
		public TerminalNode TK_CAD() { return getToken(PsicoderParser.TK_CAD, 0); }
		public TerminalNode TK_INT() { return getToken(PsicoderParser.TK_INT, 0); }
		public TerminalNode TK_DOUBLE() { return getToken(PsicoderParser.TK_DOUBLE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_CHAR) | (1L << TK_BOOL) | (1L << TK_CAD) | (1L << TK_INT) | (1L << TK_DOUBLE))) != 0)) ) {
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode TK_FUNCION() { return getToken(PsicoderParser.TK_FUNCION, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_HACER() { return getToken(PsicoderParser.TK_HACER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode TK_RETORNAR() { return getToken(PsicoderParser.TK_RETORNAR, 0); }
		public TiporetContext tiporet() {
			return getRuleContext(TiporetContext.class,0);
		}
		public TerminalNode TK_FINFUNCION() { return getToken(PsicoderParser.TK_FINFUNCION, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TK_FUNCION);
			setState(207);
			tipo();
			setState(208);
			match(ID);
			setState(209);
			match(TK_PAR_IZQ);
			setState(210);
			simple();
			setState(211);
			match(TK_PAR_DER);
			setState(212);
			match(TK_HACER);
			setState(213);
			code();
			setState(214);
			match(TK_RETORNAR);
			setState(215);
			tiporet();
			setState(216);
			match(TK_FINFUNCION);
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

	public static class TiporetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public AritmeticoContext aritmetico() {
			return getRuleContext(AritmeticoContext.class,0);
		}
		public TiporetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiporet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTiporet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTiporet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTiporet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiporetContext tiporet() throws RecognitionException {
		TiporetContext _localctx = new TiporetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tiporet);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ID);
				setState(219);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				aritmetico();
				setState(221);
				match(TK_PYC);
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

	public static class IfyContext extends ParserRuleContext {
		public TerminalNode TK_SI() { return getToken(PsicoderParser.TK_SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_ENTONCES() { return getToken(PsicoderParser.TK_ENTONCES, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseyContext elsey() {
			return getRuleContext(ElseyContext.class,0);
		}
		public TerminalNode TK_FINSI() { return getToken(PsicoderParser.TK_FINSI, 0); }
		public IfyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterIfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitIfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitIfy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfyContext ify() throws RecognitionException {
		IfyContext _localctx = new IfyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TK_SI);
			setState(226);
			match(TK_PAR_IZQ);
			setState(227);
			condicion();
			setState(228);
			match(TK_PAR_DER);
			setState(229);
			match(TK_ENTONCES);
			setState(230);
			code();
			setState(231);
			elsey();
			setState(232);
			match(TK_FINSI);
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

	public static class ElseyContext extends ParserRuleContext {
		public TerminalNode TK_SINO() { return getToken(PsicoderParser.TK_SINO, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterElsey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitElsey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitElsey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseyContext elsey() throws RecognitionException {
		ElseyContext _localctx = new ElseyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elsey);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(TK_SINO);
				setState(235);
				code();
				}
				break;
			case TK_FINSI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ForyContext extends ParserRuleContext {
		public TerminalNode TK_PARA() { return getToken(PsicoderParser.TK_PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public List<TerminalNode> TK_PYC() { return getTokens(PsicoderParser.TK_PYC); }
		public TerminalNode TK_PYC(int i) {
			return getToken(PsicoderParser.TK_PYC, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_HACER() { return getToken(PsicoderParser.TK_HACER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode TK_FINPARA() { return getToken(PsicoderParser.TK_FINPARA, 0); }
		public ForyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterFory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitFory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitFory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForyContext fory() throws RecognitionException {
		ForyContext _localctx = new ForyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TK_PARA);
			setState(240);
			match(TK_PAR_IZQ);
			setState(241);
			simple();
			setState(242);
			match(TK_PYC);
			setState(243);
			condicion();
			setState(244);
			match(TK_PYC);
			setState(245);
			valor();
			setState(246);
			match(TK_PAR_DER);
			setState(247);
			match(TK_HACER);
			setState(248);
			code();
			setState(249);
			match(TK_FINPARA);
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

	public static class WhileyContext extends ParserRuleContext {
		public TerminalNode TK_MIENTRAS() { return getToken(PsicoderParser.TK_MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_HACER() { return getToken(PsicoderParser.TK_HACER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode TK_FINMIENTRAS() { return getToken(PsicoderParser.TK_FINMIENTRAS, 0); }
		public WhileyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiley; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterWhiley(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitWhiley(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitWhiley(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileyContext whiley() throws RecognitionException {
		WhileyContext _localctx = new WhileyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whiley);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(TK_MIENTRAS);
			setState(252);
			match(TK_PAR_IZQ);
			setState(253);
			condicion();
			setState(254);
			match(TK_PAR_DER);
			setState(255);
			match(TK_HACER);
			setState(256);
			code();
			setState(257);
			match(TK_FINMIENTRAS);
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

	public static class Do_whileyContext extends ParserRuleContext {
		public TerminalNode TK_HACER() { return getToken(PsicoderParser.TK_HACER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode TK_MIENTRAS() { return getToken(PsicoderParser.TK_MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Do_whileyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_whiley; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDo_whiley(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDo_whiley(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDo_whiley(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileyContext do_whiley() throws RecognitionException {
		Do_whileyContext _localctx = new Do_whileyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_do_whiley);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TK_HACER);
			setState(260);
			code();
			setState(261);
			match(TK_MIENTRAS);
			setState(262);
			match(TK_PAR_IZQ);
			setState(263);
			condicion();
			setState(264);
			match(TK_PAR_DER);
			setState(265);
			match(TK_PYC);
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

	public static class SwitchyContext extends ParserRuleContext {
		public TerminalNode TK_SELECCIONAR() { return getToken(PsicoderParser.TK_SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_ENTRE() { return getToken(PsicoderParser.TK_ENTRE, 0); }
		public TerminalNode TK_FINSELECCIONAR() { return getToken(PsicoderParser.TK_FINSELECCIONAR, 0); }
		public List<CaseyContext> casey() {
			return getRuleContexts(CaseyContext.class);
		}
		public CaseyContext casey(int i) {
			return getRuleContext(CaseyContext.class,i);
		}
		public SwitchyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSwitchy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSwitchy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSwitchy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchyContext switchy() throws RecognitionException {
		SwitchyContext _localctx = new SwitchyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(TK_SELECCIONAR);
			setState(268);
			match(TK_PAR_IZQ);
			setState(269);
			match(ID);
			setState(270);
			match(TK_PAR_DER);
			setState(271);
			match(TK_ENTRE);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_CASO || _la==TK_DEFECTO) {
				{
				{
				setState(272);
				casey();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(TK_FINSELECCIONAR);
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

	public static class CaseyContext extends ParserRuleContext {
		public TerminalNode TK_CASO() { return getToken(PsicoderParser.TK_CASO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode TK_DOSP() { return getToken(PsicoderParser.TK_DOSP, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode TK_DEFECTO() { return getToken(PsicoderParser.TK_DEFECTO, 0); }
		public CaseyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCasey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCasey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCasey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseyContext casey() throws RecognitionException {
		CaseyContext _localctx = new CaseyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_casey);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(TK_CASO);
				setState(281);
				valor();
				setState(282);
				match(TK_DOSP);
				setState(283);
				declaracion();
				}
				break;
			case TK_DEFECTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(TK_DEFECTO);
				setState(286);
				match(TK_DOSP);
				setState(287);
				declaracion();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode TK_ESTRUCTURA() { return getToken(PsicoderParser.TK_ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode TK_FINESTRUCTURA() { return getToken(PsicoderParser.TK_FINESTRUCTURA, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TK_ESTRUCTURA);
			setState(291);
			match(ID);
			setState(292);
			simple();
			setState(293);
			match(TK_FINESTRUCTURA);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode TK_ENTERO() { return getToken(PsicoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsicoderParser.TK_REAL, 0); }
		public TerminalNode TK_CADENA() { return getToken(PsicoderParser.TK_CADENA, 0); }
		public TerminalNode TK_CARACTER() { return getToken(PsicoderParser.TK_CARACTER, 0); }
		public TerminalNode VERDADERO() { return getToken(PsicoderParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PsicoderParser.FALSO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER) | (1L << VERDADERO) | (1L << FALSO))) != 0)) ) {
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

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode TK_MAS() { return getToken(PsicoderParser.TK_MAS, 0); }
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_MULT() { return getToken(PsicoderParser.TK_MULT, 0); }
		public TerminalNode TK_DIV() { return getToken(PsicoderParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(PsicoderParser.TK_MOD, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode TK_MENOR() { return getToken(PsicoderParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(PsicoderParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(PsicoderParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(PsicoderParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_IGUAL() { return getToken(PsicoderParser.TK_IGUAL, 0); }
		public TerminalNode TK_Y() { return getToken(PsicoderParser.TK_Y, 0); }
		public TerminalNode TK_O() { return getToken(PsicoderParser.TK_O, 0); }
		public TerminalNode TK_DIF() { return getToken(PsicoderParser.TK_DIF, 0); }
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUAL) | (1L << TK_Y) | (1L << TK_O) | (1L << TK_DIF) | (1L << TK_NEG))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\3\2\5\2O\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"b\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\5\n\u0080\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u009f"+
		"\n\r\3\16\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ae\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b7\n"+
		"\21\f\21\16\21\u00ba\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23\5\23\u00cd\n\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00e2\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\5\30\u00f0\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0114\n\34\f\34\16\34\u0117\13\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0123\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@\2\6\3\2\5\t\3\2+\60\3\2\61\65\3\2\66>\2\u0133\2N\3\2"+
		"\2\2\4W\3\2\2\2\6Z\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fl\3\2\2\2\16v\3\2\2"+
		"\2\20{\3\2\2\2\22\177\3\2\2\2\24\u0086\3\2\2\2\26\u0097\3\2\2\2\30\u009e"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00ad\3\2\2\2 \u00b8\3\2"+
		"\2\2\"\u00c7\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00ef\3\2\2\2\60\u00f1\3\2\2\2\62\u00fd\3\2\2"+
		"\2\64\u0105\3\2\2\2\66\u010d\3\2\2\28\u0122\3\2\2\2:\u0124\3\2\2\2<\u0129"+
		"\3\2\2\2>\u012b\3\2\2\2@\u012d\3\2\2\2BE\5(\25\2CE\5:\36\2DB\3\2\2\2D"+
		"C\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\3\2\2"+
		"JK\5\4\3\2KL\7\4\2\2LO\3\2\2\2MO\7\2\2\3NF\3\2\2\2NM\3\2\2\2O\3\3\2\2"+
		"\2PV\5\6\4\2QV\5\24\13\2RS\5\26\f\2ST\7&\2\2TV\3\2\2\2UP\3\2\2\2UQ\3\2"+
		"\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2YW\3\2\2\2Z[\5"+
		"\b\5\2[\\\7&\2\2\\\7\3\2\2\2]^\5&\24\2^_\5\n\6\2_b\3\2\2\2`b\5\n\6\2a"+
		"]\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\7\"\2\2de\5\f\7\2e\13\3\2\2\2fg\7)\2"+
		"\2gh\5\16\b\2hi\5\20\t\2im\3\2\2\2jm\5\20\t\2km\3\2\2\2lf\3\2\2\2lj\3"+
		"\2\2\2lk\3\2\2\2m\r\3\2\2\2nw\5<\37\2ow\5\36\20\2pq\7\"\2\2qr\7$\2\2r"+
		"s\5\b\5\2st\7%\2\2tw\3\2\2\2uw\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2v"+
		"u\3\2\2\2w\17\3\2\2\2xy\7(\2\2y|\5\22\n\2z|\3\2\2\2{x\3\2\2\2{z\3\2\2"+
		"\2|\21\3\2\2\2}\u0080\5\b\5\2~\u0080\5<\37\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\23\3\2\2\2\u0081\u0087\5,\27\2\u0082\u0087\5\60\31\2\u0083\u0087"+
		"\5\62\32\2\u0084\u0087\5\64\33\2\u0085\u0087\5\66\34\2\u0086\u0081\3\2"+
		"\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0098\7\n\2\2\u0089\u008a\7\13\2"+
		"\2\u008a\u008b\7$\2\2\u008b\u008c\7\"\2\2\u008c\u0098\7%\2\2\u008d\u008e"+
		"\7\f\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7%\2\2\u0091"+
		"\u0098\3\2\2\2\u0092\u0093\7\"\2\2\u0093\u0094\7$\2\2\u0094\u0095\5\b"+
		"\5\2\u0095\u0096\7%\2\2\u0096\u0098\3\2\2\2\u0097\u0088\3\2\2\2\u0097"+
		"\u0089\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0092\3\2\2\2\u0098\27\3\2\2"+
		"\2\u0099\u009a\5<\37\2\u009a\u009b\5\32\16\2\u009b\u009f\3\2\2\2\u009c"+
		"\u009d\7\"\2\2\u009d\u009f\5\32\16\2\u009e\u0099\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009f\31\3\2\2\2\u00a0\u00a4\5\34\17\2\u00a1\u00a4\5 \21\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7\5\30\r\2\u00a7\35"+
		"\3\2\2\2\u00a8\u00a9\5<\37\2\u00a9\u00aa\5 \21\2\u00aa\u00ae\3\2\2\2\u00ab"+
		"\u00ac\7\"\2\2\u00ac\u00ae\5 \21\2\u00ad\u00a8\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\37\3\2\2\2\u00af\u00b0\5> \2\u00b0\u00b1\5<\37\2\u00b1\u00b7"+
		"\3\2\2\2\u00b2\u00b3\5> \2\u00b3\u00b4\7\"\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b7\5\34\17\2\u00b6\u00af\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"!\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5@!\2\u00bd"+
		"\u00be\5$\23\2\u00be\u00c8\3\2\2\2\u00bf\u00c0\5<\37\2\u00c0\u00c1\5@"+
		"!\2\u00c1\u00c2\5$\23\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\5\36\20\2\u00c4"+
		"\u00c5\5@!\2\u00c5\u00c6\5<\37\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb\3\2\2"+
		"\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00cd"+
		"\7\"\2\2\u00ca\u00cd\5<\37\2\u00cb\u00cd\5\36\20\2\u00cc\u00c9\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf\t"+
		"\2\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3"+
		"\7\"\2\2\u00d3\u00d4\7$\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\7%\2\2\u00d6"+
		"\u00d7\7\16\2\2\u00d7\u00d8\5\4\3\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\5"+
		"*\26\2\u00da\u00db\7\20\2\2\u00db)\3\2\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00e2"+
		"\7&\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\7&\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7\21\2\2"+
		"\u00e4\u00e5\7$\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7%\2\2\u00e7\u00e8"+
		"\7\22\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\7\23\2\2"+
		"\u00eb-\3\2\2\2\u00ec\u00ed\7\24\2\2\u00ed\u00f0\5\4\3\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0/\3\2\2\2\u00f1\u00f2"+
		"\7\25\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f4\5\b\5\2\u00f4\u00f5\7&\2\2\u00f5"+
		"\u00f6\5\"\22\2\u00f6\u00f7\7&\2\2\u00f7\u00f8\5<\37\2\u00f8\u00f9\7%"+
		"\2\2\u00f9\u00fa\7\16\2\2\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\26\2\2\u00fc"+
		"\61\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100\5\"\22"+
		"\2\u0100\u0101\7%\2\2\u0101\u0102\7\16\2\2\u0102\u0103\5\4\3\2\u0103\u0104"+
		"\7\30\2\2\u0104\63\3\2\2\2\u0105\u0106\7\16\2\2\u0106\u0107\5\4\3\2\u0107"+
		"\u0108\7\27\2\2\u0108\u0109\7$\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7"+
		"%\2\2\u010b\u010c\7&\2\2\u010c\65\3\2\2\2\u010d\u010e\7\31\2\2\u010e\u010f"+
		"\7$\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7%\2\2\u0111\u0115\7\32\2\2\u0112"+
		"\u0114\58\35\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\7\33\2\2\u0119\67\3\2\2\2\u011a\u011b\7\34\2\2\u011b\u011c\5<\37"+
		"\2\u011c\u011d\7*\2\2\u011d\u011e\5\6\4\2\u011e\u0123\3\2\2\2\u011f\u0120"+
		"\7\35\2\2\u0120\u0121\7*\2\2\u0121\u0123\5\6\4\2\u0122\u011a\3\2\2\2\u0122"+
		"\u011f\3\2\2\2\u01239\3\2\2\2\u0124\u0125\7\36\2\2\u0125\u0126\7\"\2\2"+
		"\u0126\u0127\5\b\5\2\u0127\u0128\7\37\2\2\u0128;\3\2\2\2\u0129\u012a\t"+
		"\3\2\2\u012a=\3\2\2\2\u012b\u012c\t\4\2\2\u012c?\3\2\2\2\u012d\u012e\t"+
		"\5\2\2\u012eA\3\2\2\2\31DFNUWalv{\177\u0086\u0097\u009e\u00a3\u00ad\u00b6"+
		"\u00b8\u00c7\u00cc\u00e1\u00ef\u0115\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}