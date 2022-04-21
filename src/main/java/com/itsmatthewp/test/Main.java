package com.itsmatthewp.test;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("----------------------------------");
        System.out.println("ItsMatthewP Test Plugin Enabled!");
        System.out.println("----------------------------------");
        getCommand("test").setExecutor(new testCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("----------------------------------");
        System.out.println("ItsMatthewP Test Plugin Disabled!");
        System.out.println("----------------------------------");
    }
}