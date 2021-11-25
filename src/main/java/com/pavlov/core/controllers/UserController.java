package com.pavlov.core.controllers;

import com.pavlov.core.dto.RoleDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.model.Role;
import com.pavlov.core.model.User;
import com.pavlov.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return toDTO(user);
    }

    private UserDTO toDTO(User user) {
        Set<RoleDTO> roleDTOS = toDTOs(user.getRoles());
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .roles(roleDTOS)
                .build();
    }

    private RoleDTO toDTO(Role role) {
        return RoleDTO.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }

    private Set<RoleDTO> toDTOs(Set<Role> role) {
        return role.stream().map(role1 -> toDTO(role1)).collect(Collectors.toSet());
    }
}
