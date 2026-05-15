# Analizador Sintáctico
Nombre: Fiama Scollo  
Legajo: 53501

## Documentación de la Gramática
Las reglas gramaticales pueden consultarse en el pdf del proyecto:
[Reglas Gramaticales - PDF](./Reglas.pdf)

## Instrucciones de Ejecución

1. Instalar dependencias:
   Abrir una terminal en la raíz del proyecto y ejecutar `npm install`

2. Ejecutar el programa con un ejemplo:
   Para ejecutar el analizador, por ej, con el primer ejemplo de éxito (input_correcto_1.txt) hay que copiar su contenido en input.txt y ejecutar `npm start`

## Ejemplos de Entrada Enviados
- Casos de Éxito: `input_correcto_1.txt` e `input_correcto_2.txt`. Al ser procesados, el sistema devuelve "Entrada válida", el árbol y la traducción.
- Casos de Error: `input_incorrecto_1.txt` e `input_incorrecto_2.txt`. Permiten verificar el manejo de errores de sintaxis cuando no se respetan las reglas de la gramática.

## Funcionamiento del Programa
Al procesar una entrada válida, el programa genera tres salidas en la consola:
1. Confirmación de sintaxis
2. Representación del Árbol de derivación sintáctica
3. Traducción de los pasos de prueba a bloques de código JavaScript (ej. objeto = valor;)