package com.example.demo.Model.DTO;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

// 홈화면에서 태그 이름으로 검색하는 DTO
@Data
public class PostTagSearchDTO {

    private Long postId;
    private String title;
    private int count;

    private String picture;

    @QueryProjection

    public PostTagSearchDTO(Long postId, String title, int count, String picture) {
        this.postId = postId;
        this.title = title;
        this.count = count;
        this.picture = picture;
    }
}
