package com.example.demo.Bean.Small;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.RedirectView;

@Component
@Slf4j
public class RequestKakaoLoginBean {
    public RedirectView exec(){
        String client_id = "71e0a176033c8ff1373036d34e7a32ac";
        String redirect_uri = "http://localhost:8080/auth/kakao/callback&response_type=code";
        final String baseUrl = "https://kauth.kakao.com/oauth/authorize?"
                +"client_id="+client_id
                +"&redirect_uri="+redirect_uri;

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(baseUrl);

        System.out.println("카카오 페이지 요청");
        log.info(redirectView.getUrl());

        return redirectView;
    }
}
