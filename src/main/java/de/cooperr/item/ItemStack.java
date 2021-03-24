package de.cooperr.item;

import de.cooperr.item.data.Enchantment;

import java.util.ArrayList;
import java.util.List;

public class ItemStack {

    private Material material;
    private int amount;
    private final List<Enchantment> ENCHANTMENTS = new ArrayList<>();

    public ItemStack(Material material, int amount) {
        this.material = material;
        this.amount = amount;
    }

    public ItemStack(Material material) {
        this.material = material;
        amount = 1;
    }

    public Material getType() {
        return material;
    }

    public void setType(Material material) {
        this.material = material;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean addEnchantment(Enchantment enchantment) {
        if (!ENCHANTMENTS.contains(enchantment)) {
            ENCHANTMENTS.add(enchantment);
            return true;
        } else {
            return false;
        }
    }

    public void addEnchantments(Enchantment... enchantments) {
        for (Enchantment enchantment : enchantments) {
            if (!ENCHANTMENTS.contains(enchantment)) {
                ENCHANTMENTS.add(enchantment);
            }
        }
    }

    public boolean hasEnchantment(Enchantment enchantment) {
        return ENCHANTMENTS.contains(enchantment);
    }
}
