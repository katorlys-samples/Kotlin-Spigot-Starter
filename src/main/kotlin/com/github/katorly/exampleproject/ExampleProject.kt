package com.github.katorly.exampleproject

import com.github.katorly.exampleproject.commands.regCommands
import com.github.katorly.exampleproject.events.regEvents
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getScheduler
import org.bukkit.event.HandlerList.unregisterAll
import org.bukkit.plugin.java.JavaPlugin

class ExampleProject: JavaPlugin() {
    companion object {
        lateinit var plugin: ExampleProject
            private set
    }

    override fun onEnable() {
        plugin = this
        regCommands()
        regEvents()
        logger.info("[ExampleProject] Repo: https://github.com/katorlys/ExampleProject")
        logger.info("[ExampleProject] Author: Katorly")
        logger.info("[ExampleProject] ExampleProject enabled!")
    }

    override fun onDisable() {
        unregisterAll(this)
        getScheduler().cancelTasks(this)
        logger.info("[ExampleProject] ExampleProject disabled!")
    }
}