// Generated from /home/jesus/IdeaProjects/PsiCoder2/Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TK_FUNCIONPRINCIPAL", "TK_FINPRINCIPAL", "TK_CHAR", "TK_BOOL", "TK_CAD", 
		"TK_INT", "TK_DOUBLE", "TK_ROMPER", "TK_LEER", "TK_IMPRIMIR", "TK_FUNCION", 
		"TK_HACER", "TK_RETORNAR", "TK_FINFUNCION", "TK_SI", "TK_ENTONCES", "TK_FINSI", 
		"TK_SINO", "TK_PARA", "TK_FINPARA", "TK_MIENTRAS", "TK_FINMIENTRAS", "TK_SELECCIONAR", 
		"TK_ENTRE", "TK_FINSELECCIONAR", "TK_CASO", "TK_DEFECTO", "TK_ESTRUCTURA", 
		"TK_FINESTRUCTURA", "COMMENT", "LINE_COMMENT", "ID", "WS", "TK_PAR_IZQ", 
		"TK_PAR_DER", "TK_PYC", "TK_PUNTO", "TK_COMA", "TK_ASIG", "TK_DOSP", "TK_ENTERO", 
		"TK_REAL", "TK_CADENA", "TK_CARACTER", "VERDADERO", "FALSO", "TK_MAS", 
		"TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
		"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_Y", "TK_O", "TK_DIF", "TK_NEG"
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


	public PsicoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0205\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0183\n\37\f\37\16\37\u0186\13\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0191\n \f \16 \u0194\13 \3 "+
		"\3 \3!\3!\7!\u019a\n!\f!\16!\u019d\13!\3\"\6\"\u01a0\n\"\r\"\16\"\u01a1"+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u01b5\n*\r"+
		"*\16*\u01b6\3+\6+\u01ba\n+\r+\16+\u01bb\3+\3+\3+\6+\u01c1\n+\r+\16+\u01c2"+
		"\5+\u01c5\n+\3,\3,\7,\u01c9\n,\f,\16,\u01cc\13,\3,\3,\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"9\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3\u0184\2>\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\t\4"+
		"\2\f\f\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\60"+
		"\60\4\2\17\17$$\2\u020d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\u008d\3\2\2\2\7\u009b\3\2\2\2\t\u00a4"+
		"\3\2\2\2\13\u00ad\3\2\2\2\r\u00b4\3\2\2\2\17\u00bb\3\2\2\2\21\u00c0\3"+
		"\2\2\2\23\u00c7\3\2\2\2\25\u00cc\3\2\2\2\27\u00d5\3\2\2\2\31\u00dd\3\2"+
		"\2\2\33\u00e3\3\2\2\2\35\u00ec\3\2\2\2\37\u00f8\3\2\2\2!\u00fb\3\2\2\2"+
		"#\u0104\3\2\2\2%\u010b\3\2\2\2\'\u0111\3\2\2\2)\u0116\3\2\2\2+\u011f\3"+
		"\2\2\2-\u0128\3\2\2\2/\u0135\3\2\2\2\61\u0141\3\2\2\2\63\u0147\3\2\2\2"+
		"\65\u0157\3\2\2\2\67\u015c\3\2\2\29\u0164\3\2\2\2;\u016f\3\2\2\2=\u017e"+
		"\3\2\2\2?\u018c\3\2\2\2A\u0197\3\2\2\2C\u019f\3\2\2\2E\u01a5\3\2\2\2G"+
		"\u01a7\3\2\2\2I\u01a9\3\2\2\2K\u01ab\3\2\2\2M\u01ad\3\2\2\2O\u01af\3\2"+
		"\2\2Q\u01b1\3\2\2\2S\u01b4\3\2\2\2U\u01b9\3\2\2\2W\u01c6\3\2\2\2Y\u01cf"+
		"\3\2\2\2[\u01d3\3\2\2\2]\u01dd\3\2\2\2_\u01e3\3\2\2\2a\u01e5\3\2\2\2c"+
		"\u01e7\3\2\2\2e\u01e9\3\2\2\2g\u01eb\3\2\2\2i\u01ed\3\2\2\2k\u01ef\3\2"+
		"\2\2m\u01f1\3\2\2\2o\u01f4\3\2\2\2q\u01f7\3\2\2\2s\u01fa\3\2\2\2u\u01fd"+
		"\3\2\2\2w\u0200\3\2\2\2y\u0203\3\2\2\2{|\7h\2\2|}\7w\2\2}~\7p\2\2~\177"+
		"\7e\2\2\177\u0080\7k\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7a\2\2\u0083\u0084\7r\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7e\2\2\u0088\u0089\7k\2\2\u0089\u008a\7r\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\4\3\2\2\2\u008d\u008e\7h"+
		"\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7a\2\2\u0091\u0092"+
		"\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7e\2\2\u0096\u0097\7k\2\2\u0097\u0098\7r\2\2\u0098\u0099\7c\2\2"+
		"\u0099\u009a\7n\2\2\u009a\6\3\2\2\2\u009b\u009c\7e\2\2\u009c\u009d\7c"+
		"\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\b\3\2\2\2\u00a4\u00a5"+
		"\7d\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7q\2\2"+
		"\u00ac\n\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7f"+
		"\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7c\2\2\u00b3\f"+
		"\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7q\2\2\u00ba\16\3\2\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\20\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"o\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6\22"+
		"\3\2\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7o\2\2\u00ce"+
		"\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7o\2\2"+
		"\u00d2\u00d3\7k\2\2\u00d3\u00d4\7t\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7"+
		"h\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da"+
		"\7k\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7p\2\2\u00dc\30\3\2\2\2\u00dd\u00de"+
		"\7j\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		"\u00e2\7t\2\2\u00e2\32\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7p\2\2"+
		"\u00e9\u00ea\7c\2\2\u00ea\u00eb\7t\2\2\u00eb\34\3\2\2\2\u00ec\u00ed\7"+
		"h\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7a\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\36\3\2\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7k\2\2\u00fa \3\2\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7p\2\2"+
		"\u0100\u0101\7e\2\2\u0101\u0102\7g\2\2\u0102\u0103\7u\2\2\u0103\"\3\2"+
		"\2\2\u0104\u0105\7h\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108"+
		"\7a\2\2\u0108\u0109\7u\2\2\u0109\u010a\7k\2\2\u010a$\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7k\2\2\u010d\u010e\7a\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7q\2\2\u0110&\3\2\2\2\u0111\u0112\7r\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7c\2\2\u0115(\3\2\2\2\u0116\u0117\7h\2\2\u0117"+
		"\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a\7a\2\2\u011a\u011b\7r\2\2"+
		"\u011b\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d\u011e\7c\2\2\u011e*\3\2\2"+
		"\2\u011f\u0120\7o\2\2\u0120\u0121\7k\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7p\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7u\2\2\u0127,\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7k\2\2\u012a"+
		"\u012b\7p\2\2\u012b\u012c\7a\2\2\u012c\u012d\7o\2\2\u012d\u012e\7k\2\2"+
		"\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132"+
		"\7t\2\2\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134.\3\2\2\2\u0135\u0136"+
		"\7u\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7e\2\2\u013a\u013b\7e\2\2\u013b\u013c\7k\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\7p\2\2\u013e\u013f\7c\2\2\u013f\u0140\7t\2\2\u0140\60\3\2"+
		"\2\2\u0141\u0142\7g\2\2\u0142\u0143\7p\2\2\u0143\u0144\7v\2\2\u0144\u0145"+
		"\7t\2\2\u0145\u0146\7g\2\2\u0146\62\3\2\2\2\u0147\u0148\7h\2\2\u0148\u0149"+
		"\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7a\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7g\2\2\u014d\u014e\7n\2\2\u014e\u014f\7g\2\2\u014f\u0150\7e\2\2"+
		"\u0150\u0151\7e\2\2\u0151\u0152\7k\2\2\u0152\u0153\7q\2\2\u0153\u0154"+
		"\7p\2\2\u0154\u0155\7c\2\2\u0155\u0156\7t\2\2\u0156\64\3\2\2\2\u0157\u0158"+
		"\7e\2\2\u0158\u0159\7c\2\2\u0159\u015a\7u\2\2\u015a\u015b\7q\2\2\u015b"+
		"\66\3\2\2\2\u015c\u015d\7f\2\2\u015d\u015e\7g\2\2\u015e\u015f\7h\2\2\u015f"+
		"\u0160\7g\2\2\u0160\u0161\7e\2\2\u0161\u0162\7v\2\2\u0162\u0163\7q\2\2"+
		"\u01638\3\2\2\2\u0164\u0165\7g\2\2\u0165\u0166\7u\2\2\u0166\u0167\7v\2"+
		"\2\u0167\u0168\7t\2\2\u0168\u0169\7w\2\2\u0169\u016a\7e\2\2\u016a\u016b"+
		"\7v\2\2\u016b\u016c\7w\2\2\u016c\u016d\7t\2\2\u016d\u016e\7c\2\2\u016e"+
		":\3\2\2\2\u016f\u0170\7h\2\2\u0170\u0171\7k\2\2\u0171\u0172\7p\2\2\u0172"+
		"\u0173\7a\2\2\u0173\u0174\7g\2\2\u0174\u0175\7u\2\2\u0175\u0176\7v\2\2"+
		"\u0176\u0177\7t\2\2\u0177\u0178\7w\2\2\u0178\u0179\7e\2\2\u0179\u017a"+
		"\7v\2\2\u017a\u017b\7w\2\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2\u017d"+
		"<\3\2\2\2\u017e\u017f\7\61\2\2\u017f\u0180\7,\2\2\u0180\u0184\3\2\2\2"+
		"\u0181\u0183\13\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7,\2\2\u0188\u0189\7\61\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\37"+
		"\2\2\u018b>\3\2\2\2\u018c\u018d\7\61\2\2\u018d\u018e\7\61\2\2\u018e\u0192"+
		"\3\2\2\2\u018f\u0191\n\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\b \2\2\u0196@\3\2\2\2\u0197\u019b\t\3\2\2\u0198\u019a"+
		"\t\4\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019cB\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\t\5\2\2"+
		"\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\"\2\2\u01a4D\3\2\2\2\u01a5"+
		"\u01a6\7*\2\2\u01a6F\3\2\2\2\u01a7\u01a8\7+\2\2\u01a8H\3\2\2\2\u01a9\u01aa"+
		"\7=\2\2\u01aaJ\3\2\2\2\u01ab\u01ac\7\60\2\2\u01acL\3\2\2\2\u01ad\u01ae"+
		"\7.\2\2\u01aeN\3\2\2\2\u01af\u01b0\7?\2\2\u01b0P\3\2\2\2\u01b1\u01b2\7"+
		"<\2\2\u01b2R\3\2\2\2\u01b3\u01b5\t\6\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7T\3\2\2\2\u01b8"+
		"\u01ba\t\6\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c4\3\2\2\2\u01bd\u01c5\3\2\2\2\u01be"+
		"\u01c0\t\7\2\2\u01bf\u01c1\t\6\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01bd\3\2\2\2\u01c4\u01be\3\2\2\2\u01c5V\3\2\2\2\u01c6\u01ca\7$\2\2\u01c7"+
		"\u01c9\n\b\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ce\7$\2\2\u01ceX\3\2\2\2\u01cf\u01d0\7)\2\2\u01d0\u01d1\t\3\2\2\u01d1"+
		"\u01d2\7)\2\2\u01d2Z\3\2\2\2\u01d3\u01d4\7x\2\2\u01d4\u01d5\7g\2\2\u01d5"+
		"\u01d6\7t\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7f\2\2"+
		"\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7q\2\2\u01dc\\\3\2"+
		"\2\2\u01dd\u01de\7h\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1"+
		"\7u\2\2\u01e1\u01e2\7q\2\2\u01e2^\3\2\2\2\u01e3\u01e4\7-\2\2\u01e4`\3"+
		"\2\2\2\u01e5\u01e6\7/\2\2\u01e6b\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8d\3\2"+
		"\2\2\u01e9\u01ea\7\61\2\2\u01eaf\3\2\2\2\u01eb\u01ec\7\'\2\2\u01ech\3"+
		"\2\2\2\u01ed\u01ee\7>\2\2\u01eej\3\2\2\2\u01ef\u01f0\7@\2\2\u01f0l\3\2"+
		"\2\2\u01f1\u01f2\7>\2\2\u01f2\u01f3\7?\2\2\u01f3n\3\2\2\2\u01f4\u01f5"+
		"\7@\2\2\u01f5\u01f6\7?\2\2\u01f6p\3\2\2\2\u01f7\u01f8\7?\2\2\u01f8\u01f9"+
		"\7?\2\2\u01f9r\3\2\2\2\u01fa\u01fb\7(\2\2\u01fb\u01fc\7(\2\2\u01fct\3"+
		"\2\2\2\u01fd\u01fe\7~\2\2\u01fe\u01ff\7~\2\2\u01ffv\3\2\2\2\u0200\u0201"+
		"\7#\2\2\u0201\u0202\7?\2\2\u0202x\3\2\2\2\u0203\u0204\7#\2\2\u0204z\3"+
		"\2\2\2\f\2\u0184\u0192\u019b\u01a1\u01b6\u01bb\u01c2\u01c4\u01ca\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}