package de.zanyar.HealCommand.healcommand;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("healCommand.heal")) {
				if(args.length == 0) {
					player.sendMessage("§aYou have been successfully healed!");
					player.setFoodLevel(20);
					player.setHealth(20);
				
					
				} else if(args.length == 1 ) {
					Player target = Bukkit.getPlayer(args[0]); 
					if(target != null) {
						target.setHealth(20);
						target.setFoodLevel(20);
						target.sendMessage("§aYou were healed!");
						player.sendMessage("§aYou healed the Player §6" + target.getPlayerListName());
					} else {
						player.sendMessage("§cThe player §6" + args[0] + " §cis not on the server!");
					}
				} else { 
					player.sendMessage("§cPlease use §6/heal <Player>§c!");
				}
					
					
			} else {
				player.sendMessage("§cYou have no right to do this!"); 
				}
		  
		} else {
			sender.sendMessage("§cYou can only use this command as a player!");
		}
			
		    

		return false;
	}

}
