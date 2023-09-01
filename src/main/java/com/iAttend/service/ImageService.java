package com.iAttend.service;

import com.iAttend.entity.ImageModel;

import java.util.List;

public interface ImageService {

    List<ImageModel> getAllImages();
    ImageModel saveImage(ImageModel imageModel);
    ImageModel getImageById(int id);
}
