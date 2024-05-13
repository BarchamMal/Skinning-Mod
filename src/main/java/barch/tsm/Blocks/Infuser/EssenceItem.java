package barch.tsm.Blocks.Infuser;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class EssenceItem extends Item {

    private String element;
    public EssenceItem(String element, Settings settings) {
        super(settings);
        this.element = element;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.tsm."+this.element+".tooltip").formatted(Formatting.DARK_PURPLE));
    }
}
