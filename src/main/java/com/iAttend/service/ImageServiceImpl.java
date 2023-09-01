package com.iAttend.service;

import com.iAttend.entity.ImageModel;
import com.iAttend.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    ImageRepository imageRepository;

    @Override
    public List<ImageModel> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public ImageModel saveImage(ImageModel imageModel) {
        return imageRepository.save(imageModel);
    }

    @Override
    public ImageModel getImageById(int id) {
        return imageRepository.findById(id).get();
    }
}

