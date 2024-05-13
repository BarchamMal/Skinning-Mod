package barch.tsm.Blocks.Infuser;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;

import static barch.tsm.Blocks.InfuserRegister.INFUSER_SCREEN_HANDLER;

public class InfuserScreenHandler extends ScreenHandler {


    private static final int[] INGREDIENTS_SLOT_IDS = new int[]{0,1,2,3};
    private static final int FUEL_SLOT_ID = 4;
    private static final int OUTPUT_SLOT_ID = 5;
    private static final int INFUSER_INVENTORY_SIZE = 6;
    private static final int PROPERTY_COUNT = 2;
    private static final int INVENTORY_START = 6;
    private static final int INVENTORY_END = 33;
    private static final int HOTBAR_START = 33;
    private static final int HOTBAR_END = 42;
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;


    public InfuserScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(INFUSER_INVENTORY_SIZE), new ArrayPropertyDelegate(PROPERTY_COUNT));
    }

    public InfuserScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(INFUSER_SCREEN_HANDLER, syncId);
        checkSize(inventory, INFUSER_INVENTORY_SIZE);
        checkDataCount(propertyDelegate, PROPERTY_COUNT);
        this.inventory = inventory;
        this.propertyDelegate = propertyDelegate;
        this.addSlot(new InfuserScreenHandler.IngredientSlot(inventory, INGREDIENTS_SLOT_IDS[0], 15, 16));
        this.addSlot(new InfuserScreenHandler.IngredientSlot(inventory, INGREDIENTS_SLOT_IDS[1], 33, 16));
        this.addSlot(new InfuserScreenHandler.IngredientSlot(inventory, INGREDIENTS_SLOT_IDS[2], 51, 16));
        this.addSlot(new InfuserScreenHandler.IngredientSlot(inventory, INGREDIENTS_SLOT_IDS[3], 69, 16));
        this.addSlot(new InfuserScreenHandler.LapisSlot(inventory, FUEL_SLOT_ID, 152, 15));
        this.addSlot(new InfuserScreenHandler.OutputSlot(inventory, OUTPUT_SLOT_ID, 42, 56));
        this.addProperties(propertyDelegate);

        int i;
        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }

    }


    public int getFuel() {
        return this.propertyDelegate.get(1);
    }

    public int getInfuseTime() {
        return this.propertyDelegate.get(0);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slotIndex) {
        Slot slot = this.slots.get(slotIndex);
        if (slot == null || !slot.hasStack()) {
            return ItemStack.EMPTY;
        }

        ItemStack stackInSlot = slot.getStack();
        ItemStack stackToMove = stackInSlot.copy();

        if (slotIndex >= INVENTORY_START && slotIndex <= HOTBAR_END) {
            // Try moving the item to one of the infuser ingredient slots
            if (this.insertItem(stackInSlot, INGREDIENTS_SLOT_IDS[0], INGREDIENTS_SLOT_IDS[3] + 1, false)) {
                slot.onQuickTransfer(stackInSlot, stackToMove);
            } else {
                // Try moving the item to the fuel (lapis) slot if valid
                Slot lapisSlot = this.slots.get(FUEL_SLOT_ID);
                if (lapisSlot instanceof LapisSlot && ((LapisSlot) lapisSlot).canInsert(stackInSlot)) {
                    if (this.insertItem(stackInSlot, FUEL_SLOT_ID, FUEL_SLOT_ID + 1, false)) {
                        slot.onQuickTransfer(stackInSlot, stackToMove);
                    } else {
                        return ItemStack.EMPTY;
                    }
                } else {
                    return ItemStack.EMPTY;
                }
            }
        } else if (slotIndex >= INGREDIENTS_SLOT_IDS[0] && slotIndex <= INGREDIENTS_SLOT_IDS[3]) {
            // Try moving the item to the player's inventory
            if (this.insertItem(stackInSlot, INVENTORY_START, HOTBAR_END, false)) {
                slot.onQuickTransfer(stackInSlot, stackToMove);
            } else {
                return ItemStack.EMPTY;
            }
        } else if (slotIndex == FUEL_SLOT_ID) {
            // Try moving the item to the player's inventory
            if (this.insertItem(stackInSlot, INVENTORY_START, HOTBAR_END, false)) {
                slot.onQuickTransfer(stackInSlot, stackToMove);
            } else {
                return ItemStack.EMPTY;
            }
        } else if (slotIndex == OUTPUT_SLOT_ID) {
            // Try moving the item to the player's inventory
            if (this.insertItem(stackInSlot, INVENTORY_START, HOTBAR_END, false)) {
                slot.onQuickTransfer(stackInSlot, stackToMove);
            } else {
                return ItemStack.EMPTY;
            }
        }

        // If the infuser is full and trying to move only one item, reduce it to the maximum stack size
        if (slotIndex >= INGREDIENTS_SLOT_IDS[0] && slotIndex <= INGREDIENTS_SLOT_IDS[3] && stackToMove.getCount() == 1) {
            int maxStackSize = stackInSlot.getMaxCount();
            if (maxStackSize > 1) {
                stackToMove.setCount(maxStackSize);
            }
        }

        return stackToMove;
    }


    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private static class IngredientSlot extends Slot {

        public IngredientSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        public boolean canInsert(ItemStack stack) {
            return true;
        }
    }

    static class LapisSlot extends Slot {
        public LapisSlot(Inventory inventory, int i, int j, int k) {
            super(inventory, i, j, k);
        }

        public boolean canInsert(ItemStack stack) {
            return matches(stack);
        }

        public static boolean matches(ItemStack stack) {
            return stack.isOf(Items.LAPIS_BLOCK) || stack.isOf(Items.LAPIS_LAZULI);
        }
    }

    static class OutputSlot extends Slot {
        public OutputSlot(Inventory inventory, int i, int j, int k) {
            super(inventory, i, j, k);
        }

        public boolean canInsert(ItemStack stack) {
            return false;
        }
    }

}
