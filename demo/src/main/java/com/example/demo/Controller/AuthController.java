package com.example.demo.Controller;

import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.OAuthToken;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/")
    public RedirectView GetMainPage() throws URISyntaxException {
        String client_id = "71e0a176033c8ff1373036d34e7a32ac";
        String redirect_uri = "http://localhost:8080/auth/kakao/callback&response_type=code";
        final String baseUrl = "https://kauth.kakao.com/oauth/authorize?"
                +"client_id="+client_id
                +"&redirect_uri="+redirect_uri;

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(baseUrl);

        System.out.println(redirectView);

        return redirectView;
    }

    @GetMapping("/kakao/callback")
    public @ResponseBody ResponseEntity<String> KakaoCallback(String code){
        // Post로 데이터 요청
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

        MultiValueMap<String, String> param = new LinkedMultiValueMap<>();
        param.add("grant_type", "authorization_code");
        param.add("client_id", "71e0a176033c8ff1373036d34e7a32ac");
        param.add("redirect_uri", "http://localhost:8080/auth/kakao/callback");
        param.add("code", code);

        HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest = new HttpEntity<>(param, headers);

        ResponseEntity<String> response = rt.exchange(
                "https://kauth.kakao.com/oauth/token",
                HttpMethod.POST,
                kakaoTokenRequest,
                String.class
        );

        System.out.println(response);

        ObjectMapper objectMapper = new ObjectMapper();
        OAuthToken oauthToken =null;
        try {
            oauthToken = objectMapper.readValue(response.getBody(), OAuthToken.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        // Post로 데이터 요청
        RestTemplate rt2 = new RestTemplate();

        HttpHeaders headers2 = new HttpHeaders();
        headers2.add("Authorization", "Bearer " + oauthToken.getAccess_token());
        headers2.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

        HttpEntity<MultiValueMap<String, String>> kakaoProfileRequest = new HttpEntity<>(headers2);

        ResponseEntity<String> response2 = rt2.exchange(
                "https://kapi.kakao.com/v2/user/me",
                HttpMethod.POST,
                kakaoProfileRequest,
                String.class
        );

        return response2;


    }

    @GetMapping("/kakao/profile")
    public void GetKakaoProfile(){
        RestTemplate rt = new RestTemplate();


    }

    @GetMapping("/kakao/logout")
    public void KakaoLogout(){

    }
}
