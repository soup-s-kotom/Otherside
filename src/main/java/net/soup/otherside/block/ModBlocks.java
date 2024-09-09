package net.soup.otherside.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.soup.otherside.Otherside;

public class ModBlocks {

    public static final Block SOUP_S_KOTOM_STATUE_1 = registerBlock("soup_s_kotom_statue_1", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Otherside.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Otherside.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterModBlocks(){
        Otherside.LOGGER.info("Registering blocks for " + Otherside.MOD_ID);

    }
}
