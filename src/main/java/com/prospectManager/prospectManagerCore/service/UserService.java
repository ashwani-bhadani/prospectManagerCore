package com.prospectManager.prospectManagerCore.service;

import com.prospectManager.prospectManagerCore.DTO.UserRequestDTO;
import com.prospectManager.prospectManagerCore.model.Investment;
import com.prospectManager.prospectManagerCore.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(UserRequestDTO userRequest);
}
