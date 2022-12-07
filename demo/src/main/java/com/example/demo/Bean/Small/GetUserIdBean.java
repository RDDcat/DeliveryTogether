package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetUserIdBean {
    @Autowired
    UserDAORepository userDAORepository;

    public Optional<UserDAO> exec(String token) {
        return userDAORepository.findByToken(token);
    }
}
