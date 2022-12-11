package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetKakaoProfileBean;
import com.example.demo.Bean.Small.GetKakaoTokenBean;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.RedirectView;

@Component
public class KakaoAuthBean {
    @Autowired
    GetKakaoProfileBean getKakaoProfileBean;
    @Autowired
    GetKakaoTokenBean getAccess_token;
    @Autowired
    InitUserBean initUserBean;

    public RedirectView exec(String code){
        // 토큰 가져오기
        OAuthToken oauthToken = getAccess_token.exec(code);
        
        // 토큰으로 프로필 정보 가져오기
        KakaoUserDTO kakaoUserDTO = getKakaoProfileBean.exec(oauthToken);


        // 회원 정보 디비에 저장
        initUserBean.exec(kakaoUserDTO, oauthToken);
        System.out.println("저장 실행");

        // 로그인 후 메인페이지에 필요한 JSON 바로 보내야함
        // post로 리다이랙트
        final String baseUrl = "http://localhost:8080/#/post/"+oauthToken.getAccess_token()+"/amu";

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(baseUrl);

        return redirectView;
    }
}
