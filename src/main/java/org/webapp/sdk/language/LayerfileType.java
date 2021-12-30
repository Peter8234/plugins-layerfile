package org.webapp.sdk.language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LayerfileType extends LanguageFileType {

    public static final LayerfileType INSTANCE = new LayerfileType();

    private LayerfileType() {
        super(LayerfileLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Layerfile";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Layerfile Language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "layerfile";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return LayerfileIcon.FILE;
    }

}
