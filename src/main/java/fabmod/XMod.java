package fabmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.server.command.CommandManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class XMod implements ModInitializer {

    // an instance of our new item
    public static final XItem X_ITEM = new XItem(new FabricItemSettings().group(ItemGroup.MISC));
    
	@Override
	public void onInitialize() {
		System.out.println("Hello Fabric world!");
        Registry.register(Registry.ITEM, new Identifier("fabmod", "x_item"), X_ITEM);
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
        	dispatcher.register(CommandManager.literal("X").executes(context -> { 
        		System.out.println("Do X Magic!");
        		return 1;
        	}));
        });
	}
}
