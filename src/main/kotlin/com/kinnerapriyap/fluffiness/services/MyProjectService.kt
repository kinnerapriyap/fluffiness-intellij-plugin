package com.kinnerapriyap.fluffiness.services

import com.kinnerapriyap.fluffiness.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
