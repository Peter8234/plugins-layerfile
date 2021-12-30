package org.webapp.sdk.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.webapp.sdk.language.psi.LayerTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class LayerSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey DIRECTIVE = createTextAttributesKey("DIRECTIVE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey VALUE = createTextAttributesKey("VALUE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("OTHER", HighlighterColors.BAD_CHARACTER);
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] DIRECTIVE_KEYS = new TextAttributesKey[]{DIRECTIVE};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final IElementType[] KeyWordTokens = {
            LayerTypes.BUTTON,
            LayerTypes.CACHE,
            LayerTypes.CHECKPOINT,
            LayerTypes.CLONE,
            LayerTypes.COPY,
            LayerTypes.ENV,
            LayerTypes.BUILD_ENV,
            LayerTypes.FROM,
            LayerTypes.MEMORY,
            LayerTypes.RUN,
            LayerTypes.RUN_BACKGROUND,
            LayerTypes.RUN_REPEATABLE,
            LayerTypes.SECRET_ENV,
            LayerTypes.SETUP_FILE,
            LayerTypes.SKIP_REMAINING_IF,
            LayerTypes.SKIP_REMAINING_IF_AND,
            LayerTypes.SPLIT,
            LayerTypes.EXPOSE_WEBSITE,
            LayerTypes.USER,
            LayerTypes.WAIT,
            LayerTypes.WORKDIR
    };

    private static final IElementType[] NumberTokens = {
            LayerTypes.MEMORY_AMOUNT,
            LayerTypes.SPLIT_NUMBER
    };

    private static final IElementType[] ValueTokens = {
            LayerTypes.VALUE,
            LayerTypes.SKIP_VALUE,
            LayerTypes.BUILD_ENV_VALUE
    };

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LayerfileLexerAdapter();
    }

    @Override
    public TextAttributesKey [] getTokenHighlights(IElementType tokenType) {

        if (Arrays.asList(KeyWordTokens).contains(tokenType)) {
            return DIRECTIVE_KEYS;
        }
        if (Arrays.asList(NumberTokens).contains(tokenType)) {
            return NUMBER_KEYS;
        }
        if (Arrays.asList(ValueTokens).contains(tokenType)) {
            return VALUE_KEYS;
        }
        if (tokenType.equals(LayerTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(LayerTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(LayerTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}