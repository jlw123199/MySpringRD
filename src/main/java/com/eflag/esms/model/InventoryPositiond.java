package com.eflag.esms.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class InventoryPositiond implements Serializable {
    private String id;

    private String inventoryId;

    private String positionId;

    private BigDecimal type;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId == null ? null : inventoryId.trim();
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }
}