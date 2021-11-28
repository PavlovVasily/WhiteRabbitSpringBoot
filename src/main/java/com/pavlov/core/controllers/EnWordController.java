package com.pavlov.core.controllers;

import com.pavlov.core.dto.EnWordDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.mappers.EnWordMapper;
import com.pavlov.core.mappers.UserMapper;
import com.pavlov.core.model.EnWord;
import com.pavlov.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO sayHello(@PathVariable Long id) {
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toDTO(enWord); //UserMapper.INSTANCE.toDTO(user);
    }
}
