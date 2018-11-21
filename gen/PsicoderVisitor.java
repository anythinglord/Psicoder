// Generated from /home/jesus/IdeaProjects/PsiCoder2/Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsicoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsicoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(PsicoderParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(PsicoderParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(PsicoderParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#esperado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperado(PsicoderParser.EsperadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#siguiente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiguiente(PsicoderParser.SiguienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#eleccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEleccion(PsicoderParser.EleccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(PsicoderParser.ComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#adicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicion(PsicoderParser.AdicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(PsicoderParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(PsicoderParser.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(PsicoderParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#otro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro(PsicoderParser.OtroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#mas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMas(PsicoderParser.MasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetico(PsicoderParser.AritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(PsicoderParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(PsicoderParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#otrascond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrascond(PsicoderParser.OtrascondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PsicoderParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(PsicoderParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#tiporet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiporet(PsicoderParser.TiporetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#ify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfy(PsicoderParser.IfyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#elsey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsey(PsicoderParser.ElseyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#fory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFory(PsicoderParser.ForyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#whiley}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiley(PsicoderParser.WhileyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#do_whiley}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_whiley(PsicoderParser.Do_whileyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#switchy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchy(PsicoderParser.SwitchyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#casey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasey(PsicoderParser.CaseyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(PsicoderParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(PsicoderParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(PsicoderParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(PsicoderParser.LogicoContext ctx);
}