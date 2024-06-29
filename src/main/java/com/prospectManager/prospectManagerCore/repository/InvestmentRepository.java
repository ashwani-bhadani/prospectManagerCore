package com.prospectManager.prospectManagerCore.repository;

import com.prospectManager.prospectManagerCore.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {

//    public List<Investment> findByProspect(Long srcProspectId);
}
