/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.org.jetbrains.kotlin.reporting

import org.jetbrains.kotlin.gradle.KotlinImportingReport

class KotlinImportingReportsContainer {
    val reports = mutableListOf<KotlinImportingReport>()

    operator fun plusAssign(report: KotlinImportingReport) {
        reports += report
    }

    operator fun plus(report: KotlinImportingReport): KotlinImportingReportsContainer = apply {
        this += report
    }

    inline operator fun <reified T : KotlinImportingReport> get(vararg reportClasses: Class<out T>): List<T> {
        return reportClasses.flatMap { reports.filterIsInstance(it) }
    }
}