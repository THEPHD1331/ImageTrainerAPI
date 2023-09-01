package com.iAttend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Entity
@Data
@Table(name = "image_trainer_db")
public class ImageModel {

    @Id
    private int id;

    @Lob
    private Blob image;
    private Date date= new Date();
    private String name;
}

