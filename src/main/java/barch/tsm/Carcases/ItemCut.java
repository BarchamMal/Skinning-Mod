package barch.tsm.Carcases;

import net.minecraft.item.Item;

public class ItemCut {

    private Item item;
    private int amount;

    public ItemCut(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

}
