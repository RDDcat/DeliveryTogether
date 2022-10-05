package com.example.demo.Bean;

import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserBean {
    @Autowired
    ARepository repository;
    public UserDTO exec(Long userId){
        return repository.loadUserById(userId).toUserDTO();
    }
}
