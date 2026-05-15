# Analizador Sintáctico
Nombre: Fiama Scollo  
Legajo: 53501

## Instalación
Clonar este repositorio: git clone https://github.com/fiamaascollo/53501.git

## Instrucciones de Uso

1. Instalar dependencias:
   Abrir una terminal en la raíz del proyecto y ejecutar `npm install`

2. Ejecutar el programa con un ejemplo:
   Para ejecutar el analizador, por ej, con el primer ejemplo de éxito (input_correcto_1.txt), hay que copiar su contenido en input.txt y ejecutar `npm start`

## Ejemplos de Entrada Enviados

- Casos de Éxito: `input_correcto_1.txt` e `input_correcto_2.txt`. Al ser procesados, el sistema devuelve "Entrada válida", el árbol y la traducción.

- Casos de Error: `input_incorrecto_1.txt` e `input_incorrecto_2.txt`. Al ser detectados, el sistema devuelve el mensaje "Se encontraron errores de sintaxis", detalla la ubicación del error, el token inesperado y sugiere elementos válidos.

## Documentación de la Gramática
Las reglas gramaticales pueden consultarse en el pdf del proyecto:
[Reglas Gramaticales - PDF](./Reglas.pdf)