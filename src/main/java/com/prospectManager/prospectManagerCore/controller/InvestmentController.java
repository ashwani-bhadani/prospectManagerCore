package com.prospectManager.prospectManagerCore.controller;

import com.prospectManager.prospectManagerCore.model.Investment;
import com.prospectManager.prospectManagerCore.service.InvestmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investment")
public class InvestmentController {

    private InvestmentService investmentService;

    @GetMapping
    public List<Investment> getAllInvestments() {
        return investmentService.fetchAllInvestments();
    }

    @GetMapping("/prospectId/{prospectId}")
    public List<Investment> getAllInvestmentsForProspect(@PathVariable Long prospectId) {
        return investmentService.fetchInvestmentByProspectId(prospectId);
    }

    @PostMapping
    public Investment newInvestmentForProspect(@RequestBody Investment investment) {
        return investmentService.createInvestment(investment);
    }

    @PutMapping
    public String updateInvestment(@RequestBody Investment investment) {
        return investmentService.updateInvestment(investment);
    }

    @GetMapping("/{investmentId}")
    public Investment getInvestmentById(@PathVariable Long investmentId) {
        return investmentService.fetchInvestmentById(investmentId);
    }

}
