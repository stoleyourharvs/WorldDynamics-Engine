package com.thatguycy.wde;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class WDEPlugin extends JavaPlugin {

    private static final String CODENAME = "ARGON";

    @Override
    public void onEnable() {
        showBanner(true);
        // init stuff here
    }

    @Override
    public void onDisable() {
        showBanner(false);
    }

    /* ------------ Banner Helper ------------ */
    private void showBanner(boolean enabled) {
        ConsoleCommandSender console = Bukkit.getConsoleSender();

        String line = ChatColor.DARK_GRAY + "--------------------------------------------------";
        String status = enabled ? "ENABLED" : "DISABLED";
        ChatColor statusColor = enabled ? ChatColor.GREEN : ChatColor.RED;

        console.sendMessage(line);
        console.sendMessage(ChatColor.GOLD + "  WorldDynamicsEngine "
                + ChatColor.GRAY + "v" + getDescription().getVersion()
                + ChatColor.DARK_GRAY + " [" + CODENAME + "]");
        console.sendMessage("");
        console.sendMessage(statusColor + "  Status: " + status);
        console.sendMessage(ChatColor.AQUA + "  Author: " + ChatColor.WHITE + "ThatGuyCy");
        console.sendMessage(ChatColor.DARK_GRAY + "  Java : " + ChatColor.WHITE + System.getProperty("java.version"));
        console.sendMessage(ChatColor.DARK_GRAY + "  API  : " + ChatColor.WHITE + getServer().getName()
                + " " + getServer().getBukkitVersion());
        console.sendMessage(line);
    }
}