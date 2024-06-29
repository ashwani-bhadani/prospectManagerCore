package com.prospectManager.prospectManagerCore.service;

import com.prospectManager.prospectManagerCore.model.Investment;

import java.util.List;

public interface InvestmentService {

    public List<Investment> fetchAllInvestments();

//    public List<Investment> fetchInvestmentByProspectId(Long prospectId);

    public String updateInvestment(Investment investment);

    public Investment fetchInvestmentById(Long investmentId);

    public Investment createInvestment(Investment investment);
}
