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
                    Bukkit.getConsoleSender().sendMessage("§aFoi ativada a luz para "+p.getName());
                    p.sendMessage("§a A Luz foi Ativada!");
                }else{
                    p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    Bukkit.getConsoleSender().sendMessage("§cFoi desativada a luz para "+p.getName());
                    p.sendMessage("§cA Luz foi Desativada");
                }
            }else{
                p.sendMessage("§cVocê não tem permissão para executar este comando!");
            }
        }else{
            Bukkit.getConsoleSender().sendMessage("§cVocê não é um player!");
        }
        return false;
    }
}
