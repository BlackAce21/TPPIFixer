package com.blackace.tppifixer.utilities;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Chisel {
	
	public static Inventory getChiselInterface(){
		Inventory i = Bukkit.createInventory(null, 36, "Choose your block");
		
		i.setItem(0, Reference.dirt);
		i.setItem(1, Reference.cobble);
		i.setItem(2, Reference.oakPlank);
		i.setItem(3, Reference.sprucePlank);
		i.setItem(4, Reference.birchPlank);
		i.setItem(5, Reference.junglePlank);
		i.setItem(6, Reference.glass);
		i.setItem(7, Reference.ice);
		i.setItem(8, Reference.icePillar);
		i.setItem(9, Reference.sand);
		i.setItem(10, Reference.mossyStone);
		i.setItem(11, Reference.diamondBlock);
		i.setItem(12, Reference.emeraldBlock);
		i.setItem(13, Reference.goldBlock);
		i.setItem(14, Reference.ironBlock);
		i.setItem(15, Reference.lapisBlock);
		i.setItem(16, Reference.limestone);
		i.setItem(17, Reference.marble);
		i.setItem(18, Reference.redstoneBlock);
		i.setItem(19, Reference.bookshelf);
		i.setItem(20, Reference.carpetBlock);
		i.setItem(21, Reference.concrete);
		i.setItem(22, Reference.factoryBlock);
		i.setItem(23, Reference.ironBar);
		i.setItem(24, Reference.fantasyBlock);
		i.setItem(25, Reference.netherrack);
		i.setItem(26, Reference.holystone);
		i.setItem(27, Reference.lavastone);
		i.setItem(28, Reference.glowstone);
		i.setItem(29, Reference.netherBrick);
		i.setItem(30, Reference.obsidian);
		i.setItem(31, Reference.templeBlock);
		i.setItem(32, Reference.mossyTempleBlock);
		i.setItem(33, Reference.armorPlatingBlock);
		i.setItem(34, Reference.glassPane);
		
		
		return i;
	}

	public static Inventory getDirt() {
		Inventory i = Bukkit.createInventory(null, 18, "Choose a Block");
		
		i.setItem
		
		return i;
	}

}
