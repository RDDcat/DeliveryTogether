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
        long id = kakaoUserDTO.getId();
        String name = kakaoUserDTO.getProperties().getNickname();
        String token = oauthToken.getAccess_token();
        String refreshToken = oauthToken.getRefresh_token();
        Role role = Role.USER;

        UserDAO userDAO = UserDAO.builder()
                .name(name)
                .token(token)
                .refreshToken(refreshToken)
                .role(role)
                .build();

        userDAO.setUserId(id);

        return userDAO;
    }
}
