/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Eightball;

IMPLICIT_PAGE: ('page' ('0'..'9'));

COLON: ':';
SEMI: ';';
LP: '(';
RP: ')';
COMMA: ',';

BEGIN_PAGE: 'page';
END: 'end';
IMAGE: 'image';
FLASH: 'flash';
TEXT: 'text';
LOG: 'log';
SCHEME: 'scheme';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) -> channel(HIDDEN)
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

endStatement: END;

imageStatement: IMAGE STRING propertySet?;
flashStatement: FLASH STRING propertySet?;
textStatement: TEXT STRING;

logStatement: ID COLON STRING;
schemeStatement: ID COLON STRING;

scheme: SCHEME ID COLON (schemeStatement)* END;

log: LOG STRING propertySet? COLON (logStatement)* END;

inPageStatement: imageStatement | flashStatement | textStatement | log;

property: ID COLON (ID | STRING | INT);
propertySet: LP property (COMMA property)* RP;

pageBlock
    : (inPageStatement)*
    ;

page
    : BEGIN_PAGE ID? propertySet? COLON pageBlock END
    ;

anything: (scheme | page);

program: (anything)* EOF;
