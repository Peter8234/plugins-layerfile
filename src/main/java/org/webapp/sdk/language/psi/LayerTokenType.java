package org.webapp.sdk.language.psi;
import com.intellij.psi.tree.IElementType;
import org.webapp.sdk.language.LayerfileLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LayerTokenType extends IElementType {

    public LayerTokenType(@NotNull @NonNls String debugName) {
        super(debugName, LayerfileLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "LayerTokenType." + super.toString();
    }

}
