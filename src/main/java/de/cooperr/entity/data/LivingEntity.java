package de.cooperr.entity.data;

import de.cooperr.inventory.Inventory;

public interface LivingEntity {

    double getHealth();

    void setHealth(double health);

    double getMaxHealth();

    void setMaxHealth(double maxHealth);

    double getSpeed();

    void setSpeed(double speed);

    String getDisplayName();

    void setDisplayName(String displayName);

    FacingDirection getFacing();

    void setFacing(FacingDirection facing);

    Inventory getInventory();
}
