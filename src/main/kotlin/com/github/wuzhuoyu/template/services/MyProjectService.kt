package com.github.wuzhuoyu.template.services

import com.github.wuzhuoyu.template.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
