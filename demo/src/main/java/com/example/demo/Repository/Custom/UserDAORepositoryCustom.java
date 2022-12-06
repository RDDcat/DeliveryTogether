package com.example.demo.Repository.Custom;

import com.example.demo.Model.DTO.UserTagDTO;

import java.util.List;

public interface UserDAORepositoryCustom {
    List<UserTagDTO> findAllUserTags(Long userId);
}
