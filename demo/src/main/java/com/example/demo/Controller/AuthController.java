package com.example.demo.Controller;

import com.example.demo.Bean.KakaoAuthBean;
import com.example.demo.Model.api.KakaoUserDTO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URISyntaxException;
import java.util.logging.Logger;

@Controller
@RequestMapping("/auth")
@Slf4j
@CrossOrigin("*")
public class AuthController {
    @Autowired
    KakaoAuthBean kakaoAuthBean;

    @GetMapping("/")
    public RedirectView GetMainPage() throws URISyntaxException {
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

    @GetMapping("/kakao/callback")
    public RedirectView KakaoCallback(String code){

        return kakaoAuthBean.exec(code);
    }

    @GetMapping("/kakao/profile")
    public void GetKakaoProfile(){
        RestTemplate rt = new RestTemplate();


    }

    @GetMapping("/kakao/logout")
    public void KakaoLogout(){

    }
}
