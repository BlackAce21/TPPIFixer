package com.blackace.tppifixer.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class commandChisel implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String cmdLabel, String[] args) {
		
		return false;
	}
	
	
	public void chiselInteraction(Player p){
		Inventory i = getInventory(); 
		p.openInventory(i);
		
	}
	
	private Inventory getInventory(){
		Inventory i = Bukkit.createInventory(null, 18, "Choose your block");
		ItemStack cobble = new ItemStack(Material.COBBLESTONE, 1);
		
		i.setItem(0, cobble);
		
		
		return i;
	}
	
}
