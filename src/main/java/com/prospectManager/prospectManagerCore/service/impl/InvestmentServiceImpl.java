package com.prospectManager.prospectManagerCore.service.impl;

import com.prospectManager.prospectManagerCore.model.Investment;
import com.prospectManager.prospectManagerCore.repository.InvestmentRepository;
import com.prospectManager.prospectManagerCore.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public List<Investment> fetchAllInvestments() {
        return investmentRepository.findAll();
    }

//    @Override
//    public List<Investment> fetchInvestmentByProspectId(Long prospectId) {
//        return investmentRepository.findByProspect(prospectId);
//    }

    @Override
    public String updateInvestment(Investment investment) {
        return "";
    }

    @Override
    public Investment fetchInvestmentById(Long investmentId) {
        return null;
    }

    @Override
    public Investment createInvestment(Investment investment) {
        return null;
    }
}
