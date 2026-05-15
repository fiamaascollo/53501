import fs from 'fs';
import antlr4 from 'antlr4';
import CalculatorLexer from './generated/CalculatorLexer.js';
import CalculatorParser from './generated/CalculatorParser.js';
import CustomCalculatorVisitor from './CustomCalculatorVisitor.js';

function main() {
    try {
        const input = fs.readFileSync('input.txt', 'utf8');
        const chars = new antlr4.InputStream(input);
        const lexer = new CalculatorLexer(chars);
        const tokens = new antlr4.CommonTokenStream(lexer);
        const parser = new CalculatorParser(tokens);
        const tree = parser.testSuite();

        if (parser.syntaxErrorsCount > 0) {
            console.error("Se encontraron errores de sintaxis.");
        } else {
        // 1. Imprime el mensaje de éxito
            console.log("Entrada válida.");
    
        // 2. Imprime el árbol con el encabezado exacto
           console.log("Árbol de derivación: " + tree.toStringTree(parser.ruleNames));
    
           console.log(""); // Espacio para que no quede todo pegado
    
        // 3. Imprime el resultado de la traducción
           console.log("Resultado de la traducción:");
           const visitor = new CustomCalculatorVisitor();
          visitor.visit(tree);
        }
    } catch (err) {
        console.error("Error:", err);
    }
}

main();