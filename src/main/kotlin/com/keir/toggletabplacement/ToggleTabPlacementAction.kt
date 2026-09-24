package com.keir.toggletabplacement

import com.intellij.ide.ui.UISettings
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import javax.swing.SwingConstants

class ToggleTabPlacementAction : AnAction() {

    override fun getActionUpdateThread(): ActionUpdateThread = ActionUpdateThread.BGT

    override fun actionPerformed(event: AnActionEvent) {
        val uiSettings = UISettings.getInstance()

        // If tabs are at the top, change to left. Otherwise, change back to top.
        if (uiSettings.editorTabPlacement == SwingConstants.TOP) {
            uiSettings.editorTabPlacement = SwingConstants.LEFT
        } else {
            uiSettings.editorTabPlacement = SwingConstants.TOP
        }

        // Force the Rider UI to visually redraw instantly
        uiSettings.fireUISettingsChanged()
    }
}
