package com.pavlov.core.repositories;

import com.pavlov.core.model.Card;
import com.pavlov.core.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card getById(Long id);
}
