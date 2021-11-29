package com.pavlov.core.mappers;

import com.pavlov.core.dto.ImageDTO;
import com.pavlov.core.dto.UserDTO;
import com.pavlov.core.model.Image;
import com.pavlov.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Mapper/*(componentModel = "spring")*/
public interface ImageMapper {
    //UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
   // @Mapping(source = "ruWord", target = "ruWordDTO")
    ImageDTO toDTO(Image image) throws IOException;

    Image toEntity(MultipartFile file) throws IOException;
}
