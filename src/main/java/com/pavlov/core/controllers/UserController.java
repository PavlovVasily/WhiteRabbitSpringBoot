package com.pavlov.core.controllers;

import com.pavlov.core.dto.RoleDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.mappers.UserMapper;
import com.pavlov.core.model.Role;
import com.pavlov.core.model.User;
import com.pavlov.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return userMapper.toDTO(user); //UserMapper.INSTANCE.toDTO(user);
    }
}
