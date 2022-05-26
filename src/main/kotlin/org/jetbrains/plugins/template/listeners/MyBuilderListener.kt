package org.jetbrains.plugins.template.listeners

import org.apache.tools.ant.BuildEvent
import org.apache.tools.ant.BuildListener

class MyBuilderListener: BuildListener {

    override fun buildStarted(p0: BuildEvent?) {
    }

    override fun buildFinished(p0: BuildEvent?) {
    }

    override fun targetStarted(p0: BuildEvent?) {
    }

    override fun targetFinished(p0: BuildEvent?) {
    }

    override fun taskStarted(p0: BuildEvent?) {
    }

    override fun taskFinished(p0: BuildEvent?) {
    }

    override fun messageLogged(p0: BuildEvent?) {
        println(p0?.message)
    }
}