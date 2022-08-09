package tk.martinuuu.craftingstick.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tk.martinuuu.craftingstick.CraftingStick;

public class ModItemGroup {
    public static final ItemGroup Crafting_Stick = FabricItemGroupBuilder.build(
            new Identifier(CraftingStick.MOD_ID, "crafting_stick"), () -> new ItemStack(ModItems.compacted_crafting_table)); // Change that to the actual crafting stick

}
