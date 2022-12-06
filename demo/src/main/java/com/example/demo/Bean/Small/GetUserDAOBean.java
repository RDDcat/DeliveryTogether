package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.Role;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import com.example.demo.Repository.UserDAORepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor

public class GetUserDAOBean {
    private final UserDAORepository userDAORepository;

    public Optional<UserDAO> exec(Long userId){

        return userDAORepository.findById(userId);
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
