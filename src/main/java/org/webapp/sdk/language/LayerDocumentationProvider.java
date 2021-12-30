package org.webapp.sdk.language;
import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LayerDocumentationProvider extends AbstractDocumentationProvider {

    @Override
    @Nullable
    @Nls
    public String generateDoc(PsiElement element, @Nullable PsiElement originalElement) {
        System.out.println("layer documentation printed");
        System.out.println(element);
        return "TEST STRING";
    }

    @Override
    public @Nullable String generateHoverDoc(@NotNull PsiElement element, @Nullable PsiElement originalElement) {
        System.out.println("layer documentation printed");
        System.out.println(element);
        return "TEST STRING";
    }

}
