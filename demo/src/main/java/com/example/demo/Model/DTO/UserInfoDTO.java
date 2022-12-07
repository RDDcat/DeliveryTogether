package com.example.demo.Model.DTO;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoDTO {
    UserDTO userDTO;
    List<UserTagDTO> tags;
}
