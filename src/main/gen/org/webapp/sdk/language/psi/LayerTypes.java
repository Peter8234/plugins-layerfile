// This is a generated file. Not intended for manual editing.
package org.webapp.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.webapp.sdk.language.psi.impl.*;

public interface LayerTypes {

  IElementType BUILD_ENV_CMD = new LayerElementType("BUILD_ENV_CMD");
  IElementType BUTTON_CMD = new LayerElementType("BUTTON_CMD");
  IElementType CACHE_CMD = new LayerElementType("CACHE_CMD");
  IElementType CHECKPOINT_CMD = new LayerElementType("CHECKPOINT_CMD");
  IElementType CLONE_CMD = new LayerElementType("CLONE_CMD");
  IElementType COPY_CMD = new LayerElementType("COPY_CMD");
  IElementType ENV_CMD = new LayerElementType("ENV_CMD");
  IElementType EXPOSE_WEBSITE_CMD = new LayerElementType("EXPOSE_WEBSITE_CMD");
  IElementType FROM_CMD = new LayerElementType("FROM_CMD");
  IElementType MEMORY_CMD = new LayerElementType("MEMORY_CMD");
  IElementType RUN_BACKGROUND_CMD = new LayerElementType("RUN_BACKGROUND_CMD");
  IElementType RUN_CMD = new LayerElementType("RUN_CMD");
  IElementType RUN_REPEATABLE_CMD = new LayerElementType("RUN_REPEATABLE_CMD");
  IElementType SECRET_ENV_CMD = new LayerElementType("SECRET_ENV_CMD");
  IElementType SETUP_FILE_CMD = new LayerElementType("SETUP_FILE_CMD");
  IElementType SKIP_REMAIN_IF_CMD = new LayerElementType("SKIP_REMAIN_IF_CMD");
  IElementType SPLIT_CMD = new LayerElementType("SPLIT_CMD");
  IElementType USER_CMD = new LayerElementType("USER_CMD");
  IElementType WAIT_CMD = new LayerElementType("WAIT_CMD");
  IElementType WORKDIR_CMD = new LayerElementType("WORKDIR_CMD");

  IElementType BUILD_ENV = new LayerTokenType("BUILD_ENV");
  IElementType BUILD_ENV_VALUE = new LayerTokenType("BUILD_ENV_VALUE");
  IElementType BUTTON = new LayerTokenType("BUTTON");
  IElementType BUTTON_DATA = new LayerTokenType("BUTTON_DATA");
  IElementType CACHE = new LayerTokenType("CACHE");
  IElementType CHECKPOINT = new LayerTokenType("CHECKPOINT");
  IElementType CHECKPOINT_VALUE = new LayerTokenType("CHECKPOINT_VALUE");
  IElementType CLONE = new LayerTokenType("CLONE");
  IElementType COMMENT = new LayerTokenType("COMMENT");
  IElementType COPY = new LayerTokenType("COPY");
  IElementType ENV = new LayerTokenType("ENV");
  IElementType EOL = new LayerTokenType("EOL");
  IElementType EXPOSE_WEBSITE = new LayerTokenType("EXPOSE_WEBSITE");
  IElementType FILE = new LayerTokenType("FILE");
  IElementType FROM = new LayerTokenType("FROM");
  IElementType FROM_DATA = new LayerTokenType("FROM_DATA");
  IElementType MEMORY = new LayerTokenType("MEMORY");
  IElementType MEMORY_AMOUNT = new LayerTokenType("MEMORY_AMOUNT");
  IElementType OPERATOR = new LayerTokenType("OPERATOR");
  IElementType PARTIAL = new LayerTokenType("PARTIAL");
  IElementType RUN = new LayerTokenType("RUN");
  IElementType RUN_BACKGROUND = new LayerTokenType("RUN_BACKGROUND");
  IElementType RUN_DATA = new LayerTokenType("RUN_DATA");
  IElementType RUN_REPEATABLE = new LayerTokenType("RUN_REPEATABLE");
  IElementType SECRET_ENV = new LayerTokenType("SECRET_ENV");
  IElementType SECRET_ENV_VALUE = new LayerTokenType("SECRET_ENV_VALUE");
  IElementType SETUP_FILE = new LayerTokenType("SETUP_FILE");
  IElementType SKIP_REMAINING_IF = new LayerTokenType("SKIP_REMAINING_IF");
  IElementType SKIP_REMAINING_IF_AND = new LayerTokenType("SKIP_REMAINING_IF_AND");
  IElementType SKIP_VALUE = new LayerTokenType("SKIP_VALUE");
  IElementType SPLIT = new LayerTokenType("SPLIT");
  IElementType SPLIT_NUMBER = new LayerTokenType("SPLIT_NUMBER");
  IElementType STRING = new LayerTokenType("STRING");
  IElementType USER = new LayerTokenType("USER");
  IElementType USER_NAME = new LayerTokenType("USER_NAME");
  IElementType VALUE = new LayerTokenType("VALUE");
  IElementType WAIT = new LayerTokenType("WAIT");
  IElementType WEBSITE_ITEM = new LayerTokenType("WEBSITE_ITEM");
  IElementType WORKDIR = new LayerTokenType("WORKDIR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BUILD_ENV_CMD) {
        return new LayerBuildEnvCmdImpl(node);
      }
      else if (type == BUTTON_CMD) {
        return new LayerButtonCmdImpl(node);
      }
      else if (type == CACHE_CMD) {
        return new LayerCacheCmdImpl(node);
      }
      else if (type == CHECKPOINT_CMD) {
        return new LayerCheckpointCmdImpl(node);
      }
      else if (type == CLONE_CMD) {
        return new LayerCloneCmdImpl(node);
      }
      else if (type == COPY_CMD) {
        return new LayerCopyCmdImpl(node);
      }
      else if (type == ENV_CMD) {
        return new LayerEnvCmdImpl(node);
      }
      else if (type == EXPOSE_WEBSITE_CMD) {
        return new LayerExposeWebsiteCmdImpl(node);
      }
      else if (type == FROM_CMD) {
        return new LayerFromCmdImpl(node);
      }
      else if (type == MEMORY_CMD) {
        return new LayerMemoryCmdImpl(node);
      }
      else if (type == RUN_BACKGROUND_CMD) {
        return new LayerRunBackgroundCmdImpl(node);
      }
      else if (type == RUN_CMD) {
        return new LayerRunCmdImpl(node);
      }
      else if (type == RUN_REPEATABLE_CMD) {
        return new LayerRunRepeatableCmdImpl(node);
      }
      else if (type == SECRET_ENV_CMD) {
        return new LayerSecretEnvCmdImpl(node);
      }
      else if (type == SETUP_FILE_CMD) {
        return new LayerSetupFileCmdImpl(node);
      }
      else if (type == SKIP_REMAIN_IF_CMD) {
        return new LayerSkipRemainIfCmdImpl(node);
      }
      else if (type == SPLIT_CMD) {
        return new LayerSplitCmdImpl(node);
      }
      else if (type == USER_CMD) {
        return new LayerUserCmdImpl(node);
      }
      else if (type == WAIT_CMD) {
        return new LayerWaitCmdImpl(node);
      }
      else if (type == WORKDIR_CMD) {
        return new LayerWorkdirCmdImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
