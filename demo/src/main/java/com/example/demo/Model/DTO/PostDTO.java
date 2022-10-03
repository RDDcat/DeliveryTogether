package com.example.demo.Model.DTO;

import lombok.Data;

// 게시글 DTO
@Data
public class PostDTO {
    String title;
    String limitMinute;
    String ownerName;
    String storeUrl;
    String describe;
    String currentDate;

    // 참여한 유저도 표시해야함..

}
