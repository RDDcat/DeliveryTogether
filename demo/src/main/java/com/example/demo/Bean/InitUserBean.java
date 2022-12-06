package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetUserDAOBean;
import com.example.demo.Bean.Small.InitUserDAOBean;
import com.example.demo.Bean.Small.SaveUserBean;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitUserBean {
    @Autowired
    SaveUserBean saveUserBean;
    @Autowired
    InitUserDAOBean initUserDAOBean;
    @Autowired
    GetUserDAOBean getUserDAOBean;



    public void exec(KakaoUserDTO kakaoUserDTO, OAuthToken oauthToken){
        // UserDAO 로 변환
        UserDAO userDAO = getUserDAOBean.exec(kakaoUserDTO, oauthToken);

        // 저장
        saveUserBean.exec(userDAO);

    }
}
