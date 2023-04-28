package com.github.edivaldoramos.dto;


import com.github.edivaldoramos.enums.ProductType;

import java.math.BigDecimal;

/**
 * Class that represents a product
 */
public class Product {
    private Long id;
    private ProductType type;
    private BigDecimal costValue;
    private Boolean active;

    public Product(Long id, ProductType type, BigDecimal costValue, Boolean active) {
        this.id = id;
        this.type = type;
        this.costValue = costValue;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public BigDecimal getCostValue() {
        return costValue;
    }

    public void setCostValue(BigDecimal costValue) {
        this.costValue = costValue;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
