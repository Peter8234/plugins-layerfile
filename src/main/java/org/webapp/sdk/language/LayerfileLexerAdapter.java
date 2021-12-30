package org.webapp.sdk.language;

import com.intellij.lexer.FlexAdapter;

public class LayerfileLexerAdapter extends FlexAdapter {

    public LayerfileLexerAdapter() {
        super(new LayerLexer(null));
    }

}
