package barch.tsm.Armor;

import net.minecraft.component.Component;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Iterator;

import static barch.tsm.Tags.KNIVES;
import static barch.tsm.Tags.MACE_MINEABLE;
import static barch.tsm.TheSkinningMod.LOGGER;


public class UpgradeKitItem extends Item {

    public String type;
    public Item[] armorItems;

    public UpgradeKitItem(Settings settings, String type, Item[] armorItems ) {
        super(settings);
        this.type = type;
        this.armorItems = armorItems;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        // Logic for if the player has an upgrade in main hand and in offhand.
        ItemStack itemStack = this.getDefaultStack();
        itemStack.setCount(user.getStackInHand(hand).getCount());
        if (!(user.getMainHandStack().getItem() instanceof UpgradeKitItem)) {
            return TypedActionResult.fail(itemStack);
        }
        if (!(user.getOffHandStack().getItem() instanceof ArmorItem)) {
            return TypedActionResult.fail(itemStack);
        }
        if (!((ArmorItem) user.getOffHandStack().getItem()).getMaterial().getIdAsString().contentEquals(this.type)) {
            LOGGER.info(this.type);
            LOGGER.info(((ArmorItem)user.getOffHandStack().getItem()).getMaterial().getIdAsString());
            return TypedActionResult.fail(itemStack);
        }

        ItemStack piece = user.getOffHandStack();
        ItemStack newStack = this.armorItems[getSlotNumber(((ArmorItem)piece.getItem()).getSlotType())].getDefaultStack();
        ComponentMap components = piece.getComponents();
        ComponentMap.Builder emptyComponents = ComponentMap.builder();

        emptyComponents.add(DataComponentTypes.CAN_BREAK, components.get(DataComponentTypes.CAN_BREAK));
        emptyComponents.add(DataComponentTypes.CUSTOM_DATA, components.get(DataComponentTypes.CUSTOM_DATA));
        emptyComponents.add(DataComponentTypes.CUSTOM_NAME, components.get(DataComponentTypes.CUSTOM_NAME));
        emptyComponents.add(DataComponentTypes.DAMAGE, components.get(DataComponentTypes.DAMAGE));
        emptyComponents.add(DataComponentTypes.TRIM, components.get(DataComponentTypes.TRIM));
        emptyComponents.add(DataComponentTypes.REPAIR_COST, components.get(DataComponentTypes.REPAIR_COST));
        emptyComponents.add(DataComponentTypes.ATTRIBUTE_MODIFIERS, components.get(DataComponentTypes.ATTRIBUTE_MODIFIERS));
        emptyComponents.add(DataComponentTypes.RECIPES, components.get(DataComponentTypes.RECIPES));
        emptyComponents.add(DataComponentTypes.MAX_STACK_SIZE, components.get(DataComponentTypes.MAX_STACK_SIZE));
        emptyComponents.add(DataComponentTypes.LORE, components.get(DataComponentTypes.LORE));
        emptyComponents.add(DataComponentTypes.ITEM_NAME, components.get(DataComponentTypes.ITEM_NAME));
        emptyComponents.add(DataComponentTypes.FOOD, components.get(DataComponentTypes.FOOD));
        emptyComponents.add(DataComponentTypes.CUSTOM_MODEL_DATA, components.get(DataComponentTypes.CUSTOM_MODEL_DATA));
        emptyComponents.add(DataComponentTypes.LORE, components.get(DataComponentTypes.LORE));
        emptyComponents.add(DataComponentTypes.ITEM_NAME, components.get(DataComponentTypes.ITEM_NAME));
        emptyComponents.add(DataComponentTypes.ENCHANTMENTS, components.get(DataComponentTypes.ENCHANTMENTS));
        emptyComponents.add(DataComponentTypes.STORED_ENCHANTMENTS, components.get(DataComponentTypes.STORED_ENCHANTMENTS));
        emptyComponents.build();

        newStack.applyComponentsFrom(emptyComponents.build());

        user.equipStack(EquipmentSlot.OFFHAND, newStack);
        itemStack.decrement(1);
        user.swingHand(hand);
        return TypedActionResult.success(itemStack);

    }

    private int getSlotNumber(EquipmentSlot slot) {
        switch (slot) {
            case FEET:
                return 0;
            case LEGS:
                return 1;
            case CHEST:
                return 2;
            case HEAD:
                return 3;
        }
        return 4;
    }

}
