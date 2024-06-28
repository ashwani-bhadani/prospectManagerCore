package com.prospectManager.prospectManagerCore.repository;

import com.prospectManager.prospectManagerCore.model.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {

    public List<Performance> findByInvestmentId(Long investmentId);

    public List<Performance> findBySlNoAndInvestmentId(Long slNo, Long investmentId);
}
