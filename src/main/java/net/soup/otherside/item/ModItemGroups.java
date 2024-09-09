package net.soup.otherside.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.soup.otherside.Otherside;
import net.soup.otherside.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup OTHERSIDE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Otherside.MOD_ID, "otherside"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.otherside"))
                    .icon(() -> new ItemStack(ModItems.EYE_OF_CTHULHU)).entries((displayContext, entries) -> {



                        entries.add(ModItems.EYE_OF_CTHULHU);
                        entries.add(ModItems.COOKED_EYE_OF_CTHULHU);


                        entries.add(ModBlocks.SOUP_S_KOTOM_STATUE_1);


                    }).build());
    public static void RegisterItemGroups(){
        Otherside.LOGGER.info("Regestering item groups for " +Otherside.MOD_ID);
    }
}
