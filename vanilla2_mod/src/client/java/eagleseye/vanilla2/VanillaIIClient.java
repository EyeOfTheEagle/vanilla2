package eagleseye.vanilla2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;

public class VanillaIIClient implements ClientModInitializer {

//	private boolean screenOpened = false;

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
//		boolean isFTBQuestsLoaded = FabricLoader.getInstance().isModLoaded("ftbquests");
//		boolean isFTBTeamsLoaded = FabricLoader.getInstance().isModLoaded("ftbteams");
//		boolean isFTBLibraryLoaded = FabricLoader.getInstance().isModLoaded("ftlibrary");
//		boolean isFTBFilterLoaded = FabricLoader.getInstance().isModLoaded("ftbfiltersystem");
//		boolean isFTBCompatLoaded = FabricLoader.getInstance().isModLoaded("ftbxmodcompat");
//
//		if (!isFTBQuestsLoaded || !isFTBTeamsLoaded || !isFTBLibraryLoaded || !isFTBFilterLoaded || !isFTBCompatLoaded) {
//			ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
//				if (!screenOpened && screen instanceof TitleScreen) {
//					System.out.println("Main menu loaded. Opening CheckModsScreen.");
//					client.setScreen(new CheckModsScreen(Text.literal("Missing Mods!")));
//					screenOpened = true;
//				}
//			});
//		}
	}
}