package com.stpwebhost.apis.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsageStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long subscriptionModelId;
    private String storageUsageData;
    private String cpuUsageData;
    private String otherData;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSubscriptionModelId() {
        return subscriptionModelId;
    }

    public void setSubscriptionModelId(Long subscriptionModelId) {
        this.subscriptionModelId = subscriptionModelId;
    }

    public String getStorageUsageData() {
        return storageUsageData;
    }

    public void setStorageUsageData(String storageUsageData) {
        this.storageUsageData = storageUsageData;
    }

    public String getCpuUsageData() {
        return cpuUsageData;
    }

    public void setCpuUsageData(String cpuUsageData) {
        this.cpuUsageData = cpuUsageData;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }
}
