package com.example.demo.Model.DTO;

import lombok.Data;
import org.springframework.data.domain.Page;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

// 홈화면에서 포스트 미리보기로 띄울 데이터
@Data
public class MetaPostDTO {
    // 태그
    String tagName;
    Page<PostTagSearchDTO> postTagSearchDTOS;


}
