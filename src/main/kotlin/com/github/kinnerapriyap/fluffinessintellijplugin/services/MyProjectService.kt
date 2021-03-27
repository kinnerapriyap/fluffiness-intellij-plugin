package com.github.kinnerapriyap.fluffinessintellijplugin.services

import com.github.kinnerapriyap.fluffinessintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
