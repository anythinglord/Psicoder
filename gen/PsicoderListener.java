// Generated from /home/jesus/IdeaProjects/PsiCoder2/Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsicoderParser}.
 */
public interface PsicoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(PsicoderParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(PsicoderParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PsicoderParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PsicoderParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(PsicoderParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(PsicoderParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#esperado}.
	 * @param ctx the parse tree
	 */
	void enterEsperado(PsicoderParser.EsperadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#esperado}.
	 * @param ctx the parse tree
	 */
	void exitEsperado(PsicoderParser.EsperadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#siguiente}.
	 * @param ctx the parse tree
	 */
	void enterSiguiente(PsicoderParser.SiguienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#siguiente}.
	 * @param ctx the parse tree
	 */
	void exitSiguiente(PsicoderParser.SiguienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#eleccion}.
	 * @param ctx the parse tree
	 */
	void enterEleccion(PsicoderParser.EleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#eleccion}.
	 * @param ctx the parse tree
	 */
	void exitEleccion(PsicoderParser.EleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(PsicoderParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(PsicoderParser.ComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#adicion}.
	 * @param ctx the parse tree
	 */
	void enterAdicion(PsicoderParser.AdicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#adicion}.
	 * @param ctx the parse tree
	 */
	void exitAdicion(PsicoderParser.AdicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(PsicoderParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(PsicoderParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#stream}.
	 * @param ctx the parse tree
	 */
	void enterStream(PsicoderParser.StreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#stream}.
	 * @param ctx the parse tree
	 */
	void exitStream(PsicoderParser.StreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(PsicoderParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(PsicoderParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#otro}.
	 * @param ctx the parse tree
	 */
	void enterOtro(PsicoderParser.OtroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#otro}.
	 * @param ctx the parse tree
	 */
	void exitOtro(PsicoderParser.OtroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#mas}.
	 * @param ctx the parse tree
	 */
	void enterMas(PsicoderParser.MasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#mas}.
	 * @param ctx the parse tree
	 */
	void exitMas(PsicoderParser.MasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterAritmetico(PsicoderParser.AritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitAritmetico(PsicoderParser.AritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(PsicoderParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(PsicoderParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PsicoderParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PsicoderParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#otrascond}.
	 * @param ctx the parse tree
	 */
	void enterOtrascond(PsicoderParser.OtrascondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#otrascond}.
	 * @param ctx the parse tree
	 */
	void exitOtrascond(PsicoderParser.OtrascondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PsicoderParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PsicoderParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(PsicoderParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(PsicoderParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#tiporet}.
	 * @param ctx the parse tree
	 */
	void enterTiporet(PsicoderParser.TiporetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#tiporet}.
	 * @param ctx the parse tree
	 */
	void exitTiporet(PsicoderParser.TiporetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#ify}.
	 * @param ctx the parse tree
	 */
	void enterIfy(PsicoderParser.IfyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#ify}.
	 * @param ctx the parse tree
	 */
	void exitIfy(PsicoderParser.IfyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#elsey}.
	 * @param ctx the parse tree
	 */
	void enterElsey(PsicoderParser.ElseyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#elsey}.
	 * @param ctx the parse tree
	 */
	void exitElsey(PsicoderParser.ElseyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#fory}.
	 * @param ctx the parse tree
	 */
	void enterFory(PsicoderParser.ForyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#fory}.
	 * @param ctx the parse tree
	 */
	void exitFory(PsicoderParser.ForyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#whiley}.
	 * @param ctx the parse tree
	 */
	void enterWhiley(PsicoderParser.WhileyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#whiley}.
	 * @param ctx the parse tree
	 */
	void exitWhiley(PsicoderParser.WhileyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#do_whiley}.
	 * @param ctx the parse tree
	 */
	void enterDo_whiley(PsicoderParser.Do_whileyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#do_whiley}.
	 * @param ctx the parse tree
	 */
	void exitDo_whiley(PsicoderParser.Do_whileyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#switchy}.
	 * @param ctx the parse tree
	 */
	void enterSwitchy(PsicoderParser.SwitchyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#switchy}.
	 * @param ctx the parse tree
	 */
	void exitSwitchy(PsicoderParser.SwitchyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#casey}.
	 * @param ctx the parse tree
	 */
	void enterCasey(PsicoderParser.CaseyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#casey}.
	 * @param ctx the parse tree
	 */
	void exitCasey(PsicoderParser.CaseyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(PsicoderParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(PsicoderParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(PsicoderParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(PsicoderParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(PsicoderParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(PsicoderParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(PsicoderParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(PsicoderParser.LogicoContext ctx);
}