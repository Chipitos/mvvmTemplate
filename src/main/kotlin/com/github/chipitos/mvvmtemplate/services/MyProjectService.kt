package com.github.chipitos.mvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.chipitos.mvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
