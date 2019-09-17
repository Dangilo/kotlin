// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.wm.impl.status

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidget

class TogglePopupHintsPanelFactoryImpl(val project: Project) : TogglePopupHintsPanelFactory {
    override fun create(): StatusBarWidget {
        return TogglePopupHintsPanel(project)
    }

}