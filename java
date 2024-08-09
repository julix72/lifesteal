package com.twojpakiet;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class LifestealSMP extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Rejestracja eventów
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Kod, który zostanie uruchomiony przy wyłączaniu pluginu
    }
}
