package top.zloop.mobile.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DateAndTimeKt : Plugin<Project> {
    override fun apply(project: Project?) {


    }
}
class DateAndTimeKtExtension {
    val timeFormat = "MM/dd/yyyyHH:mm:ss.SSS"
    val dateFormat = "yyyy-MM-dd"
}