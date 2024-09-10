package net.soup.otherside.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.soup.otherside.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
     //   offerFoodCookingRecipe(exporter, "eye_of_cthulhu", RecipeSerializer.SMOKING, 200, ModItems.EYE_OF_CTHULHU, ModItems.COOKED_EYE_OF_CTHULHU, 0.7f );
    }
}
