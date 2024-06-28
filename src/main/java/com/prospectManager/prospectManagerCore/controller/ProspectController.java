package com.prospectManager.prospectManagerCore.controller;

import com.prospectManager.prospectManagerCore.model.Prospect;
import com.prospectManager.prospectManagerCore.service.ProspectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prospect")
public class ProspectController {

    private ProspectService prospectService;

    @GetMapping
    public List<Prospect> getAllProspects() {
        return prospectService.getAllProspects();
    }

    @PostMapping
    public Prospect newProspect(@RequestBody Prospect prospect) {
        return prospectService.createProspect(prospect);
    }

    @PutMapping
    public String modifyProspect(@RequestBody Prospect prospect) {
        return prospectService.updateProspect(prospect);
    }

    @DeleteMapping("/{prospectId}")
    public String deleteProspect(@PathVariable Long prospectId) {
        return prospectService.deleteProspect(prospectId);
    }

    @GetMapping("/{prospectId}")
    public Prospect getProspectById(@PathVariable Long prospectId) {
        return prospectService.fetchProspectById(prospectId);
    }

}
