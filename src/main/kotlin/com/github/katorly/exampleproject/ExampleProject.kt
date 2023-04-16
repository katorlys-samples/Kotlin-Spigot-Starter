package com.github.katorly.exampleproject

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ExampleProject: JavaPlugin() {
    companion object {
        lateinit var INSTANCE: ExampleProject
            private set
    }

    override fun onEnable() {
        INSTANCE = this
        logger.info("[ExampleProject] Author: Katorly")
        logger.info("[ExampleProject] ExampleProject enabled!")
    }

    override fun onDisable() {
        logger.info("[ExampleProject] ExampleProject disabled!")
    }
}