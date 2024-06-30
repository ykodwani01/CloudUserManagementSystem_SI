package com.stpwebhost.apis.hello;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsageStatisticsService {
    @Autowired
    private UsageStatisticsRepository usageStatisticsRepository;
    

    @PersistenceContext
    private EntityManager entityManager;
    
    public List<UsageStatistics> getAllUsageStatistics() {
        return usageStatisticsRepository.findAll();
    }

    public UsageStatistics getUsageStatisticsById(Long id) {
        return usageStatisticsRepository.findById(id).orElse(null);
    }
    public List<UsageStatistics> getUsageStatisticsByUser(Long userId) {
    	return usageStatisticsRepository.findByUserId(userId);
    }

    public UsageStatistics saveUsageStatistics(UsageStatistics usageStatistics) {
        return usageStatisticsRepository.save(usageStatistics);
    }

    public void deleteUsageStatistics(Long id) {
        usageStatisticsRepository.deleteById(id);
    }
}
