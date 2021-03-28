package org.oakbricks.redtext;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RedText v1.0 by OakBricks has been summoned!");
        Bukkit.getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }


    @Override
    public void onDisable() {
        getLogger().info("RedText v1.0 by OakBricks has been killed!");
    }
}
