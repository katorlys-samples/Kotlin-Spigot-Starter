package com.github.katorly.exampleproject.commands

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.command.TabCompleter

fun regCommands() {
    val commands = arrayOf(
        "examplecommand",
    )
    val excutors = arrayOf<CommandExecutor>(
        CExample(),
    )
    val completers = arrayOf<TabCompleter>(
        CExample(),
    )
    for (i in commands.indices) {
        Bukkit.getPluginCommand(commands[i])!!.setExecutor(excutors[i])
        Bukkit.getPluginCommand(commands[i])!!.tabCompleter = completers[i]
    }
}