// Gramatica de Psicoder 
// no contiene Ambiguedades 
// Faltan arreglar unas producciones
grammar Psicoder;
s           : (f | e)* TK_FUNCIONPRINCIPAL code TK_FINPRINCIPAL
            | EOF
            ;

code        : (declaracion|control|stream TK_PYC)*
            ;


declaracion : simple TK_PYC
            ;


// tipo -> principio
simple      : tipo esperado
            | esperado
            ;


esperado    :ID siguiente
            ;

// complex -> , b
siguiente   : TK_ASIG eleccion complex
            | complex
            |
            ;

// a = fun (a, b) para eso se utiliza la penultima produccion
eleccion    : valor
            | aritmetico
            | ID TK_PAR_IZQ simple TK_PAR_DER
            |
            ;

// adiccion es para el llamado de funciones
// con muchos parametros
complex     : TK_COMA adicion
            |
            ;

adicion     : simple
            | valor
            ;

control     : ify
            | fory
            | whiley
            | do_whiley
            | switchy
            ;

stream      : TK_ROMPER
            | TK_LEER TK_PAR_IZQ ID TK_PAR_DER
            | TK_IMPRIMIR TK_PAR_IZQ cuerpo TK_PAR_DER
            | ID TK_PAR_IZQ simple TK_PAR_DER
            ;


cuerpo      : valor otro
            | ID otro
            ;

otro        : mas
            | operacion
            |
            ;

mas         : TK_COMA cuerpo
            ;

aritmetico  : valor operacion
            | ID operacion
            ;

operacion   : (operando valor| operando ID | mas)*
            ;

condicion   : ID logico otrascond
            | valor logico otrascond
            | aritmetico logico valor
            ;

otrascond   : ID
            | valor
            | aritmetico
            ;

tipo        : TK_CHAR
            | TK_BOOL
            | TK_CAD
            | TK_INT
            | TK_DOUBLE
            ;

f           : TK_FUNCION tipo ID TK_PAR_IZQ simple TK_PAR_DER TK_HACER code TK_RETORNAR tiporet TK_FINFUNCION
            ;

tiporet     : ID TK_PYC
            | aritmetico TK_PYC
            ;

ify         : TK_SI TK_PAR_IZQ condicion TK_PAR_DER TK_ENTONCES code elsey TK_FINSI;
elsey       : TK_SINO code
            |
            ;

fory        : TK_PARA TK_PAR_IZQ simple TK_PYC condicion TK_PYC valor TK_PAR_DER TK_HACER code TK_FINPARA
            ;

whiley      : TK_MIENTRAS TK_PAR_IZQ condicion TK_PAR_DER TK_HACER code TK_FINMIENTRAS
            ;

do_whiley   : TK_HACER code TK_MIENTRAS TK_PAR_IZQ condicion TK_PAR_DER TK_PYC
            ;

switchy     : TK_SELECCIONAR TK_PAR_IZQ ID TK_PAR_DER TK_ENTRE casey* TK_FINSELECCIONAR
            ;

casey       : TK_CASO valor TK_DOSP declaracion
            | TK_DEFECTO TK_DOSP declaracion
            ;

e           : TK_ESTRUCTURA ID simple TK_FINESTRUCTURA
            ;

valor       : TK_ENTERO
            | TK_REAL
            | TK_CADENA
            | TK_CARACTER
            | VERDADERO
            | FALSO
          ;
operando    : TK_MAS
            | TK_MENOS
            | TK_MULT
            | TK_DIV
            | TK_MOD
            ;

logico      : TK_MENOR
            | TK_MAYOR
            | TK_MENOR_IGUAL
            | TK_MAYOR_IGUAL
            | TK_IGUAL
            | TK_Y
            | TK_O
            | TK_DIF
            | TK_NEG
            ;

TK_FUNCIONPRINCIPAL	    :'funcion_principal';
TK_FINPRINCIPAL	        :'fin_principal';
TK_CHAR         :'caracter';
TK_BOOL         :'booleano';
TK_CAD          :'cadena';
TK_INT          :'entero';
TK_DOUBLE       :'real';
TK_ROMPER       :'romper';
TK_LEER         :'leer';
TK_IMPRIMIR     :'imprimir';
TK_FUNCION      :'funcion';
TK_HACER        :'hacer';
TK_RETORNAR     :'retornar';
TK_FINFUNCION   :'fin_funcion';
TK_SI           :'si';
TK_ENTONCES     :'entonces';
TK_FINSI        :'fin_si';
TK_SINO         :'si_no';
TK_PARA         :'para';
TK_FINPARA      :'fin_para';
TK_MIENTRAS     :'mientras';
TK_FINMIENTRAS  :'fin_mientras';
TK_SELECCIONAR  :'seleccionar';
TK_ENTRE        :'entre' ;
TK_FINSELECCIONAR :'fin_seleccionar';
TK_CASO         :'caso';
TK_DEFECTO      :'defecto';
TK_ESTRUCTURA   :'estructura';
TK_FINESTRUCTURA:'fin_estructura';


COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
WS		        : [ \t\r\n]+ -> skip ;
TK_PAR_IZQ      : '(';
TK_PAR_DER      : ')';
TK_PYC          : ';';
TK_PUNTO        : '.';
TK_COMA         : ',';
TK_ASIG         : '=';
TK_DOSP         : ':';
TK_ENTERO       : [0-9]+;
TK_REAL         : [0-9]+( | [.][0-9]+);
TK_CADENA       : '"'(~["\r])*'"';
TK_CARACTER     : '\''[a-zA-Z]'\'';
VERDADERO       : 'verdadero';
FALSO           : 'falso';
TK_MAS          : '+';
TK_MENOS        : '-';
TK_MULT         : '*';
TK_DIV          : '/';
TK_MOD          : '%';
TK_MENOR        : '<';
TK_MAYOR        : '>';
TK_MENOR_IGUAL  : '<=';
TK_MAYOR_IGUAL  : '>=';
TK_IGUAL        : '==';
TK_Y            : '&&';
TK_O            : '||';
TK_DIF          : '!=';
TK_NEG          : '!';
