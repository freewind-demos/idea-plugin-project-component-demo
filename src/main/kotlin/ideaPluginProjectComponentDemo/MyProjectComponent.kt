package ideaPluginProjectComponentDemo

import com.intellij.openapi.components.ProjectComponent
import com.intellij.openapi.project.Project

class MyProjectComponent(private val currentProject: Project) : ProjectComponent {

    override fun projectOpened() {
        println("${currentProject.name}: > projectOpened")
    }

    override fun projectClosed() {
        println("${currentProject.name}: > projectClosed")
    }

    override fun initComponent() {
        println("${currentProject.name}: > initComponent")
    }

    override fun disposeComponent() {
        println("${currentProject.name}: > disposeComponent")
    }

}