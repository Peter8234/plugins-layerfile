package org.webapp.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.webapp.sdk.language.LayerfileType;
import org.webapp.sdk.language.LayerfileLanguage;
import org.jetbrains.annotations.NotNull;

public class LayerfileBase  extends PsiFileBase {

    public LayerfileBase(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LayerfileLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LayerfileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Layerfile";
    }

}
