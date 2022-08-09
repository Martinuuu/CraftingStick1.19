package tk.martinuuu.craftingstick.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.martinuuu.craftingstick.CraftingStick;

public class ModItems {

    public static final Item item_binding = registerItem("item_binding",
            new Item(new FabricItemSettings().group(ModItemGroup.Crafting_Stick)));

    public static final Item compacted_crafting_table = registerItem("compacted_crafting_table",
            new Item(new FabricItemSettings().group(ModItemGroup.Crafting_Stick)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CraftingStick.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CraftingStick.LOGGER.debug("Registering Mod items for" + CraftingStick.MOD_ID);
    }
}
