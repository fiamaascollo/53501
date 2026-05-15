grammar Calculator; 

// REGLAS SINTÁCTICAS
testSuite      : prueba* EOF ;
prueba         : 'prueba' TEXTO '{' paso* '}' ;
paso           : ('dado' | 'cuando' | 'entonces') objeto (estado valor)? ('y' valor)* ;
objeto         : IDENTIFICADOR ('.' IDENTIFICADOR)* ;
estado         : 'es' | 'no es' | 'contiene' | 'existe' | 'debe' ;
valor          : TEXTO | NUMERO | BOOLEANO | variable | lista ;
variable       : '$' IDENTIFICADOR ;
lista          : '[' valor (',' valor)* ']' ;

// REGLAS LÉXICAS
TEXTO          : '"' (~["])* '"' ;
NUMERO         : [0-9]+ ;
BOOLEANO       : 'verdadero' | 'falso' ;
IDENTIFICADOR  : [a-zA-Z] [a-zA-Z0-9_]* ;
WS             : [ \t\r\n]+ -> skip ;