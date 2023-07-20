package com.me.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class JunkCodePlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {
        def transform = new JunkCodeTransform()
        transform.setProject(project)
        project.extensions.getByType(AppExtension.class).registerTransform(transform)

    }







}