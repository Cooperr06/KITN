package inventory;

import entity.data.LivingEntity;
import item.ItemStack;

import java.util.HashMap;

public class Inventory {

    private final HashMap<Integer, ItemStack> INVENTORY = new HashMap<>();
    private int size;
    private LivingEntity owner;

    public HashMap<Integer, ItemStack> getInventory() {
        return INVENTORY;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LivingEntity getOwner() {
        return owner;
    }

    public void setOwner(LivingEntity owner) {
        this.owner = owner;
    }

    public ItemStack getItem(int slot) {
        return INVENTORY.get(slot);
    }

    public void setItem(int slot, ItemStack itemStack) {
        INVENTORY.put(slot, itemStack);
    }

    public void removeItem(int slot) {
        INVENTORY.remove(slot);
    }

    public void removeItems(ItemStack itemStack) {
        INVENTORY.forEach((integer, itemStack1) -> {
            if (INVENTORY.get(integer).getType().equals(itemStack.getType())) {
                INVENTORY.remove(integer);
            }
        });
    }

    public void clear() {
        INVENTORY.clear();
    }
}
