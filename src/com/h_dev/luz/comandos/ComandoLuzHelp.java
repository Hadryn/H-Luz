package com.h_dev.luz.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoLuzHelp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("hluz.use")){
                p.sendMessage("Use /luz para ativar ou desativar a claridade.");
            }else{
                p.sendMessage("Você não tem permissão para executar este comando!");
            }

        }else{
            Bukkit.getConsoleSender().sendMessage("Você não é um player!");
        }



        return false;
    }
}
