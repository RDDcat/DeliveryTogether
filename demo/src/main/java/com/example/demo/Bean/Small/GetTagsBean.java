package com.example.demo.Bean.Small;

import com.example.demo.Model.DTO.UserTagDTO;
import com.example.demo.Repository.Custom.UserDAORepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetTagsBean {
    @Autowired
    UserDAORepositoryImpl userDAORepository;
    public List<UserTagDTO> exec(Long userId) {
        return userDAORepository.findAllUserTags(userId);
    }
}
