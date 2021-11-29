package com.pavlov.core.services;

import com.pavlov.core.model.Image;
import com.pavlov.core.model.User;
import com.pavlov.core.repositories.ImageRepository;
import com.pavlov.core.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{

    private final ImageRepository imageRepository;

    @Override
    public Image getImage(Long id) {
        return imageRepository.getById(id);
    }

    @Override
    public Image saveImage(Image image){
        return imageRepository.save(image);
    }
}
