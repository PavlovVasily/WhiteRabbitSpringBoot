package com.pavlov.core.mappers;

import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper/*(componentModel = "spring")*/
public interface UserMapper {
    //UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO toDTO(User user);
}
