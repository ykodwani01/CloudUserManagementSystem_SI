package com.stpwebhost.apis.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscriptionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;
    
    private String details;
    private String hardwareCapacity;
    private double pricing;

    // Getters and Setters

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getHardwareCapacity() {
        return hardwareCapacity;
    }

    public void setHardwareCapacity(String hardwareCapacity) {
        this.hardwareCapacity = hardwareCapacity;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }
}
