package com.iAttend.repository;

import com.iAttend.entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageModel, Integer> {
}
