package com.h_dev.luz.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ComandoLuz implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            if(p.hasPermission("hluz.use")){

                if(!(p.hasPotionEffect(PotionEffectType.NIGHT_VISION))){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 1));
                    Bukkit.getConsoleSender().sendMessage("§aFOI ATIVADA A LUZ PARA "+p.getName());
                    p.sendMessage("§a A LUZ FOI ATIVADA!");
                }else{
                    p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    Bukkit.getConsoleSender().sendMessage("§cFOI DESATIVADA A LUZ PARA "+p.getName());
                    p.sendMessage("§c A LUZ FOI DESATIVADA");
                }
            }else{
                p.sendMessage("§cCOMANDO NEGADO PELO ADMINISTRADOR!");
            }
        }else{
            Bukkit.getConsoleSender().sendMessage("§cCOMANDO EXCLUSIVO PARA PLAYERS!");
        }
        return false;
    }
}
