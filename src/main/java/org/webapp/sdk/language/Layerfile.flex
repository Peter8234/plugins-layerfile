package org.webapp.sdk.language;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.webapp.sdk.language.psi.LayerTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;

%%
%class LayerLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

LineTerminator = \r|\n|\r\n
LineContinue = \\\n | \\\r | \\\r\n
END_OF_LINE_COMMENT="#"[^\r\n]*
LINE_DATA=[^\s\r\n][^\\\r\n]*
VALUE=[^\s\r\n]+
KEY_VALUE=[^!=~\s\r\n]+
OPERATOR=\!?=\~?
STRING = \" [^\n\r\"]* \" |  \' [^\n\r\']* \' | \$\( [^\n\r\$\)]* \) | \` [^\n\r\`]* \`
SKIP_REMAINING_AND="AND"


%state BUTTON, CACHE, CLONE, CHECKPOINT, CLONE, COPY, ENV, BUILD_ENV
%state FROM, MEMORY, RUN, RUN_BACKGROUND, RUN_REPEATABLE, CHECKPOINT, SECRET_ENV,
%state SETUP_FILE, SKIP_REMAINING_IF, SPLIT, EXPOSE_WEBSITE, USER, WAIT, WORKDIR
%%

<YYINITIAL> {
    {END_OF_LINE_COMMENT} { yybegin(YYINITIAL); return LayerTypes.COMMENT;}
    "SECRET ENV"  { yybegin(SECRET_ENV); return LayerTypes.SECRET_ENV;}
    "BUILD ENV" { yybegin(BUILD_ENV); return LayerTypes.BUILD_ENV;}
    "EXPOSE WEBSITE" { yybegin(EXPOSE_WEBSITE); return LayerTypes.EXPOSE_WEBSITE;}
    "SKIP REMAINING IF"  { yybegin(SKIP_REMAINING_IF); return LayerTypes.SKIP_REMAINING_IF;}
    "SETUP FILE"  { yybegin(SETUP_FILE); return LayerTypes.SETUP_FILE;}
    "BUTTON" { yybegin(BUTTON); return LayerTypes.BUTTON; }
    "CACHE"  { yybegin(CACHE); return LayerTypes.CACHE; }
    "CHECKPOINT" { yybegin(CHECKPOINT); return LayerTypes.CHECKPOINT; }
    "CLONE"  { yybegin(CLONE); return LayerTypes.CLONE;}
    "COPY"  { yybegin(COPY); return LayerTypes.COPY;}
    "ENV"  { yybegin(ENV); return LayerTypes.ENV;}
    "FROM"  { yybegin(FROM); return LayerTypes.FROM;}
    "MEMORY"  { yybegin(MEMORY); return LayerTypes.MEMORY;}
    "RUN BACKGROUND" { yybegin(RUN_BACKGROUND); return LayerTypes.RUN_BACKGROUND;}
    "RUN REPEATABLE"  { yybegin(RUN_REPEATABLE); return LayerTypes.RUN_REPEATABLE;}
    "RUN"  { yybegin(RUN); return LayerTypes.RUN;}
    "CHECKPOINT"  { yybegin(CHECKPOINT); return LayerTypes.CHECKPOINT;}
    "SPLIT" { yybegin(SPLIT); return LayerTypes.SPLIT;}
    "USER" { yybegin(USER); return LayerTypes.USER;}
    "WAIT" { yybegin(WAIT); return LayerTypes.WAIT;}
    "WORKDIR" { yybegin(WORKDIR); return LayerTypes.WORKDIR;}
    \w+ {return TokenType.BAD_CHARACTER;}
}

<BUTTON> {
    {LINE_DATA} {  return LayerTypes.BUTTON_DATA;}
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}
<CACHE> {
    {VALUE} { return LayerTypes.FILE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL; }
}

<CHECKPOINT> {
    {VALUE} { return LayerTypes.CHECKPOINT_VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL; }
}

<CLONE> {
    {OPERATOR}       { return LayerTypes.OPERATOR; }
    {STRING}         { return LayerTypes.STRING; }
    {KEY_VALUE}      { return LayerTypes.VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<COPY> {
    {VALUE} { return LayerTypes.FILE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL; }
}

<ENV> {
    {OPERATOR}       { return LayerTypes.OPERATOR; }
    {STRING}         { return LayerTypes.STRING; }
    {KEY_VALUE}      { return LayerTypes.VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<BUILD_ENV> {
    {VALUE} { return LayerTypes.BUILD_ENV_VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<FROM> {
    {LINE_DATA} { return LayerTypes.FROM_DATA; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<MEMORY> {
    {LINE_DATA} { return LayerTypes.MEMORY_AMOUNT;}
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}


<RUN> {
    {LINE_DATA} { return LayerTypes.RUN_DATA; }
    {LineContinue} { return TokenType.WHITE_SPACE;}
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<RUN_BACKGROUND> {
    {LINE_DATA} { return LayerTypes.RUN_DATA; }
    {LineContinue} { return TokenType.WHITE_SPACE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<RUN_REPEATABLE> {
    {LINE_DATA} { return LayerTypes.RUN_DATA; }
    {LineContinue} { return TokenType.WHITE_SPACE;}
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<SECRET_ENV> {
    {VALUE} { return LayerTypes.SECRET_ENV_VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<SETUP_FILE> {
    {VALUE} { return LayerTypes.FILE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}


<SKIP_REMAINING_IF> {
    {SKIP_REMAINING_AND} { return LayerTypes.SKIP_REMAINING_IF_AND; }
    {OPERATOR}       { return LayerTypes.OPERATOR; }
    {STRING}         { return LayerTypes.STRING; }
    {KEY_VALUE}      { return LayerTypes.SKIP_VALUE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}


<SPLIT> {
    {LINE_DATA} { return LayerTypes.SPLIT_NUMBER; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<EXPOSE_WEBSITE> {
    {VALUE} { return LayerTypes.WEBSITE_ITEM; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<USER> {
    {LINE_DATA} { return LayerTypes.USER_NAME; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<WAIT> {
    {VALUE} { return LayerTypes.FILE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<WORKDIR> {
    {VALUE} { return LayerTypes.FILE; }
    {LineTerminator} { yybegin(YYINITIAL); return LayerTypes.EOL;}
}

<BUTTON, CACHE, CHECKPOINT, CLONE, COPY, ENV, BUILD_ENV, FROM, MEMORY, RUN, RUN_REPEATABLE, RUN_BACKGROUND, SECRET_ENV,
 SETUP_FILE, SKIP_REMAINING_IF, SPLIT, EXPOSE_WEBSITE, USER, WAIT, WORKDIR> {
   <<EOF>> { yybegin(YYINITIAL); return LayerTypes.EOL;}
}


/* error fallback */
\s  { return TokenType.WHITE_SPACE; }
[^]  {
          return TokenType.BAD_CHARACTER;
      }
