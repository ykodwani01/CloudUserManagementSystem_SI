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
@RequestMapping("/usage-statistics")
public class UsageStatisticsController {
    @Autowired
    private UsageStatisticsService usageStatisticsService;

    @GetMapping
    public List<UsageStatistics> getAllUsageStatistics() {
        return usageStatisticsService.getAllUsageStatistics();
    }

    @GetMapping("/{id}")
    public List<UsageStatistics> getUsageStatisticsById(@PathVariable Long id) {
        return usageStatisticsService.getUsageStatisticsByUser(id);
    }

    @PostMapping
    public UsageStatistics createUsageStatistics(@RequestBody UsageStatistics usageStatistics) {
        return usageStatisticsService.saveUsageStatistics(usageStatistics);
    }

    @DeleteMapping("/{id}")
    public void deleteUsageStatistics(@PathVariable Long id) {
        usageStatisticsService.deleteUsageStatistics(id);
    }
}
