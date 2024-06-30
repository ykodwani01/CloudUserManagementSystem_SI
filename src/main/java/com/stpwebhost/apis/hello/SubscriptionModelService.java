package com.stpwebhost.apis.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionModelService {
    @Autowired
    private SubscriptionModelRepository subscriptionModelRepository;

    public List<SubscriptionModel> getAllSubscriptionModels() {
        return subscriptionModelRepository.findAll();
    }

    public SubscriptionModel getSubscriptionModelById(Long id) {
        return subscriptionModelRepository.findById(id).orElse(null);
    }

    public SubscriptionModel saveSubscriptionModel(SubscriptionModel subscriptionModel) {
        return subscriptionModelRepository.save(subscriptionModel);
    }

    public void deleteSubscriptionModel(Long id) {
        subscriptionModelRepository.deleteById(id);
    }
}