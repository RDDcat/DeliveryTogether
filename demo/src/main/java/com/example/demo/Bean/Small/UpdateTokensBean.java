package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateTokensBean {
    @Autowired
    UserDAORepository userDAORepository;

    public UserDAO exec(Long userId, String token, String refreshToken){
        UserDAO user = userDAORepository.findById(userId).get();
        user.setToken(token);
        user.setRefreshToken(refreshToken);

        return user;
    }
}
