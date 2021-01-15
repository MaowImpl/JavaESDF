grammar ESDF;

@header {package maow.esdf.internal;
}

doc : header? statement+ EOF
    ;

header  : headerStatement* HEADER_BREAK NL
        ;

headerStatement : headerElement end
                | statement
                | NL HEADER_BREAK
                ;

headerElement   : HEADER element
                ;

statement   : element end
            | attribute end
            | annotation end
            | nestedElement end
            | NL
            ;

end : NL
    | EOF
    ;

element : ID (ASSIGN STRING?)?
        ;

attribute   : ATTRIBUTE element
            ;

annotation  : ANNOTATION ID
            ;

nestedElement   : NESTED+ element
                ;

HEADER_BREAK    : '-' ;
ASSIGN          : ':' ;
ATTRIBUTE       : '.' ;
ANNOTATION      : '@' ;
NESTED          : '>' ;
HEADER          : '^' ;

ID              : [a-zA-Z0-9_]+     ;
STRING          :  '"' .*? '"'      ;
NL              : '\r'? '\n'        ;

WS              : [ \t]+ -> skip        ;
MULTICOMMENT    : '/*' .*? '*/' -> skip ;