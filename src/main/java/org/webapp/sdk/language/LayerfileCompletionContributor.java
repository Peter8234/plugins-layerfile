package org.webapp.sdk.language;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.TokenType;
import com.intellij.util.ProcessingContext;
import org.webapp.sdk.language.psi.LayerTypes;
import org.jetbrains.annotations.NotNull;

public class LayerfileCompletionContributor extends CompletionContributor {
    private static String[] directives = {
            "BUTTON",
            "CACHE",
            "CHECKPOINT",
            "CLONE",
            "COPY",
            "ENV",
            "BUILD ENV",
            "FROM",
            "MEMORY",
            "RUN",
            "RUN BACKGROUND",
            "RUN REPEATABLE",
            "CHECKPOINT",
            "SECRET ENV",
            "SETUP FILE",
            "SKIP REMAINING IF",
            "SPLIT",
            "EXPOSE WEBSITE",
            "USER",
            "WAIT",
            "WORKDIR"
    };
    private static String[] presetVars = {
            "SUBDOMAIN",
            "DEPLOYMENT_HOST",
            "CI",
            "DEBIAN_FRONTEND",
            "GIT_TAG",
            "GIT_COMMIT",
            "GIT_SHORT_COMMIT",
            "GIT_COMMIT_TITLE",
            "GIT_CLONE_USER",
            "EXPOSE_WEBSITE_HOST",
            "WEBAPPIO",
            "GIT_BRANCH",
            "JOB_ID",
            "PULL_REQUEST_URL",
            "REPOSITORY_NAME",
            "REPOSITORY_OWNER",
            "ORGANIZATION_NAME",
            "RUNNER_ID",
            "RETRY_INDEX",
            "API_EXTRA"
    };

    public LayerfileCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LayerTypes.FROM_DATA),
                new CompletionProvider() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("vm/ubuntu:18.04"));
                        resultSet.addElement(LookupElementBuilder.create("vm/rails:2.7.1"));
                    }
                }
        );
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(TokenType.BAD_CHARACTER),
                new CompletionProvider() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        for (String directive: directives) {
                            resultSet.addElement(LookupElementBuilder.create(directive));
                        }
                    }
                }
        );
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LayerTypes.BUILD_ENV_VALUE),
                new CompletionProvider() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        for (String presetVar: presetVars) {
                            resultSet.addElement(LookupElementBuilder.create(presetVar));
                        }
                    }
                }
        );
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(LayerTypes.SKIP_VALUE),
                new CompletionProvider() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        for (String presetVar: presetVars) {
                            resultSet.addElement(LookupElementBuilder.create(presetVar));
                        }
                    }
                }
        );
    }

}
