package com.prospectManager.prospectManagerCore.repository;

import com.prospectManager.prospectManagerCore.model.Prospect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectRepository extends JpaRepository<Prospect, Long> {
}
