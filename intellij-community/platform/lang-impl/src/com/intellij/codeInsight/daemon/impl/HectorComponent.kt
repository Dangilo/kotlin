// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeInsight.daemon.impl

import com.intellij.ui.awt.RelativePoint
import java.awt.LayoutManager
import javax.swing.JPanel

abstract class HectorComponent(layout: LayoutManager) : JPanel(layout) {
    abstract fun showComponent(point: RelativePoint)
}