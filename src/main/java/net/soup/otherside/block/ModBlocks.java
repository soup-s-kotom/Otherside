package net.soup.otherside.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShape;
import net.soup.otherside.Otherside;
import net.soup.otherside.block.custom.StatueBlock;
import net.soup.otherside.block.custom.TallBlock;

public class ModBlocks {


    public static final Block SOUP_S_KOTOM_STATUE_1 = registerBlock("soup_s_kotom_statue_1", new StatueBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque(), BlockSetType.IRON));
    public static final Block TB = registerBlock("tb", new TallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).nonOpaque(), BlockSetType.ACACIA));

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
