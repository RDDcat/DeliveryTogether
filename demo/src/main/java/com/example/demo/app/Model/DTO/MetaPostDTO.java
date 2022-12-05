package com.example.demo.app.Model.DTO;

import lombok.Data;

import javax.persistence.Id;

// 홈화면에서 포스트 미리보기로 띄울 데이터
@Data
public class MetaPostDTO {
    Long postId;
    String title;
    String limitMinute;
    String ownerName;
    String describe;

}
