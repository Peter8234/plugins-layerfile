package org.webapp.sdk.language;
import com.intellij.lang.Language;

public class LayerfileLanguage extends Language {
    public static final LayerfileLanguage INSTANCE = new LayerfileLanguage();
    protected LayerfileLanguage() {
        super("Layerfile");
    }
}
