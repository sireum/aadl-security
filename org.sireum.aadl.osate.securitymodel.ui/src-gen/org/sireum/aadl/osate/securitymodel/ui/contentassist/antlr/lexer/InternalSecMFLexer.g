

/** Copyright (c) 2020, Hariharan Thiagarajan, Kansas State University
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
lexer grammar InternalSecMFLexer;


@header {
package org.sireum.aadl.osate.securitymodel.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




DeClassification : ('D'|'d')('E'|'e')'-'('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Classification : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Classifier : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('R'|'r');

Reference : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

Subclause : ('S'|'s')('U'|'u')('B'|'b')('C'|'c')('L'|'l')('A'|'a')('U'|'u')('S'|'s')('E'|'e');

Constant : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

Applies : ('A'|'a')('P'|'p')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

Binding : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

Compute : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

Extends : ('E'|'e')('X'|'x')('T'|'t')('E'|'e')('N'|'n')('D'|'d')('S'|'s');

Library : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

Package : ('P'|'p')('A'|'a')('C'|'c')('K'|'k')('A'|'a')('G'|'g')('E'|'e');

Domain : ('D'|'d')('O'|'o')('M'|'m')('A'|'a')('I'|'i')('N'|'n');

Public : ('P'|'p')('U'|'u')('B'|'b')('L'|'l')('I'|'i')('C'|'c');

Annex : ('A'|'a')('N'|'n')('N'|'n')('E'|'e')('X'|'x');

Delta : ('D'|'d')('E'|'e')('L'|'l')('T'|'t')('A'|'a');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Modes : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('S'|'s');

Types : ('T'|'t')('Y'|'y')('P'|'p')('E'|'e')('S'|'s');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

Type : ('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

AsteriskAsteriskRightCurlyBracket : '*''*''}';

PlusSignEqualsSignGreaterThanSign : '+''=''>';

Any : ('A'|'a')('N'|'n')('Y'|'y');

End : ('E'|'e')('N'|'n')('D'|'d');

LeftCurlyBracketAsteriskAsterisk : '{''*''*';

HyphenMinusGreaterThanSign : '-''>';

FullStopFullStop : '.''.';

ColonColon : ':'':';

EqualsSignGreaterThanSign : '=''>';

In : ('I'|'i')('N'|'n');

To : ('T'|'t')('O'|'o');

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Colon : ':';

Semicolon : ';';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';



RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INTEGER_LIT : ('0'..'9')+;

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXTENDED_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_BASED_INTEGER : RULE_EXTENDED_DIGIT ('_'? RULE_EXTENDED_DIGIT)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;



