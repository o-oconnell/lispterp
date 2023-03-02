// Combined lexer/parser grammar (lexer rules below)
grammar Lisp;

inp : expr ;

expr : '(' 'define' ide (expr|unevaluatedId|list) ')' # define
     | '(' 'defun' ide '(' ide* ')' expr ')' # defun

     | '(' 'mapcar' unevaluatedId list+ ')' # mapcar
     | '(' 'lambda' '(' ide* ')' expr ')' # lambda
     
     | '(' '+' expr expr+ ')' # add
     | '(' '-' expr expr+ ')' # sub
     | '(' '*' expr expr+ ')' # mul
     | '(' '/' expr expr+ ')' # div
     
     | '(' 'sqrt' expr ')' # sqrt
     | '(' 'exp' expr ')' # exp
     | '(' 'pow' expr expr ')' # pow
     
     | '(' 'cdr' (list|expr) ')' # cdr
     | '(' 'car' (list|expr) ')' # car
     | '(' 'cons' (list|unevaluatedId) list ')' # cons
     
     | list # lst	

     | '(' 'if' expr expr expr ')' # ifstat
     | '(' 'set!' ide expr ')' # set
     | '(' 'and' expr expr ')'  # and
     | '(' 'or' expr expr ')' # or
     | '(' 'not' expr ')'    # not
     
     | '(' '<' expr expr ')' # lessThan
     | '(' '>' expr expr ')' # greaterThan
     | '(' '<=' expr expr ')' # leq
     | '(' '>=' expr expr ')' # geq
     | '(' '=' expr expr ')' # eq
     | '(' '!=' expr expr ')' # neq
     
     | 'T' # trueBool
     | ( '(' ')' | 'NIL' ) # falseBool
     
     | '(' 'if' expr expr expr+ ')' # ifstat

     | '(' expr expr* ')' # funcall
     | ide  # id
     | INT # int
     ;

// NOTE: must explicitly enumerate keywords,
// since ANTLR is not intended for keyword-agnostic grammars
// (see https://stackoverflow.com/questions/41421644/antlr4-how-to-build-a-grammar-allowed-keywords-as-identifier)
ide : 'define'
    | 'defun'
    | 'mapcar'
    | 'lambda'
    | '+' | '-' | '*' | '/' | 'sqrt' | 'exp' | 'pow'
    | 'cdr' | 'car' | 'cons' | 'if' | 'set!' | 'and'
    | 'or' | 'not' | '<' | '>' | '<=' | '>=' | '='
    | '!=' | 'T' | 'NIL'
    | ID ;

unevaluatedId : '\'' ide ;

list : '\'' '(' (atom|nestedList)* ')' ;

atom : ide ;

nestedList : '(' (atom|nestedList)* ')' ;

// LEXER rules (each lexer rule is upcase)

// Includes special characters:
ID  : (LETTER | '0'..'9')+  ;

INT :   '0'..'9'+ ;

// Cannot reference LETTER from a parser rule, since
// fragment indicates it's only intended to be used by other lexer rules
fragment
LETTER
	:   ('a'..'z' | 'A'..'Z' | '_')
    ;

// Skip whitespace
WS  :   [ \t\r\n]+ -> skip ; // discard all whitespace




