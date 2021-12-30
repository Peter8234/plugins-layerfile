// This is a generated file. Not intended for manual editing.
package org.webapp.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.webapp.sdk.language.psi.LayerTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LayerParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return layerfile(b, l + 1);
  }

  /* ********************************************************** */
  // BUILD_ENV BUILD_ENV_VALUE+ EOL
  public static boolean build_env_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "build_env_cmd")) return false;
    if (!nextTokenIs(b, BUILD_ENV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BUILD_ENV);
    r = r && build_env_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, BUILD_ENV_CMD, r);
    return r;
  }

  // BUILD_ENV_VALUE+
  private static boolean build_env_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "build_env_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BUILD_ENV_VALUE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, BUILD_ENV_VALUE)) break;
      if (!empty_element_parsed_guard_(b, "build_env_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BUTTON BUTTON_DATA EOL
  public static boolean button_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "button_cmd")) return false;
    if (!nextTokenIs(b, BUTTON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BUTTON, BUTTON_DATA, EOL);
    exit_section_(b, m, BUTTON_CMD, r);
    return r;
  }

  /* ********************************************************** */
  // CACHE FILE+ EOL
  public static boolean cache_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cache_cmd")) return false;
    if (!nextTokenIs(b, CACHE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CACHE);
    r = r && cache_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, CACHE_CMD, r);
    return r;
  }

  // FILE+
  private static boolean cache_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cache_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, FILE)) break;
      if (!empty_element_parsed_guard_(b, "cache_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHECKPOINT CHECKPOINT_VALUE* EOL
  public static boolean checkpoint_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checkpoint_cmd")) return false;
    if (!nextTokenIs(b, CHECKPOINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHECKPOINT);
    r = r && checkpoint_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, CHECKPOINT_CMD, r);
    return r;
  }

  // CHECKPOINT_VALUE*
  private static boolean checkpoint_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checkpoint_cmd_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CHECKPOINT_VALUE)) break;
      if (!empty_element_parsed_guard_(b, "checkpoint_cmd_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CLONE (VALUE OPERATOR (STRING | VALUE) | VALUE | STRING)+ EOL
  public static boolean clone_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_cmd")) return false;
    if (!nextTokenIs(b, CLONE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLONE);
    r = r && clone_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, CLONE_CMD, r);
    return r;
  }

  // (VALUE OPERATOR (STRING | VALUE) | VALUE | STRING)+
  private static boolean clone_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clone_cmd_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!clone_cmd_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clone_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE OPERATOR (STRING | VALUE) | VALUE | STRING
  private static boolean clone_cmd_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_cmd_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clone_cmd_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, VALUE);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE OPERATOR (STRING | VALUE)
  private static boolean clone_cmd_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_cmd_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUE, OPERATOR);
    r = r && clone_cmd_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | VALUE
  private static boolean clone_cmd_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_cmd_1_0_0_2")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  /* ********************************************************** */
  // COPY FILE FILE+ EOL
  public static boolean copy_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copy_cmd")) return false;
    if (!nextTokenIs(b, COPY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COPY, FILE);
    r = r && copy_cmd_2(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, COPY_CMD, r);
    return r;
  }

  // FILE+
  private static boolean copy_cmd_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "copy_cmd_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, FILE)) break;
      if (!empty_element_parsed_guard_(b, "copy_cmd_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENV (VALUE OPERATOR (STRING | VALUE) | VALUE (VALUE | STRING))+ EOL
  public static boolean env_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd")) return false;
    if (!nextTokenIs(b, ENV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENV);
    r = r && env_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, ENV_CMD, r);
    return r;
  }

  // (VALUE OPERATOR (STRING | VALUE) | VALUE (VALUE | STRING))+
  private static boolean env_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = env_cmd_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!env_cmd_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "env_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE OPERATOR (STRING | VALUE) | VALUE (VALUE | STRING)
  private static boolean env_cmd_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = env_cmd_1_0_0(b, l + 1);
    if (!r) r = env_cmd_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE OPERATOR (STRING | VALUE)
  private static boolean env_cmd_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUE, OPERATOR);
    r = r && env_cmd_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | VALUE
  private static boolean env_cmd_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1_0_0_2")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

  // VALUE (VALUE | STRING)
  private static boolean env_cmd_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && env_cmd_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE | STRING
  private static boolean env_cmd_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_cmd_1_0_1_1")) return false;
    boolean r;
    r = consumeToken(b, VALUE);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // EXPOSE_WEBSITE WEBSITE_ITEM+ EOL
  public static boolean expose_website_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expose_website_cmd")) return false;
    if (!nextTokenIs(b, EXPOSE_WEBSITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPOSE_WEBSITE);
    r = r && expose_website_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, EXPOSE_WEBSITE_CMD, r);
    return r;
  }

  // WEBSITE_ITEM+
  private static boolean expose_website_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expose_website_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WEBSITE_ITEM);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, WEBSITE_ITEM)) break;
      if (!empty_element_parsed_guard_(b, "expose_website_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FROM FROM_DATA EOL
  public static boolean from_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_cmd")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, FROM_DATA, EOL);
    exit_section_(b, m, FROM_CMD, r);
    return r;
  }

  /* ********************************************************** */
  // button_cmd | cache_cmd | checkpoint_cmd | from_cmd | clone_cmd | copy_cmd | env_cmd |  build_env_cmd |
  //                   from_cmd | memory_cmd | run_cmd | run_background_cmd | run_repeatable_cmd |
  //                   secret_env_cmd | setup_file_cmd | skip_remain_if_cmd | split_cmd | expose_website_cmd |
  //                   user_cmd | wait_cmd | workdir_cmd | COMMENT | PARTIAL
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = button_cmd(b, l + 1);
    if (!r) r = cache_cmd(b, l + 1);
    if (!r) r = checkpoint_cmd(b, l + 1);
    if (!r) r = from_cmd(b, l + 1);
    if (!r) r = clone_cmd(b, l + 1);
    if (!r) r = copy_cmd(b, l + 1);
    if (!r) r = env_cmd(b, l + 1);
    if (!r) r = build_env_cmd(b, l + 1);
    if (!r) r = from_cmd(b, l + 1);
    if (!r) r = memory_cmd(b, l + 1);
    if (!r) r = run_cmd(b, l + 1);
    if (!r) r = run_background_cmd(b, l + 1);
    if (!r) r = run_repeatable_cmd(b, l + 1);
    if (!r) r = secret_env_cmd(b, l + 1);
    if (!r) r = setup_file_cmd(b, l + 1);
    if (!r) r = skip_remain_if_cmd(b, l + 1);
    if (!r) r = split_cmd(b, l + 1);
    if (!r) r = expose_website_cmd(b, l + 1);
    if (!r) r = user_cmd(b, l + 1);
    if (!r) r = wait_cmd(b, l + 1);
    if (!r) r = workdir_cmd(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, PARTIAL);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean layerfile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layerfile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "layerfile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MEMORY MEMORY_AMOUNT EOL
  public static boolean memory_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_cmd")) return false;
    if (!nextTokenIs(b, MEMORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MEMORY, MEMORY_AMOUNT, EOL);
    exit_section_(b, m, MEMORY_CMD, r);
    return r;
  }

  /* ********************************************************** */
  // RUN_BACKGROUND RUN_DATA+ EOL
  public static boolean run_background_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_background_cmd")) return false;
    if (!nextTokenIs(b, RUN_BACKGROUND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN_BACKGROUND);
    r = r && run_background_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, RUN_BACKGROUND_CMD, r);
    return r;
  }

  // RUN_DATA+
  private static boolean run_background_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_background_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN_DATA);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, RUN_DATA)) break;
      if (!empty_element_parsed_guard_(b, "run_background_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RUN RUN_DATA+ EOL
  public static boolean run_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_cmd")) return false;
    if (!nextTokenIs(b, RUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN);
    r = r && run_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, RUN_CMD, r);
    return r;
  }

  // RUN_DATA+
  private static boolean run_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN_DATA);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, RUN_DATA)) break;
      if (!empty_element_parsed_guard_(b, "run_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RUN_REPEATABLE RUN_DATA+ EOL
  public static boolean run_repeatable_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_repeatable_cmd")) return false;
    if (!nextTokenIs(b, RUN_REPEATABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN_REPEATABLE);
    r = r && run_repeatable_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, RUN_REPEATABLE_CMD, r);
    return r;
  }

  // RUN_DATA+
  private static boolean run_repeatable_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run_repeatable_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUN_DATA);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, RUN_DATA)) break;
      if (!empty_element_parsed_guard_(b, "run_repeatable_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SECRET_ENV SECRET_ENV_VALUE+ EOL
  public static boolean secret_env_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secret_env_cmd")) return false;
    if (!nextTokenIs(b, SECRET_ENV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SECRET_ENV);
    r = r && secret_env_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, SECRET_ENV_CMD, r);
    return r;
  }

  // SECRET_ENV_VALUE+
  private static boolean secret_env_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secret_env_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SECRET_ENV_VALUE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, SECRET_ENV_VALUE)) break;
      if (!empty_element_parsed_guard_(b, "secret_env_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETUP_FILE FILE+ EOL
  public static boolean setup_file_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setup_file_cmd")) return false;
    if (!nextTokenIs(b, SETUP_FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SETUP_FILE);
    r = r && setup_file_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, SETUP_FILE_CMD, r);
    return r;
  }

  // FILE+
  private static boolean setup_file_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setup_file_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, FILE)) break;
      if (!empty_element_parsed_guard_(b, "setup_file_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SKIP_REMAINING_IF SKIP_VALUE OPERATOR (SKIP_VALUE | STRING) (SKIP_REMAINING_IF_AND SKIP_VALUE OPERATOR (SKIP_VALUE | STRING))* EOL
  public static boolean skip_remain_if_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_remain_if_cmd")) return false;
    if (!nextTokenIs(b, SKIP_REMAINING_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SKIP_REMAINING_IF, SKIP_VALUE, OPERATOR);
    r = r && skip_remain_if_cmd_3(b, l + 1);
    r = r && skip_remain_if_cmd_4(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, SKIP_REMAIN_IF_CMD, r);
    return r;
  }

  // SKIP_VALUE | STRING
  private static boolean skip_remain_if_cmd_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_remain_if_cmd_3")) return false;
    boolean r;
    r = consumeToken(b, SKIP_VALUE);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  // (SKIP_REMAINING_IF_AND SKIP_VALUE OPERATOR (SKIP_VALUE | STRING))*
  private static boolean skip_remain_if_cmd_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_remain_if_cmd_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!skip_remain_if_cmd_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "skip_remain_if_cmd_4", c)) break;
    }
    return true;
  }

  // SKIP_REMAINING_IF_AND SKIP_VALUE OPERATOR (SKIP_VALUE | STRING)
  private static boolean skip_remain_if_cmd_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_remain_if_cmd_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SKIP_REMAINING_IF_AND, SKIP_VALUE, OPERATOR);
    r = r && skip_remain_if_cmd_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SKIP_VALUE | STRING
  private static boolean skip_remain_if_cmd_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_remain_if_cmd_4_0_3")) return false;
    boolean r;
    r = consumeToken(b, SKIP_VALUE);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // SPLIT SPLIT_NUMBER EOL
  public static boolean split_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "split_cmd")) return false;
    if (!nextTokenIs(b, SPLIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPLIT, SPLIT_NUMBER, EOL);
    exit_section_(b, m, SPLIT_CMD, r);
    return r;
  }

  /* ********************************************************** */
  // USER USER_NAME EOL
  public static boolean user_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_cmd")) return false;
    if (!nextTokenIs(b, USER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USER, USER_NAME, EOL);
    exit_section_(b, m, USER_CMD, r);
    return r;
  }

  /* ********************************************************** */
  // WAIT FILE+ EOL
  public static boolean wait_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_cmd")) return false;
    if (!nextTokenIs(b, WAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WAIT);
    r = r && wait_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, WAIT_CMD, r);
    return r;
  }

  // FILE+
  private static boolean wait_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, FILE)) break;
      if (!empty_element_parsed_guard_(b, "wait_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WORKDIR FILE+ EOL
  public static boolean workdir_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workdir_cmd")) return false;
    if (!nextTokenIs(b, WORKDIR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORKDIR);
    r = r && workdir_cmd_1(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, WORKDIR_CMD, r);
    return r;
  }

  // FILE+
  private static boolean workdir_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workdir_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, FILE)) break;
      if (!empty_element_parsed_guard_(b, "workdir_cmd_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
