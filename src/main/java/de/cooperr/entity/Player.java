package de.cooperr.entity;

import de.cooperr.entity.data.EntityType;
import de.cooperr.entity.data.FacingDirection;
import de.cooperr.entity.data.LivingEntity;
import de.cooperr.inventory.Inventory;
import de.cooperr.inventory.PlayerInventory;
import de.cooperr.util.Location;
import jdk.jfr.Label;

import java.util.UUID;

public class Player extends Entity implements LivingEntity {

    private String name;
    private UUID uuid;
    private double health;
    private double maxHealth;
    private double speed;
    private String displayName;
    private FacingDirection facing;
    private final PlayerInventory INVENTORY;
    private boolean executeCommands;

    public Player(String name, Location location) {
        this.name = name;
        uuid = UUID.randomUUID();
        health = 20.0;
        maxHealth = 20.0;
        speed = 1.0;
        displayName = name;
        facing = FacingDirection.NORTH;
        INVENTORY = new PlayerInventory();
        executeCommands = true;
        setLocation(location);
        setEntityType(EntityType.PLAYER);
    }

    public Player(String name, UUID uuid, double health, double maxHealth, double speed, String displayName, Location location, FacingDirection facing,
                  PlayerInventory inventory, boolean executeCommands) {
        this.name = name;
        this.uuid = uuid;
        this.health = health;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.displayName = displayName;
        setLocation(location);
        this.facing = facing;
        this.INVENTORY = inventory;
        this.executeCommands = executeCommands;
        setEntityType(EntityType.PLAYER);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public boolean canExecuteCommands() {
        return executeCommands;
    }

    public void setExecuteCommands(boolean executeCommands) {
        this.executeCommands = executeCommands;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getMaxHealth() {
        return maxHealth;
    }

    @Override
    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public FacingDirection getFacing() {
        return facing;
    }

    @Override
    public void setFacing(FacingDirection facing) {
        this.facing = facing;
    }

    @Override
    public Inventory getInventory() {
        return INVENTORY;
    }

    @Label("unnecessary")
    @Override
    public void setEntityType(EntityType entityType) {
    }
}
