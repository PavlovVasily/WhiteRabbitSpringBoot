package com.pavlov.core.controllers;

import com.pavlov.core.dto.CardDTO;
import com.pavlov.core.dto.EnWordDTO;
import com.pavlov.core.mappers.CardMapper;
import com.pavlov.core.mappers.EnWordMapper;
import com.pavlov.core.model.Card;
import com.pavlov.core.model.EnWord;
import com.pavlov.core.services.CardService;
import com.pavlov.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;
//    private final EnWordMapper enWordMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id) {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }
}
