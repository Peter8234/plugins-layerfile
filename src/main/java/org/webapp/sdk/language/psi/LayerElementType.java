package org.webapp.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.webapp.sdk.language.LayerfileLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LayerElementType extends IElementType {

    public LayerElementType(@NotNull @NonNls String debugName) {
        super(debugName, LayerfileLanguage.INSTANCE);
    }

}