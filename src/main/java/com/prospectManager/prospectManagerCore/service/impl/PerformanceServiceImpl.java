package com.prospectManager.prospectManagerCore.service.impl;

import com.prospectManager.prospectManagerCore.model.Performance;
import com.prospectManager.prospectManagerCore.repository.PerformanceRepository;
import com.prospectManager.prospectManagerCore.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    /**
     * adds another row to performance tab for investmentId
     * @param performance
     * @return calculates performance for an investment
     */
    @Override
    public String updatePerformanceForInvestment(Performance performance) {
        Performance currPerf = performanceRepository.save(performance);
        if(currPerf.equals(null)){
            return "Error in saving info !";
        }

        return "SUCCESS: update performance";
    }

    /**
     *
     * @param investmentId
     * @return lastest dated performance row from tab for an investmentId
     */
    @Override
    public Performance fetchLatestInvestmentPerformance(Long investmentId) {
        List<Performance> performanceList = performanceRepository.findByInvestmentId(investmentId);

        if (performanceList.isEmpty()){
            return null;
        }

        Long latestEntrySerialNo = performanceList.stream()
                                                    .map(Performance::getSlNo)
                                                    .max(Long::compareTo)
                                                    .get();
        return performanceList.stream()
                .filter(item -> item.getSlNo()==latestEntrySerialNo)
                .findFirst().get();
    }
}
