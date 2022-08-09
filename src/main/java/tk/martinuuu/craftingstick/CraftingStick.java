package tk.martinuuu.craftingstick;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.martinuuu.craftingstick.item.ModItems;

public class CraftingStick implements ModInitializer {
    public static final String MOD_ID = "crafting-stick";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
    }
}
