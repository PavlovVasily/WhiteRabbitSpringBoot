package com.pavlov.core.services;

import com.pavlov.core.dto.ImageDTO;
import com.pavlov.core.model.Image;
import com.pavlov.core.model.User;

public interface ImageService {
    Image getImage(Long id);

    Image saveImage(Image image);
}
