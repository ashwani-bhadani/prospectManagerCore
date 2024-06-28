package com.prospectManager.prospectManagerCore.service;

import com.prospectManager.prospectManagerCore.model.Prospect;

import java.util.List;

public interface ProspectService {

    public List<Prospect> getAllProspects();

    public Prospect createProspect(Prospect prospect);

    public String updateProspect(Prospect prospect);

    public String deleteProspect(Long prospectId);

    public Prospect fetchProspectById(Long prospectId);
}
