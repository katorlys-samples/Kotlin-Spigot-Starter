package com.github.katorly.exampleproject.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerLoadEvent

class ServerLoad : Listener {
    @EventHandler
    fun onServerLoad(e: ServerLoadEvent) {
        // do something
    }
}