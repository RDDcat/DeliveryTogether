package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class UpdateUserBean {
    @Autowired
    SaveUserBean saveUserBean;

    @Transactional
    public void exec(Optional<UserDAO> findUser, UserDAO userDAO) {
        UserDAO saveUser = findUser.get();
        saveUser.setToken(userDAO.getToken());
        saveUser.setRefreshToken(userDAO.getRefreshToken());
    }
}
