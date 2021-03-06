package com.h_dev.luz.comandos;

import com.h_dev.luz.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
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
            String activemsg = (Main.config.getString("active-msg").replace("&", "§"));
            String deactivemsg = (Main.config.getString("deactive-msg").replace("&", "§"));

            if(p.hasPermission("hluz.use")){

                if(!(p.hasPotionEffect(PotionEffectType.NIGHT_VISION))){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 1));
                    p.sendMessage(activemsg);
                }else{
                    p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    p.sendMessage(deactivemsg);
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
