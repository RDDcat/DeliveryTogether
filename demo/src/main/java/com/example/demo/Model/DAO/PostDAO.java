package com.example.demo.Model.DAO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PostDAO {
    @Id
    private Long postId;
    String title;
    String limitMinute;
    String ownerName;
    String storeUrl;
    String describe;
    String currentDate;



}
