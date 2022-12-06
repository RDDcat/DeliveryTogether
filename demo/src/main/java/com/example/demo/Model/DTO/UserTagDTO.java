package com.example.demo.Model.DTO;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class UserTagDTO {
    private Long id;
    private String tagName;

    @QueryProjection
    public UserTagDTO(Long id, String tagName) {
        this.id = id;
        this.tagName = tagName;
    }
}
