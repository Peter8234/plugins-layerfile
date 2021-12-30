package org.webapp.sdk.language;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;
import java.util.Map;

public class LayerColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", LayerSyntaxHighlighter.DIRECTIVE),
            new AttributesDescriptor("Comment", LayerSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Operator", LayerSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("String", LayerSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", LayerSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Value", LayerSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", LayerSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return LayerfileIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new LayerSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# comment\n" +
                "RUN apt-get update\n" +
                "ENV NODE_OPTIONS=\"--max-old-space-size=8192\"\n" +
                "MEMORY 1G\n" +
                "SKIP REMAINING IF API_EXTRA=\"\" AND LAYERCI != true\n" +
                "BAD VALUE";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Layerfile";
    }

}