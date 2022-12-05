package com.example.demo.app.Controller;

import com.example.demo.app.Model.DTO.MainPageDTO;
import com.example.demo.app.Model.DTO.PostDTO;
import com.example.demo.app.Model.DTO.UserInfoDTO;
import com.example.demo.app.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService service;

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
    @PostMapping("/create")
    public void CreatePost(@RequestBody String body){
        System.out.println(body);

        service.create(body);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    @GetMapping("/user/{userId}")
    public UserInfoDTO GetUserInfo(@PathVariable Long userId){
        return service.GetUserInfo(userId);
    }

}
