package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindUserBean {
    @Autowired
    UserDAORepository userDAORepository;

    public Optional<UserDAO> exec(UserDAO userDAO){
        String userName = userDAO.getName();
        return userDAORepository.findByName(userName);
    }
}
