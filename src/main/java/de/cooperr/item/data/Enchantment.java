package de.cooperr.item.data;

public class Enchantment {

    private Type type;
    private int level;

    public Enchantment(Type type, int level, boolean ignoreLevelRestriction) {
        if (ignoreLevelRestriction) {
            this.type = type;
            this.level = level;
        } else {
            if (type.getMaxLevel() < level && level > 0) {
                this.type = type;
                this.level = level;
            }
        }
    }

    public Enchantment(Type type) {
        this.type = type;
        level = 1;
    }

    enum Type {

        PROTECTION(3),
        SHARPNESS(4),
        EFFICIENCY(5),
        LUCK(3);

        private final int MAX_LEVEL;

        Type(int maxLevel) {
            this.MAX_LEVEL = maxLevel;
        }

        public int getMaxLevel() {
            return MAX_LEVEL;
        }
    }
}
