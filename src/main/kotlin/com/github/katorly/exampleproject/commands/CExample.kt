package com.github.katorly.exampleproject.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player

class CExample : TabExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (command.name.equals("examplecommand", ignoreCase = true)) {
            if (sender is Player) {
                if (sender.isOp || sender.hasPermission("exampleproject.examplecommand")) {
                    if (args[0] == "reload") {
                        // do something
                    }
                }
            }
        }
        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<String>
    ): List<String>? {
        if (sender !is Player) {
            return null
        } else if (sender.isOp || sender.hasPermission("exampleproject.examplecommand")) {
            val sub: MutableList<String> = ArrayList()
            sub.add("reload")
            return sub
        }
        return null
    }
}