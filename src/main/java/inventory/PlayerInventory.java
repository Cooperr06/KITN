package inventory;

import entity.Player;
import entity.data.LivingEntity;
import item.ItemStack;
import jdk.jfr.Label;

public class PlayerInventory extends Inventory {

    public ItemStack getHelmet() {
        return getItem(40);
    }

    public void setHelmet(ItemStack itemStack) {
        setItem(40, itemStack);
    }

    public ItemStack getChestplate() {
        return getItem(41);
    }

    public void setChestplate(ItemStack itemStack) {
        setItem(41, itemStack);
    }

    public ItemStack getLeggings() {
        return getItem(42);
    }

    public void setLeggings(ItemStack itemStack) {
        setItem(42, itemStack);
    }

    public ItemStack getBoots() {
        return getItem(43);
    }

    public void setBoots(ItemStack itemStack) {
        setItem(43, itemStack);
    }

    @Override
    public int getSize() {
        return 43;
    }

    @Deprecated
    @Label("unnecessary")
    @Override
    public void setSize(int size) {
    }

    @Override
    public void setOwner(LivingEntity owner) {
        if (owner instanceof Player) {
            setOwner(owner);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
