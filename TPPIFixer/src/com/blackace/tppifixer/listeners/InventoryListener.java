package com.blackace.tppifixer.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent e) {
		
		if(!("Choose your block".equalsIgnoreCase(e.getInventory().getName()))) return;
		e.setCancelled(true);
		if(!(e.getClick() == ClickType.LEFT)) return;
		
		ItemStack clickedItem = e.getCurrentItem();
		
		
		
		
	}
	
	@EventHandler
	public void onInventoryMoveEvent(InventoryMoveItemEvent e) {
		if("Choose your block".equalsIgnoreCase(e.getInitiator().getName())) {
			return;
		}
		if("Choose your block".equalsIgnoreCase(e.getDestination().getName())) {
			return;
		}
	}

}
