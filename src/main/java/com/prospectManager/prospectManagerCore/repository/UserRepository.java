package com.prospectManager.prospectManagerCore.repository;

import com.prospectManager.prospectManagerCore.model.Investment;
import com.prospectManager.prospectManagerCore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
