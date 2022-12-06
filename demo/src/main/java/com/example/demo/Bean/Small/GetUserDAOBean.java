package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.Role;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import org.springframework.stereotype.Component;

@Component
public class GetUserDAOBean {
    public UserDAO exec(Long userId){

        return null;
    }

    public UserDAO exec(KakaoUserDTO kakaoUserDTO, OAuthToken oauthToken) {
        UserDAO userDAO = new UserDAO();
        
        long id = kakaoUserDTO.getId();
        String name = kakaoUserDTO.getProperties().getNickname();
        String token = oauthToken.getAccess_token();
        String refreshToken = oauthToken.getRefresh_token();
        Role role = Role.USER;

        userDAO.setUserId(id);
        userDAO.setName(name);
        userDAO.setToken(token);
        userDAO.setRefreshToken(refreshToken);
        userDAO.setRole(role);

        return userDAO;
    }
}
