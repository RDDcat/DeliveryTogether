package com.example.demo.Model.DTO;

import lombok.Data;

import java.util.List;

@Data
public class MainPageDTO {
    long userId;
    String access_token;
    List<MetaPostDTO> metaPostDTOS;

}
