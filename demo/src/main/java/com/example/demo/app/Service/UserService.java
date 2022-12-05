package com.example.demo.app.Service;

import com.example.demo.app.Model.DAO.UserDAO;
import com.example.demo.app.Repository.UserDAORepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserDAORepository userDAORepository;



    public Optional<UserDAO> loadUserById(Long userId){
        return userDAORepository.findById(userId);
    }
}
