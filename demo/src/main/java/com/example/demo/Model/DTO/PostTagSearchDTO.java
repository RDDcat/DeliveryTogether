package com.example.demo.Model.DTO;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

// 홈화면에서 태그 이름으로 검색하는 DTO
@Data
public class PostTagSearchDTO {
    String title;
    int count;

    //TODO 이미지 필드 추가

    @QueryProjection
    public PostTagSearchDTO(String title, int count) {
        this.title = title;
        this.count = count;
    }
}
