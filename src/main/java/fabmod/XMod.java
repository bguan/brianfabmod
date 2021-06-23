package fabmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class XMod implements ModInitializer {

    // an instance of our new item
    public static final XItem X_ITEM = new XItem(new FabricItemSettings().group(ItemGroup.MISC));
    
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
        Registry.register(Registry.ITEM, new Identifier("fabmod", "x_item"), X_ITEM);
	}
}
