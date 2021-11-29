package com.pavlov.core.services;

import com.pavlov.core.model.Card;
import com.pavlov.core.model.EnWord;
import com.pavlov.core.repositories.CardRepository;
import com.pavlov.core.repositories.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;

    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
