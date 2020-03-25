// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.keymap;

import com.intellij.util.containers.ContainerUtil;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NonNls;

import java.util.Map;
import java.util.Set;

public abstract class KeymapsTestCase extends KeymapsTestCaseBase {
  // @formatter:off
  @NonNls @SuppressWarnings({"HardCodedStringLiteral"})
  protected static final Map<String, String[][]> DEFAULT_DUPLICATES = new THashMap<String, String[][]>(){{
    put("$default", new String[][] {
    { "ADD",                      "ExpandTreeNode", "Graph.ZoomIn"},
    { "BACK_SPACE",               "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "DELETE",                   "$Delete", "DatabaseView.DropAction"},
    { "ENTER",                    "Console.Execute", "Console.TableResult.EditValue", "DirDiffMenu.SynchronizeDiff", "EditorChooseLookupItem",
                                  "EditorEnter", "Images.Thumbnails.EnterAction", "NextTemplateVariable",
                                  "SearchEverywhere.SelectItem"},
    { "F2",                       "GotoNextError", "GuiDesigner.EditComponent", "GuiDesigner.EditGroup", "Console.TableResult.EditValue", "XDebugger.SetValue", "Arrangement.Rule.Edit", "Git.Reword.Commit", "Git.Rename.Local.Branch", "ShelvedChanges.Rename", "ChangesView.Rename"},
    { "alt ENTER",                "ShowIntentionActions", "Console.TableResult.EditValue"},
    { "F5",                       "Graph.ApplyCurrentLayout", "CopyElement"},
    { "F7",                       "NextDiff", "StepInto"},
    { "INSERT",                   "EditorToggleInsertState", "UsageView.Include", "DomElementsTreeView.AddElement", "DomCollectionControl.Add", "XDebugger.NewWatch"},
    { "SUBTRACT",                 "CollapseTreeNode", "Graph.ZoomOut"},
    { "TAB",                      "EditorChooseLookupItemReplace", "NextTemplateVariable", "NextParameter", "EditorIndentSelection",
                                  "EditorTab", "NextTemplateParameter", "ExpandLiveTemplateByTab", "BraceOrQuoteOut",
                                  "SearchEverywhere.CompleteCommand", "SearchEverywhere.NextTab"},
    { "LEFT",                     "EditorLeft", "Vcs.Log.GoToChild"},
    { "RIGHT",                    "EditorRight", "Vcs.Log.GoToParent"},
    { "alt DOWN",                 "ShowContent", "MethodDown", "Arrangement.Rule.Match.Condition.Move.Down", "ShowSearchHistory"},
    { "alt UP",                   "MethodUp", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "alt F1",                   "SelectIn", "ProjectViewChangeView"},
    { "alt F6",                   "CommanderSyncViews", "EditPropertyValue"},
    { "alt INSERT",               "FileChooser.NewFolder", "Generate", "NewElement"},
    { "alt LEFT",                 "Diff.PrevChange", "PreviousTab"},
    { "alt RIGHT",                "Diff.NextChange", "NextTab"},
    { "control 1",                "FileChooser.GotoHome", "GotoBookmark1", "DuplicatesForm.SendToLeft"},
    { "control 2",                "FileChooser.GotoProject", "GotoBookmark2", "DuplicatesForm.SendToRight"},
    { "control 3",                "GotoBookmark3", "FileChooser.GotoModule"},
    { "control ADD",              "ExpandAll", "ExpandExpandableComponent", "ExpandRegion"},
    { "control DIVIDE",           "CommentByLineComment", "Images.Editor.ActualSize", "Graph.ActualSize"},
    { "control DOWN",             "EditorScrollDown", "EditorLookupDown", "MethodOverloadSwitchDown", "SearchEverywhere.NavigateToNextGroup", "JupyterSelectCellBelowAction"},
    { "control ENTER",            "Console.Execute.Multiline", "DirDiffMenu.SynchronizeDiff.All", "EditorSplitLine", "ViewSource", "PyExecuteCellAction", "JupyterRunCellAction"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "control EQUALS",           "ExpandAll", "ExpandExpandableComponent", "ExpandRegion"},
    { "control F5",               "Refresh", "Rerun"},
    { "control D",                "EditorDuplicate", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control E",                "RecentFiles", "SwitcherIterateItems", "SwitcherRecentEditedChangedToggleCheckBox", "Vcs.ShowMessageHistory"},
    { "control L",                "FindNext", "Vcs.Log.FocusTextFilter"},
    { "control M",                "EditorScrollToCenter", "Vcs.ShowMessageHistory"},
    { "control N",                "FileChooser.NewFolder", "GotoClass", "GotoChangedFile"},
    { "control P",                "FileChooser.TogglePathShowing", "ParameterInfo"},
    { "control R",                "Replace", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "control SLASH",            "CommentByLineComment", "Images.Editor.ActualSize", "Graph.ActualSize"},
    { "control SPACE",            "CodeCompletion", "ChangesView.SetDefault"},
    { "control U",                "GotoSuperMethod", "CommanderSwapPanels"},
    { "control UP",               "EditorScrollUp", "EditorLookupUp", "MethodOverloadSwitchUp", "SearchEverywhere.NavigateToPrevGroup", "JupyterSelectCellAboveAction"},
    { "control SUBTRACT",         "CollapseAll", "CollapseExpandableComponent", "CollapseRegion"},
    { "control alt A",            "ChangesView.AddUnversioned", "Diagram.DeselectAll"},
    { "control alt K",            "Git.Commit.And.Push.Executor", "Hg.Commit.And.Push.Executor"},
    { "control alt E",            "Console.History.Browse", "PerforceDirect.Edit", "ToggleFindInSelection"},
    { "control alt DOWN",         "NextOccurence", "Console.TableResult.NextPage"},
    { "control alt G",            "DatabaseView.SqlGenerator", "org.jetbrains.plugins.ruby.rails.actions.generators.GeneratorsPopupAction", "Mvc.RunTarget"},
    { "control alt R",            "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction", "Django.RunManageTaskAction"},
    { "control alt UP",           "PreviousOccurence", "Console.TableResult.PreviousPage"},
    { "control alt N",            "Inline", "Console.TableResult.SetNull"},
    { "control alt M",            "ExtractMethod", "TodoViewGroupByShowModules", "ChangesView.GroupBy.Module"},
    { "control alt P",            "ChangesView.GroupBy.Directory", "IntroduceParameter", "TodoViewGroupByShowPackages", "ServiceView.GroupByServiceGroups"},
    { "control alt T",            "ServiceView.GroupByContributor", "SurroundWith"},
    { "ctrl alt C",               "IntroduceConstant", "TodoViewGroupByFlattenPackage"},
    { "ctrl alt U",               "ShowUmlDiagramPopup", "ChangesView.UnshelveSilently"},
    { "ctrl alt F",               "IntroduceField", "ShowFilterPopup"},
    { "control MINUS",            "CollapseAll", "CollapseExpandableComponent", "CollapseRegion"},
    { "control PERIOD",           "EditorChooseLookupItemDot", "CollapseSelection"},
    { "shift DELETE",             "$Cut", "Maven.Uml.Exclude"},
    { "shift ENTER",              "CollapseExpandableComponent", "Console.TableResult.EditValueMaximized", "DatabaseView.PropertiesAction", "EditorStartNewLine", "ExpandExpandableComponent", "OpenElementInNewWindow", "JupyterRunCellSelectBelowAction"},
    { "shift F4",                 "Debugger.EditTypeSource", "EditSourceInNewWindow"},
    { "shift F6",                 "RenameElement", "Git.Reword.Commit", "Git.Rename.Local.Branch", "ShelvedChanges.Rename", "ChangesView.Rename"},
    { "shift F7",                 "PreviousDiff", "SmartStepInto"},
    { "shift TAB",                "PreviousTemplateVariable", "PrevParameter", "EditorUnindentSelection", "PrevTemplateParameter", "SearchEverywhere.PrevTab"},
    { "shift alt ENTER",          "Console.TableResult.EditValueMaximized", "JupyterDebugAction"},
    { "shift alt LEFT",           "Diff.ApplyRightSide", "PreviousEditorTab"},
    { "shift alt RIGHT",          "Diff.ApplyLeftSide", "NextEditorTab"},
    { "shift alt A",              "JupyterInsertCellAboveAction", "VcsHistory.ShowAllAffected"},
    { "shift alt B",              "JupyterInsertCellBelowAction", "tasks.open.in.browser"},
    { "shift alt L",              "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    { "shift alt M",              "ChangesView.Move", "Vcs.MoveChangedLinesToChangelist"},
    { "shift ctrl C",             "CopyPaths", "DatabaseView.CopyDdlAction"},
    { "shift control D",          "TagDocumentationNavigation", "Diff.ShowSettingsPopup", "Uml.ShowDiff", "Console.TableResult.CompareCells"},
    { "shift control DOWN",       "ResizeToolWindowDown", "MoveStatementDown"},
    { "shift control ENTER",      "EditorCompleteStatement", "Console.Jpa.GenerateSql"},
    { "shift control F10",        "Console.Open", "RunClass", "RunTargetAction"},
    { "shift control F8",         "ViewBreakpoints", "EditBreakpoint"},
    { "shift control G",          "ClassTemplateNavigation", "GoToClass"},
    { "shift control H",          "ChangesView.ShelveSilently", "MethodHierarchy"},
    { "shift control LEFT",       "EditorPreviousWordWithSelection", "ResizeToolWindowLeft"},
    { "shift control RIGHT",      "EditorNextWordWithSelection", "ResizeToolWindowRight"},
    { "shift control T",          "GotoTest", "ServiceView.ShowServices"},
    { "shift control UP",         "ResizeToolWindowUp", "MoveStatementUp"},
    { "shift control U",          "ShelveChanges.UnshelveWithDialog", "EditorToggleCase"},
    { "shift control alt D",      "UML.ShowChanges", "Console.TableResult.CloneColumn"},
    { "shift control alt ENTER",  "Console.Jpa.GenerateDDL", "Console.Transaction.Commit", "JupyterRunAllAction"},
    { "shift ctrl alt P",         "IntroduceFunctionalParameter", "ReformatWithPrettierAction"},
    { "control alt Z",            "Vcs.RollbackChangedLines", "ChangesView.Revert"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "ctrl alt ENTER",           "EditorStartNewLineBefore", "QuickActionPopup"},
    { "alt button1",              "EditorCreateRectangularSelectionOnMouseDrag", "QuickEvaluateExpression"},
    { "button2",                  "EditorPasteFromX11", "GotoDeclaration", "EditorCreateRectangularSelectionOnMouseDrag"},
    { "PAGE_DOWN",                "EditorPageDown", "SearchEverywhere.NavigateToNextGroup"},
    { "PAGE_UP",                  "EditorPageUp", "SearchEverywhere.NavigateToPrevGroup"},
    { "ESCAPE",                   "EditorEscape", "FocusEditor", "Terminal.SwitchFocusToEditor"},
    { "shift ctrl alt LEFT",      "MoveElementLeft", "Terminal.MoveToolWindowTabLeft"},
    { "shift ctrl alt RIGHT",     "MoveElementRight", "Terminal.MoveToolWindowTabRight"},
    });
    put("Mac OS X 10.5+", new String[][] {
    { "Force touch",              "GotoDeclaration", "RunToCursor"},
    { "BACK_SPACE",               "$Delete", "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "shift BACK_SPACE",         "EditorBackSpace", "UsageView.Include"},
    { "meta BACK_SPACE",          "EditorDeleteLine", "$Delete"},
    { "control LEFT",             "Diff.PrevChange", "PreviousTab"},
    { "control RIGHT",            "Diff.NextChange", "NextTab"},
    { "control DOWN",             "EditorLookupDown", "JupyterSelectCellBelowAction", "MethodDown", "ShowContent"},
    { "control UP",               "EditorLookupUp", "JupyterSelectCellAboveAction", "MethodUp"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "control M",                "ChangesView.GroupBy.Module", "EditorMatchBrace", "Vcs.ShowMessageHistory", "TodoViewGroupByShowModules"},
    { "control O",                "ExportToTextFile", "OverrideMethods"},
    { "control P",                "ChangesView.GroupBy.Directory", "EditorUp", "TodoViewGroupByShowPackages", "ServiceView.GroupByServiceGroups"},
    { "control T",                "Refactorings.QuickListPopupAction", "ServiceView.GroupByContributor"},
    { "ctrl F",                   "EditorRight", "TodoViewGroupByFlattenPackage"},
    { "control ENTER",            "Generate", "JupyterRunCellAction", "NewElement", "PyExecuteCellAction"},
    { "control SPACE",            "CodeCompletion", "ChangesView.SetDefault"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "meta L",                   "Vcs.Log.FocusTextFilter", "GotoLine"},
    { "meta R",                   "Refresh", "Rerun", "Replace", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "meta 1",                   "ActivateProjectToolWindow", "FileChooser.GotoHome", "DuplicatesForm.SendToLeft"},
    { "meta 2",                   "ActivateFavoritesToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "meta 3",                   "ActivateFindToolWindow", "FileChooser.GotoModule"},
    { "meta N",                   "FileChooser.NewFolder", "Generate", "NewElement"},
    { "meta O",                   "GotoClass", "GotoChangedFile"},
    { "shift ctrl LEFT",          "Diff.ApplyRightSide", "PreviousEditorTab"},
    { "shift ctrl RIGHT",         "Diff.ApplyLeftSide", "NextEditorTab"},
    { "shift meta G",             "ClassTemplateNavigation", "GoToClass", "FindPrevious"},
    { "shift meta M",             "ChangesView.Move", "Vcs.MoveChangedLinesToChangelist"},
    { "shift meta LEFT",          "EditorLineStartWithSelection", "ResizeToolWindowLeft"},
    { "shift meta RIGHT",         "EditorLineEndWithSelection", "ResizeToolWindowRight"},
    { "shift meta CLOSE_BRACKET", "Diff.NextChange", "NextTab"},
    { "shift meta OPEN_BRACKET",  "Diff.PrevChange", "PreviousTab"},
    { "alt R",                    "Django.RunManageTaskAction", "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction"},
    { "alt DOWN",                 "EditorUnSelectWord", "Arrangement.Rule.Match.Condition.Move.Down", "MethodOverloadSwitchDown", "ShowSearchHistory"},
    { "alt UP",                   "EditorSelectWord", "Arrangement.Rule.Match.Condition.Move.Up", "MethodOverloadSwitchUp"},
    { "meta UP",                  "ShowNavBar", "SearchEverywhere.NavigateToPrevGroup"},
    { "meta DOWN",                "EditSource", "SearchEverywhere.NavigateToNextGroup"},
    });
    put("Mac OS X", new String[][] {
    { "Force touch",              "GotoDeclaration", "RunToCursor"},
    { "BACK_SPACE",               "$Delete", "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "control LEFT",             "Diff.PrevChange", "PreviousTab"},
    { "control RIGHT",            "Diff.NextChange", "NextTab"},
    { "control DOWN",             "EditorLookupDown", "JupyterSelectCellBelowAction", "MethodDown", "ShowContent"},
    { "control UP",               "EditorLookupUp", "JupyterSelectCellAboveAction", "MethodUp"},
    { "control ENTER",            "Generate", "JupyterRunCellAction", "NewElement", "PyExecuteCellAction"},
    { "control F5",               "Refresh", "Rerun"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "control N",                "Generate", "NewElement"},
    { "control M",                "ChangesView.GroupBy.Module", "TodoViewGroupByShowModules", "Vcs.ShowMessageHistory"},
    { "control P",                "ChangesView.GroupBy.Directory", "TodoViewGroupByShowPackages", "ServiceView.GroupByServiceGroups"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "meta 1",                   "ActivateProjectToolWindow", "FileChooser.GotoHome", "DuplicatesForm.SendToLeft"},
    { "meta 2",                   "ActivateFavoritesToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "meta 3",                   "ActivateFindToolWindow", "FileChooser.GotoModule"},
    { "shift ctrl LEFT",          "Diff.ApplyRightSide", "PreviousEditorTab"},
    { "shift ctrl RIGHT",         "Diff.ApplyLeftSide", "NextEditorTab"},
    { "shift meta LEFT",          "EditorLineStartWithSelection", "ResizeToolWindowLeft"},
    { "shift meta RIGHT",         "EditorLineEndWithSelection", "ResizeToolWindowRight"},
    { "alt R",                    "Django.RunManageTaskAction", "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction"},
    { "ctrl SPACE",               "ChangesView.SetDefault", "CodeCompletion"}
    });
    put("Emacs", new String[][] {
    { "TAB",                      "EditorChooseLookupItemReplace", "NextTemplateVariable", "NextParameter", "EditorIndentSelection",
                                  "EmacsStyleIndent", "NextTemplateParameter", "ExpandLiveTemplateByTab", "BraceOrQuoteOut",
                                  "SearchEverywhere.CompleteCommand", "SearchEverywhere.NextTab"},
    { "alt SLASH",                "CodeCompletion", "HippieCompletion"},
    { "control D",                "$Delete", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control K",                "EditorCutLineEnd", "CheckinProject"},
    { "control L",                "EditorScrollToCenter", "Vcs.Log.FocusTextFilter"},
    { "control M",                "EditorEnter", "EditorChooseLookupItem", "NextTemplateVariable", "Console.Execute"},
    { "control N",                "EditorDown", "FileChooser.NewFolder"},
    { "control P",                "EditorUp", "FileChooser.TogglePathShowing"},
    { "control R",                "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "FindPrevious"},
    { "control SLASH",            "$Undo", "Images.Editor.ActualSize", "Graph.ActualSize"},
    { "control SPACE",            "EditorToggleStickySelection", "ChangesView.SetDefault"},
    { "control X,N",              "Diff.NextChange", "NextTab"},
    { "control X,P",              "Diff.PrevChange", "PreviousTab"},
    { "control UP",               "EditorBackwardParagraph", "EditorLookupUp", "JupyterSelectCellAboveAction", "MethodOverloadSwitchUp", "SearchEverywhere.NavigateToPrevGroup"},
    { "control DOWN",             "EditorForwardParagraph", "EditorLookupDown", "JupyterSelectCellBelowAction", "MethodOverloadSwitchDown", "SearchEverywhere.NavigateToNextGroup"},
    { "control alt A",            "MethodUp", "ChangesView.AddUnversioned", "Diagram.DeselectAll"},
    { "control alt E",            "Console.History.Browse", "MethodDown", "PerforceDirect.Edit", "ToggleFindInSelection"},
    { "control alt G",            "GotoDeclaration", "org.jetbrains.plugins.ruby.rails.actions.generators.GeneratorsPopupAction", "Mvc.RunTarget"},
    { "control alt S",            "ShowSettings", "Find"},
    { "shift alt S",              "FindUsages", "context.save"},
    { "shift alt G",              "GotoChangedFile", "GotoClass", "hg4idea.QGotoFromPatches"},
    { "shift alt P",              "ParameterInfo", "hg4idea.QPushAction"},
    { "shift control X",          SECOND_STROKE, "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    { "shift ctrl DOWN",          "EditorForwardParagraphWithSelection", "ResizeToolWindowDown"},
    { "shift ctrl UP",            "EditorBackwardParagraphWithSelection", "ResizeToolWindowUp"},
    { "ESCAPE",                   SECOND_STROKE, "FocusEditor", "Terminal.SwitchFocusToEditor"},
    });
    put("Visual Studio", new String[][] {
    { "alt MULTIPLY",             "Images.Thumbnails.ToggleRecursive", "ShowExecutionPoint"},
    { "F7",                       "CompileDirty", "NextDiff"},
    { "ctrl P",                   "FileChooser.TogglePathShowing", "Print"},
    { "ctrl F10",                 "RunToCursor", "UpdateRunningApplication"},
    { "F5",                       "Graph.ApplyCurrentLayout", "Resume"},
    { "ctrl F1",                  "ExternalJavaDoc", "ShowErrorDescription"},
    { "shift alt CLOSE_BRACKET",  "EditorCodeBlockEnd", "EmmetNextEditPoint"},
    { "shift alt OPEN_BRACKET",   "EditorCodeBlockStart", "EmmetPreviousEditPoint"},
    { "ctrl T",                   "GotoChangedFile", "SearchEverywhere"},
    { "shift alt F11",            "FindUsagesInFile", "HighlightUsagesInFile"},
    { "ctrl alt F",               "ActivateStructureToolWindow", "ShowFilterPopup"},
    { "shift ctrl DOWN",          "FindNext", "ResizeToolWindowDown"},
    { "ctrl R",                   SECOND_STROKE, "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "shift ctrl F11",           "FocusTracer", "GotoTypeDeclaration"},
    { "shift ctrl UP",            "FindPrevious", "ResizeToolWindowUp"},
    { "ctrl SUBTRACT",            "Back", "CollapseAll", "CollapseExpandableComponent"},
    { "ctrl R,R",                 "ChangesView.Rename", "Git.Rename.Local.Branch", "Git.Reword.Commit", "RenameElement", "ShelvedChanges.Rename"},
    { "shift alt LEFT",           "Diff.ApplyRightSide", "EditorLeftWithSelection"},
    { "ctrl alt P",               "ChangesView.GroupBy.Directory", "ServiceView.GroupByServiceGroups", "TodoViewGroupByShowPackages", "XDebugger.AttachToProcess"},
    { "shift ctrl alt K",         "Git.Commit.And.Push.Executor", "Hg.Commit.And.Push.Executor"},
    { "ctrl E",                   SECOND_STROKE, "SwitcherIterateItems", "SwitcherRecentEditedChangedToggleCheckBox"},
    { "shift alt RIGHT",          "Diff.ApplyLeftSide", "EditorRightWithSelection"},
    { "ctrl N",                   "FileChooser.NewFolder", "NewElement"},
    { "ctrl F5",                  "Run", "RunClass"},
    { "ctrl alt W",               "ActivateWebToolWindow", "Vcs.UpdateProject"},
    { "shift alt ENTER",          "JupyterDebugAction", "ToggleFullScreen"},
    { "ctrl ENTER",               "Console.Execute.Multiline", "DirDiffMenu.SynchronizeDiff.All", "EditorStartNewLineBefore", "JupyterRunCellAction", "PyExecuteCellAction", "ViewSource"},
    { "ctrl MINUS",               "Back", "CollapseAll", "CollapseExpandableComponent"},
    { "shift ctrl H",             "ChangesView.ShelveSilently", "ReplaceInPath"},
    { "shift ctrl alt P",         "IntroduceFunctionalParameter", "ReformatWithPrettierAction", "VcsShowPrevChangeMarker"}
    });
    put("Default for XWin", new String[][] {
    { "shift ctrl alt button1",   "EditorAddRectangularSelectionOnMouseDrag", "QuickEvaluateExpression"},
    });
    put("Default for GNOME", new String[][] {
    { "shift alt 1",              "SelectIn", "ProjectViewChangeView"},
    { "shift alt 7",              "IDEtalk.SearchUserHistory", "FindUsages"},
    { "shift alt LEFT",           "PreviousEditorTab", "Back", "Diff.ApplyRightSide"},
    { "shift alt RIGHT",          "NextEditorTab", "Forward", "Diff.ApplyLeftSide"},
    });
    put("Default for KDE", new String[][] {
    { "control 1",                "FileChooser.GotoHome", "ShowErrorDescription", "DuplicatesForm.SendToLeft"},
    { "control 2",                "FileChooser.GotoProject", "Stop", "DuplicatesForm.SendToRight"},
    { "control 3",                "FindWordAtCaret", "FileChooser.GotoModule"},
    { "control 5",                "Refresh", "Rerun"},
    { "shift alt 1",              "SelectIn", "ProjectViewChangeView"},
    { "shift alt 7",              "IDEtalk.SearchUserHistory", "FindUsages"},
    { "shift alt L",              "ReformatCode", "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    });
    put("Eclipse", new String[][] {
    { "F2",                       "Console.TableResult.EditValue", "QuickJavaDoc", "XDebugger.SetValue", "Arrangement.Rule.Edit"},
    { "F5",                       "Graph.ApplyCurrentLayout", "StepInto"},
    { "alt DOWN",                 "ShowContent", "MoveStatementDown", "Arrangement.Rule.Match.Condition.Move.Down", "ShowSearchHistory"},
    { "alt UP",                   "MoveStatementUp", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "alt HOME",                 "ViewNavigationBar", "ShowNavBar"},
    { "control F10",              "ShowPopupMenu", "UpdateRunningApplication"},
    { "control D",                "EditorDeleteLine", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control L",                "Vcs.Log.FocusTextFilter", "GotoLine"},
    { "control N",                "ShowPopupMenu", "FileChooser.NewFolder"},
    { "control P",                "FileChooser.TogglePathShowing", "Print"},
    { "control R",                "RunToCursor", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "control U",                "EvaluateExpression", "CommanderSwapPanels"},
    { "control PAGE_DOWN",        "Diff.NextChange", "NextTab"},
    { "control PAGE_UP",          "Diff.PrevChange", "PreviousTab"},
    { "control F6",               "Diff.NextChange", "NextTab"},
    { "control alt DOWN",         "Console.TableResult.NextPage", "EditorDuplicateLines"},
    { "control alt E",            "Console.History.Browse", "ExecuteInPyConsoleAction", "PerforceDirect.Edit", "ToggleFindInSelection"},
    { "control alt LEFT",         "Diff.NextChange", "NextTab"},
    { "control alt RIGHT",        "Diff.PrevChange", "PreviousTab"},
    { "shift alt D",              "hg4idea.QFold", "Debug"},
    { "shift alt G",              "RerunTests", "hg4idea.QGotoFromPatches"},
    { "shift alt L",              "IntroduceVariable", "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    { "shift alt P",              "hg4idea.QPushAction", "ImplementMethods"},
    { "shift alt R",              "RenameElement", "Git.Reword.Commit", "Git.Rename.Local.Branch", "ShelvedChanges.Rename", "ChangesView.Rename"},
    { "shift alt S",              "ShowPopupMenu", "context.save"},
    { "shift alt T",              "ShowPopupMenu", "tasks.switch"},
    { "shift control DOWN",       "ResizeToolWindowDown", "MethodDown"},
    { "shift control E",          "RecentLocations", "EditSource"},
    { "shift control F6",         "ChangeTypeSignature", "Diff.PrevChange", "PreviousTab"},
    { "shift control F11",        "ToggleBookmark", "FocusTracer"},
    { "shift control G",          "FindUsagesInFile", "ClassTemplateNavigation", "GoToClass"},
    { "shift control I",          "QuickImplementations", "XDebugger.Inspect"},
    { "shift control UP",         "ResizeToolWindowUp", "MethodUp"},
    { "shift control K",          "Vcs.Push", "FindPrevious"},
    { "shift control X",          "EditorToggleCase", "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    { "shift control T",          "GotoClass", "GotoChangedFile"},
    { "shift ctrl alt RIGHT",     "PreviousEditorTab", "Terminal.MoveToolWindowTabRight"},
    { "shift ctrl alt LEFT",      "NextEditorTab", "Terminal.MoveToolWindowTabLeft"},
    });
    put("NetBeans 6.5", new String[][] {
    { "F4",                       "RunToCursor", "EditSource"},
    { "F5",                       "Debugger.ResumeThread", "Resume", "Graph.ApplyCurrentLayout"},
    { "alt DOWN",                 "GotoNextElementUnderCaretUsage", "ShowContent", "Arrangement.Rule.Match.Condition.Move.Down", "ShowSearchHistory"},
    { "alt UP",                   "GotoPrevElementUnderCaretUsage", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "control 1",                "ActivateProjectToolWindow", "DuplicatesForm.SendToLeft"},
    { "control 2",                "ActivateProjectToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "control 3",                "ActivateProjectToolWindow", "FileChooser.GotoModule"},
    { "control BACK_SPACE",       "EditorDeleteToWordStart", "ToggleDockMode"},
    { "control DIVIDE",           "CollapseRegionRecursively", "Images.Editor.ActualSize", "Graph.ActualSize"},
    { "control M",                "Vcs.ShowMessageHistory", "Move"},
    { "control N",                "NewElement", "FileChooser.NewFolder"},
    { "control R",                "RenameElement", "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "Git.Reword.Commit", "Git.Rename.Local.Branch", "ShelvedChanges.Rename", "ChangesView.Rename"},
    { "control U",                SECOND_STROKE, "CommanderSwapPanels"},
    { "control O",                "GotoClass", "GotoChangedFile"},
    { "control PERIOD",           "GotoNextError", "EditorChooseLookupItemDot"},
    { "control PAGE_DOWN",        "Diff.NextChange", "NextTab"},
    { "control PAGE_UP",          "Diff.PrevChange", "PreviousTab"},
    { "control alt DOWN",         "MethodDown", "NextOccurence", "Console.TableResult.NextPage"},
    { "control alt UP",           "MethodUp", "PreviousOccurence", "Console.TableResult.PreviousPage"},
    { "control alt shift P",      "Print", "ReformatWithPrettierAction"},
    { "shift F4",                 "RecentFiles", "SwitcherIterateItems", "SwitcherRecentEditedChangedToggleCheckBox", "Debugger.EditTypeSource", "Vcs.ShowMessageHistory", "EditSourceInNewWindow"},
    { "shift alt F9",             "ChooseDebugConfiguration", "ValidateXml", "ValidateJsp"},
    { "shift alt D",              "ToggleFloatingMode", "hg4idea.QFold"},
    { "shift control DOWN",       "EditorDuplicate", "ResizeToolWindowDown", },
    { "shift control F7",         "HighlightUsagesInFile", "XDebugger.NewWatch"},
    { "shift control UP",         "EditorDuplicate", "ResizeToolWindowUp", },
    { "shift ctrl C",             "CommentByLineComment", "DatabaseView.CopyDdlAction"},
    { "shift control H",          "ChangesView.ShelveSilently", "ReplaceInPath"},
    { "shift control K",          "HippieCompletion", "Vcs.Push"},
    { "control alt E",            "Console.History.Browse", "ExecuteInPyConsoleAction", "PerforceDirect.Edit", "ToggleFindInSelection"},
    });
    put("Eclipse (Mac OS X)", new String[][] {
    { "meta BACK_SPACE",          "EditorDeleteToWordStart", "$Delete"},
    { "F2",                       "Console.TableResult.EditValue", "QuickJavaDoc", "XDebugger.SetValue", "Arrangement.Rule.Edit", "Git.Reword.Commit", "Git.Rename.Local.Branch", "ShelvedChanges.Rename", "ChangesView.Rename"},
    { "F3",                       "GotoDeclaration", "EditSource"},
    { "F5",                       "StepInto", "Graph.ApplyCurrentLayout"},
    { "alt DOWN",                 "MoveStatementDown", "Arrangement.Rule.Match.Condition.Move.Down", "MethodOverloadSwitchDown", "ShowSearchHistory"},
    { "alt UP",                   "MoveStatementUp", "Arrangement.Rule.Match.Condition.Move.Up", "MethodOverloadSwitchUp"},
    { "control PERIOD",           "EditorChooseLookupItemDot", "HippieCompletion"},
    { "meta 1",                   "FileChooser.GotoHome", "ShowIntentionActions", "DuplicatesForm.SendToLeft"},
    { "meta 3",                   "FileChooser.GotoModule", "GotoAction"},
    { "meta D",                   "EditorDeleteLine", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "meta I",                   "DatabaseView.PropertiesAction", "AutoIndentLines"},
    { "meta P",                   "FileChooser.TogglePathShowing", "Print"},
    { "meta R",                   "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "RunToCursor"},
    { "meta U",                   "CommanderSwapPanels", "EvaluateExpression"},
    { "meta W",                   "CloseContent", "CloseActiveTab"},
    { "meta F6",                  "Diff.NextChange", "NextTab"},
    { "shift meta T",             "GotoClass", "GotoChangedFile"},
    { "meta alt LEFT",            "Diff.PrevChange", "PreviousTab"},
    { "meta alt RIGHT",           "Diff.NextChange", "NextTab"},
    { "meta alt DOWN",            "Console.TableResult.NextPage", "EditorDuplicateLines"},
    { "shift meta F11",           "Run", "FocusTracer"},
    { "shift meta G",             "ClassTemplateNavigation", "GoToClass", "FindUsages"},
    { "shift meta K",             "Vcs.Push", "FindPrevious"},
    { "shift meta X",             "EditorToggleCase", "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    { "shift meta U",             "FindUsagesInFile", "ShelveChanges.UnshelveWithDialog"},
    { "shift meta F6",            "Diff.PrevChange", "PreviousTab"},
    { "control shift alt Z",      "Vcs.RollbackChangedLines", "ChangesView.Revert"},
    });
    put("Sublime Text", new String[][] {
    { "F2",                       "Arrangement.Rule.Edit", "ChangesView.Rename", "Console.TableResult.EditValue", "Git.Reword.Commit", "Git.Rename.Local.Branch", "GotoNextBookmark", "GuiDesigner.EditComponent", "GuiDesigner.EditGroup", "ShelvedChanges.Rename", "XDebugger.SetValue"},
    { "ctrl ADD",                 "EditorIncreaseFontSize", "ExpandAll", "ExpandExpandableComponent"},
    { "ctrl D",                   "CompareTwoFiles", "Diff.ShowDiff", "FileChooser.GotoDesktop", "SelectNextOccurrence", "SendEOF"},
    { "ctrl ENTER",               "Console.Execute.Multiline", "DirDiffMenu.SynchronizeDiff.All", "EditorStartNewLine", "JupyterRunCellAction", "PyExecuteCellAction", "ViewSource"},
    { "ctrl EQUALS",              "EditorIncreaseFontSize", "ExpandAll", "ExpandExpandableComponent"},
    { "ctrl L",                   "EditorSelectWord", "Vcs.Log.FocusTextFilter"},
    { "ctrl M",                   "EditorMatchBrace", "Vcs.ShowMessageHistory"},
    { "ctrl MINUS",               "CollapseAll", "CollapseExpandableComponent", "EditorDecreaseFontSize"},
    { "ctrl N",                   "FileChooser.NewFolder", "NewElement"},
    { "ctrl P",                   "FileChooser.TogglePathShowing", "GotoFile"},
    { "ctrl R",                   "FileStructurePopup", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "ctrl SUBTRACT",            "CollapseAll", "CollapseExpandableComponent", "EditorDecreaseFontSize"},
    { "ctrl alt DOWN",            "Console.TableResult.NextPage", "EditorCloneCaretBelow"},
    { "ctrl alt UP",              "Console.TableResult.PreviousPage", "EditorCloneCaretAbove"},
    { "shift ENTER",              "CollapseExpandableComponent", "Console.TableResult.EditValueMaximized", "DatabaseView.PropertiesAction", "EditorSplitLine", "ExpandExpandableComponent", "JupyterRunCellSelectBelowAction", "OpenElementInNewWindow"},
    { "shift ctrl D",             "Console.TableResult.CompareCells", "EditorDuplicate", "Uml.ShowDiff"},
    { "shift ctrl DOWN",          "MoveLineDown", "ResizeToolWindowDown"},
    { "shift ctrl ENTER",         "Console.Jpa.GenerateSql", "EditorStartNewLineBefore"},
    { "shift ctrl T",             "ReopenClosedTab", "ServiceView.ShowServices"},
    { "shift ctrl UP",            "MoveLineUp", "ResizeToolWindowUp"}
    });
    put("Sublime Text (Mac OS X)", new String[][] {
    { "F2",                       "Arrangement.Rule.Edit", "ChangesView.Rename", "Console.TableResult.EditValue", "Git.Reword.Commit", "Git.Rename.Local.Branch", "GotoNextBookmark", "GuiDesigner.EditComponent", "GuiDesigner.EditGroup", "ShelvedChanges.Rename", "XDebugger.SetValue"},
    { "meta ADD",                 "EditorIncreaseFontSize", "ExpandAll", "ExpandExpandableComponent"},
    { "meta BACK_SPACE",          "EditorDeleteToLineStart", "$Delete"},
    { "meta D",                   "CompareTwoFiles", "Diff.ShowDiff", "FileChooser.GotoDesktop", "SelectNextOccurrence", "SendEOF"},
    { "meta DOWN",                "EditorTextEnd", "SearchEverywhere.NavigateToNextGroup"},
    { "meta ENTER",               "Console.Execute.Multiline", "DirDiffMenu.SynchronizeDiff.All", "EditorStartNewLine", "ViewSource"},
    { "meta EQUALS",              "EditorIncreaseFontSize", "ExpandAll", "ExpandExpandableComponent"},
    { "meta I",                   "DatabaseView.PropertiesAction", "IncrementalSearch"},
    { "meta L",                   "EditorSelectWord", "Vcs.Log.FocusTextFilter"},
    { "meta MINUS",               "CollapseAll", "CollapseExpandableComponent", "EditorDecreaseFontSize"},
    { "meta P",                   "FileChooser.TogglePathShowing", "GotoFile"},
    { "meta R",                   "FileStructurePopup", "Refresh", "Rerun", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "meta SUBTRACT",            "CollapseAll", "CollapseExpandableComponent", "EditorDecreaseFontSize"},
    { "meta UP",                  "EditorTextStart", "SearchEverywhere.NavigateToPrevGroup"},
    { "meta alt DOWN",            "Console.TableResult.NextPage", "GotoDeclaration"},
    { "meta alt G",               "DatabaseView.SqlGenerator", "FindWordAtCaret", "org.jetbrains.plugins.ruby.rails.actions.generators.GeneratorsPopupAction"},
    { "shift ENTER",              "CollapseExpandableComponent", "Console.TableResult.EditValueMaximized", "EditorSplitLine", "ExpandExpandableComponent", "JupyterRunCellSelectBelowAction", "OpenElementInNewWindow"},
    { "shift meta D",             "Console.TableResult.CompareCells", "EditorDuplicate", "Uml.ShowDiff"},
    { "shift meta ENTER",         "Console.Jpa.GenerateSql", "EditorStartNewLineBefore"},
    { "shift meta T",             "ReopenClosedTab", "ServiceView.ShowServices"}
    });
  }};
  // @formatter:on

  @NonNls protected static final Set<String> DEFAULT_UNKNOWN_ACTION_IDS = ContainerUtil.set(
    "ActivateCommitToolWindow", "ActivateVersionControlToolWindow", "ActivateFavoritesToolWindow", "ActivateCommanderToolWindow",
    "ActivateDebugToolWindow", "ActivateServicesToolWindow", "ActivateFindToolWindow", "ActivateHierarchyToolWindow",
    "ActivateMessagesToolWindow", "ActivateProjectToolWindow", "ActivateRunToolWindow", "ActivateStructureToolWindow",
    "ActivateTODOToolWindow", "ActivateWebToolWindow", "ActivatePaletteToolWindow", "ActivateTerminalToolWindow",
    "IDEtalk.SearchUserHistory", "IDEtalk.SearchUserHistory", "IDEtalk.Rename", "CIDR.Lang.Cpp.GenerateDefinitions",
    "ActivateErrorsInSolutionToolWindow", "ActivateUnitTestsToolWindow", "ActivateInspectionResultsToolWindow",
    "ActivateDatabaseToolWindow", "ActivateBuildToolWindow", "ActivateNuGetToolWindow", "RiderBackendAction-EncapsulateField",
    ""
  );

  @NonNls protected static final Set<String> DEFAULT_BOUND_ACTIONS = ContainerUtil.set(
    "EditorDelete"
  );
}
