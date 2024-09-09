package net.soup.otherside.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.soup.otherside.Otherside;

public class ModItems {

    public static final Item EYE_OF_CTHULHU = registerItem( "eye_of_cthulhu", new Item(new FabricItemSettings()));
    public static final Item COOKED_EYE_OF_CTHULHU = registerItem("cooked_eye_of_cthulhu", new Item(new FabricItemSettings()));



    //adding items to ingredients item group
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ){
        entries.add(EYE_OF_CTHULHU);
    }
    private  static void  addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries){
        entries.add(COOKED_EYE_OF_CTHULHU);
    }

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Otherside.MOD_ID, name), item);
    }


    public static void  registerModItems () {
        Otherside.LOGGER.info("registering mod items for " + Otherside.MOD_ID);
        //adding IngredientsItemGroup items into ingredients item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        //adding foodAndDrinkItemGroup items into food And Drink item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
