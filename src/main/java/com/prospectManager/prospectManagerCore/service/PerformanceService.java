package com.prospectManager.prospectManagerCore.service;

import com.prospectManager.prospectManagerCore.model.Performance;

public interface PerformanceService {

    public String updatePerformanceForInvestment(Performance performance);

    public Performance fetchLatestInvestmentPerformance(Long investmentId);
}
