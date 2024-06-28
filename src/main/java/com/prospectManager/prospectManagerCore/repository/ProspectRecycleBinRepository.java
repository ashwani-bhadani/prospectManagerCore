package com.prospectManager.prospectManagerCore.repository;

import com.prospectManager.prospectManagerCore.model.ProspectRecycleBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectRecycleBinRepository extends JpaRepository<ProspectRecycleBin, Long> {
}
