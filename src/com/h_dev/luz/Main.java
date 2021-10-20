package com.h_dev.luz;

import com.h_dev.luz.comandos.ComandoLuz;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aO PLUGIN FOI INICIADO COM SUCESSO!!");
        Bukkit.getConsoleSender().sendMessage("§aPlugin criado por Hadryn!");
        Bukkit.getConsoleSender().sendMessage("§aSolicite seu plugin no discord Hadryn#8324");
        getCommand("luz").setExecutor(new ComandoLuz());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cO PLUGIN FOI DESABILITADO COM SUCESSO!!");
    }
}
