package com.pavlov.core.mappers;

import com.pavlov.core.dto.CardDTO;
import com.pavlov.core.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper/*(componentModel = "spring")*/
public interface CardMapper {
    @Mapping(source = "enWord", target = "enWordDTO")
    @Mapping(source = "ruWord", target = "ruWordDTO")
    CardDTO toDTO(Card card);
}
