// Generated from c:/Users/fiama/ssl-antlr-calculator/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#testSuite}.
	 * @param ctx the parse tree
	 */
	void enterTestSuite(CalculatorParser.TestSuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#testSuite}.
	 * @param ctx the parse tree
	 */
	void exitTestSuite(CalculatorParser.TestSuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#prueba}.
	 * @param ctx the parse tree
	 */
	void enterPrueba(CalculatorParser.PruebaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#prueba}.
	 * @param ctx the parse tree
	 */
	void exitPrueba(CalculatorParser.PruebaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(CalculatorParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(CalculatorParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(CalculatorParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(CalculatorParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(CalculatorParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(CalculatorParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(CalculatorParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(CalculatorParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(CalculatorParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(CalculatorParser.ListaContext ctx);
}