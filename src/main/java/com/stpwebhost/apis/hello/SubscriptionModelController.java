package com.stpwebhost.apis.hello;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscription-models")
public class SubscriptionModelController {
    @Autowired
    private SubscriptionModelService subscriptionModelService;

    @GetMapping
    public List<SubscriptionModel> getAllSubscriptionModels() {
        return subscriptionModelService.getAllSubscriptionModels();
    }

    @GetMapping("/{id}")
    public SubscriptionModel getSubscriptionModelById(@PathVariable Long id) {
        return subscriptionModelService.getSubscriptionModelById(id);
    }

    @PostMapping
    public SubscriptionModel createSubscriptionModel(@RequestBody SubscriptionModel subscriptionModel) {
        return subscriptionModelService.saveSubscriptionModel(subscriptionModel);
    }

    @DeleteMapping("/{id}")
    public void deleteSubscriptionModel(@PathVariable Long id) {
        subscriptionModelService.deleteSubscriptionModel(id);
    }
}

