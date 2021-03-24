package de.cooperr.entity;

import de.cooperr.entity.data.EntityType;
import de.cooperr.util.Location;

public class Entity {

    private Location location;
    private EntityType entityType;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }
}
