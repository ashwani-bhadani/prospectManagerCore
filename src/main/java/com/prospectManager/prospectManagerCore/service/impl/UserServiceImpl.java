package com.prospectManager.prospectManagerCore.service.impl;

import com.prospectManager.prospectManagerCore.DTO.UserRequestDTO;
import com.prospectManager.prospectManagerCore.model.User;
import com.prospectManager.prospectManagerCore.repository.UserRepository;
import com.prospectManager.prospectManagerCore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequestDTO userRequest) {
        User user = User.builder()
                .userName(userRequest.getUserName())
                .fullName(userRequest.getFullName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .age(userRequest.getAge())
                .build();
        return userRepository.save(user);
    }
}
