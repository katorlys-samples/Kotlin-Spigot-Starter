package com.github.katorly.exampleproject.events

import com.github.katorly.exampleproject.ExampleProject.Companion.plugin
import org.bukkit.Bukkit
import org.bukkit.event.Listener

val events: Array<Listener> = arrayOf(
    ServerLoad(),
)

fun regEvents() {
    if (events.isNotEmpty()) {
        for (event in events) {
            Bukkit.getPluginManager().registerEvents(event, plugin)
        }
    }
}