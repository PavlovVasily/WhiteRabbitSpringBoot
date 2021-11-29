package com.pavlov.core.controllers;

import com.pavlov.core.dto.ImageDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.mappers.ImageMapper;
import com.pavlov.core.mappers.UserMapper;
import com.pavlov.core.model.Image;
import com.pavlov.core.model.User;
import com.pavlov.core.services.ImageService;
import com.pavlov.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/images/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id) throws IOException {
        Image image = imageService.getImage(id);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.OK);
    }

    @PostMapping("/images")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.CREATED);
    }

//    public UserDTO sayHello(@PathVariable Long id) {
//        User user = userService.getUser(id);
//        return userMapper.toDTO(user); //UserMapper.INSTANCE.toDTO(user);
//    }
}
