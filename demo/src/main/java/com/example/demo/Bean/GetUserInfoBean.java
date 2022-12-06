package com.example.demo.Bean;

import com.example.demo.Model.DTO.UserInfoDTO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserInfoBean {
    @Autowired
    ARepository repository;
    public UserInfoDTO exec(Long userId){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserDTO(repository.loadUserById(userId).toUserDTO());

        return userInfoDTO;
    }
}
