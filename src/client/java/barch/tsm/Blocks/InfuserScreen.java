package barch.tsm.Blocks;

import barch.tsm.Blocks.Infuser.InfuserScreenHandler;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

import static barch.tsm.TheSkinningMod.LOGGER;

public class InfuserScreen extends HandledScreen<InfuserScreenHandler> {
    private static final Identifier FUEL_HEIGHT_TEXTURE = new Identifier("container/infuser/fuel_height");
    private static final Identifier PIPE_PROGRESS_TEXTURE = new Identifier("container/infuser/pipe");
    private static final Identifier SPARKLES_TEXTURE = new Identifier("container/infuser/sparkles");
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/infuser.png");
    private static final int[] SPARKLE_PROGRESS = new int[]{61,51,41,30,20,10,0};

    public InfuserScreen(InfuserScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    protected void init() {
        super.init();
        this.titleX = (this.backgroundWidth - this.textRenderer.getWidth(this.title)) / 2;
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }

    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int backgroundX = (this.width - this.backgroundWidth) / 2;
        int backgroundY = (this.height - this.backgroundHeight) / 2;
        context.drawTexture(TEXTURE, backgroundX, backgroundY, 0, 0, this.backgroundWidth, this.backgroundHeight);
        int fuelLevel = this.handler.getFuel();
        int fuelBarHeight = MathHelper.clamp((64 * fuelLevel + 36 - 1) / 36, 0, 64);
        if (fuelBarHeight > 0) {
            context.drawGuiTexture(FUEL_HEIGHT_TEXTURE, 5, 64, 0, 0, backgroundX + 137, backgroundY + 7 + 7, 5, fuelBarHeight);
        }

        int infusingTime = this.handler.getInfuseTime();
        if (infusingTime > 0) {
            int infusingProgress = 22 - ((int)(22.0F * (1.0F - (float)infusingTime / 200.0F)));
            if (infusingProgress > 0) {
                context.drawGuiTexture(PIPE_PROGRESS_TEXTURE, 58, 22, 0, 0, backgroundX + 21, backgroundY + 26 + 7, 58, infusingProgress);
            }

            infusingProgress = SPARKLE_PROGRESS[infusingTime / 2 % 7];
            if (infusingProgress > 0) {
                context.drawGuiTexture(SPARKLES_TEXTURE, 30, 61, 0, 61 - infusingProgress, backgroundX + 92, backgroundY + 71 + 9 - infusingProgress, 30, infusingProgress);
            }
        }
    }

}
