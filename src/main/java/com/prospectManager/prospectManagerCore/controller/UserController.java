package com.prospectManager.prospectManagerCore.controller;

import com.prospectManager.prospectManagerCore.DTO.UserRequestDTO;
import com.prospectManager.prospectManagerCore.model.User;
import com.prospectManager.prospectManagerCore.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequestDTO userRequest) {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }
}
