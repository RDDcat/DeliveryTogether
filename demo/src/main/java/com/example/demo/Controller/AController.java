package com.example.demo.Controller;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.PostDTO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AController {
    @Autowired
    AService service;

    // 홈 화면
    @GetMapping("/")
    public MainPageDTO GetMainPage(){
        return service.GetMainPage();
    }

    // 게시글 선택시
    @GetMapping("/post/{postId}")
    public PostDTO GetPost(@PathVariable long postId){
        return service.GetPost(postId);
    }

    // 게시글 작성
    @GetMapping("/make")
    public void MakePost(String title, String describe, String storeUrl, String chatUrl,  String limitMinute, long userId){
        PostDAO postDAO = PostDAO.builder()
                .title(title)
                .describe(describe)
                .storeUrl(storeUrl)
                .chatUrl(chatUrl)
                .limitMinute(limitMinute)
                .build();

        service.MakePost(postDAO);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    @GetMapping("/user/{userId}")
    public UserDTO GetUserDTO(@PathVariable Long userId){
        return service.GetUserDTO(userId);
    }

}
