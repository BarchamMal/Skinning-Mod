package barch.tsm;

import barch.tsm.Blocks.InfuserScreen;
import barch.tsm.Blocks.InfuserRegister;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;

public class TheSkinningModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		HandledScreens.register(InfuserRegister.INFUSER_SCREEN_HANDLER, InfuserScreen::new);

	}
}