package com.pavlov.core.mappers;

import com.pavlov.core.dto.EnWordDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.model.EnWord;
import com.pavlov.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper/*(componentModel = "spring")*/
public interface EnWordMapper {
    //EnWordMapper INSTANCE = Mappers.getMapper(EnWordMapper.class);
    EnWordDTO toDTO(EnWord enWord);
}
