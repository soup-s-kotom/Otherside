package net.soup.otherside;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.soup.otherside.block.ModBlocks;
import net.soup.otherside.item.ModItemGroups;
import net.soup.otherside.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Otherside implements ModInitializer {
	public static final  String MOD_ID = "otherside";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Sasha amogus :)))");
		ModItemGroups.RegisterItemGroups();
		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();
	}
}