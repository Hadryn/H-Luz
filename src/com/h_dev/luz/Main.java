package com.h_dev.luz;

import com.h_dev.luz.comandos.ComandoLuz;
import com.h_dev.luz.comandos.ComandoLuzHelp;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Plugin criado por Hadryn!");
        getCommand("luz").setExecutor(new ComandoLuz());
        getCommand("luz help").setExecutor(new ComandoLuzHelp());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Plugin desligando!");
    }
}
