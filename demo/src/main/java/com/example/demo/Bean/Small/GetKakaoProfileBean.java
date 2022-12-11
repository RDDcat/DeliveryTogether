package com.example.demo.Bean.Small;

import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class GetKakaoProfileBean {
    public KakaoUserDTO exec(OAuthToken oauthToken){
        // Post로 데이터 요청
        RestTemplate rt2 = new RestTemplate();
        KakaoUserDTO kakaoUserDTO =null;
        ObjectMapper objectMapper = new ObjectMapper();

        // HTTP 헤더
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

        log.info("여기야 여기 : ", response2.toString());


        try {
            kakaoUserDTO = objectMapper.readValue(response2.getBody(), KakaoUserDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(kakaoUserDTO);
        log.info("저장 실행 : ", kakaoUserDTO.toString());

        return kakaoUserDTO;
    }
}
