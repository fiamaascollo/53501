import CalculatorVisitor from './generated/CalculatorVisitor.js';

export default class CustomCalculatorVisitor extends CalculatorVisitor {
    
    // Se ejecuta al entrar en una "prueba" 
    visitPrueba(ctx) {
        const nombre = ctx.TEXTO().getText();
        console.log(`// Prueba: ${nombre}`); 
        return this.visitChildren(ctx);
    }

    // Se ejecuta en cada paso (dado, cuando, entonces) 
    visitPaso(ctx) {
    const accion = ctx.getChild(0).getText(); // dado, cuando, entonces
    const objeto = this.visit(ctx.objeto());
    
    // Verificamos si existen el estado y el valor antes de intentar visitarlos
    const estado = ctx.estado() ? ctx.estado().getText() : "";
    const valorCtx = ctx.valor(0);
    const valor = valorCtx ? this.visit(valorCtx) : "";

    // Lógica de impresión para la traducción
    if (accion === 'dado') {
        console.log(`${objeto} = ${valor || 'null'};`);
    } else {
        console.log(`// Paso: ${accion} ${objeto} ${estado} ${valor}`);
    }
    
    return null; 
}

    // Une los identificadores con puntos (ej: el.usuario)
    visitObjeto(ctx) {
        return ctx.IDENTIFICADOR().map(id => id.getText()).join('.');
    }

    // Devuelve el texto, número o variable
    visitValor(ctx) {
        return ctx.getText();
    }
}