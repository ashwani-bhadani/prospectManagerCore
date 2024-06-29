package com.prospectManager.prospectManagerCore.service.impl;

import com.prospectManager.prospectManagerCore.model.Prospect;
import com.prospectManager.prospectManagerCore.model.ProspectRecycleBin;
import com.prospectManager.prospectManagerCore.repository.ProspectRecycleBinRepository;
import com.prospectManager.prospectManagerCore.repository.ProspectRepository;
import com.prospectManager.prospectManagerCore.service.ProspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProspectServiceImpl implements ProspectService {

    @Autowired
    private ProspectRepository prospectRepository;

    @Autowired
    private ProspectRecycleBinRepository prospectRecyclerRepository;

    @Override
    public List<Prospect> getAllProspects() {
        return prospectRepository.findAll();
    }

    @Override
    public Prospect createProspect(Prospect prospect) {
        return prospectRepository.save(prospect);
    }

    @Override
    public String updateProspect(Prospect prospect) {
        if(prospectRepository.existsById(prospect.getProspectId())) {
            prospectRepository.save(prospect);
            return "Data updated successfully";
        } else {
            return "No such prospect found!!";
        }
    }

    @Override
    public String deleteProspect(Long prospectId) {
        Prospect recycleProspect = prospectRepository.findById(prospectId).orElse(null);
        if(recycleProspect != null ) {
            ProspectRecycleBin movedProspect = new ProspectRecycleBin(
                    recycleProspect.getProspectId(),
                    recycleProspect.getTitleName(),
                    recycleProspect.getDescription(),
                    recycleProspect.getEstimatedCurrentValue(),
                    recycleProspect.getCurrentDateTime(),
                    recycleProspect.getOnboardMode()
            );
//            TODO: ensure all investments belonging to prospect are deleted
            prospectRecyclerRepository.save(movedProspect);
            return "Data deleted successfully";
        } else {
            return "No such prospect found or is already deleted!!";
        }
    }

    @Override
    public Prospect fetchProspectById(Long prospectId) {
        return prospectRepository.findById(prospectId).orElse(null);
    }
}
