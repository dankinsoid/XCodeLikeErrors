package org.jetbrains.plugins.template.listeners

import com.intellij.analysis.problemsView.Problem
import com.intellij.analysis.problemsView.ProblemsListener

internal class MyProjectManagerListener: ProblemsListener {
    override fun problemAppeared(problem: Problem) {
        println(problem.description)
    }

    override fun problemDisappeared(problem: Problem) {
        println(problem.description)
    }

    override fun problemUpdated(problem: Problem) {
        println(problem.description)
    }

}
