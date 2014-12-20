package com.blackace.tppifixer.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {
	
	@EventHandler
	public void onInventoryEvent(InventoryClickEvent e) {
		
		if(!(e.getInventory().getName().equalsIgnoreCase("Choose your block"))) return;
		
		ItemStack clickedItem = e.getCurrentItem();
		e.setCancelled(true);
		
		
		
	}

}
