package com.example.demo.app.Model.DTO;

import lombok.Data;

import java.time.LocalDateTime;

// 게시글 DTO
@Data
public class PostDTO {
    long postId;
    String title;
    String limitMinute;
    String ownerName;
    String storeUrl;
    String describe;
    LocalDateTime currentAt;


    // 참여한 유저도 표시해야함..
    int count;

}
