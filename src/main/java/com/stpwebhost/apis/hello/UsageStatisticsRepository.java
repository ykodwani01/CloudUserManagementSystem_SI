package com.stpwebhost.apis.hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageStatisticsRepository extends JpaRepository<UsageStatistics, Long> {
	 List<UsageStatistics> findByUserId(Long userId);
}