package com.example.demo.Bean;

import com.example.demo.Bean.Small.*;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InitUserBean {
    @Autowired
    SaveUserBean saveUserBean;
    @Autowired
    InitUserDAOBean initUserDAOBean;
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    UpdateUserBean updateUserBean;
    @Autowired
    FindUserBean findUserBean;



    public void exec(KakaoUserDTO kakaoUserDTO, OAuthToken oauthToken){
        // UserDAO 로 변환
        UserDAO userDAO = getUserDAOBean.exec(kakaoUserDTO, oauthToken);

        // 존재 하는지 찾고
        Optional<UserDAO> findUser = findUserBean.exec(userDAO);

        if(!findUser.isPresent()){
            // 저장
            saveUserBean.exec(userDAO);
        }
        else {
            // 존재 하면 update
            updateUserBean.exec(findUser, userDAO);

        }

    }
}
