package com.example.demo.Controller;

import com.example.demo.Bean.Small.DeleteTagsBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import com.example.demo.Service.PostService;
import com.example.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService service;

    @Autowired
    UserService userService;

    // 홈 화면
    @GetMapping("/{token}")
    public MainPageDTO GetMainPage(@PathVariable String token){
        return service.GetMainPage(token);
    }

    // 게시글 선택시
    @GetMapping("/post/{postId}")
    public Optional<PostDAO> GetPost(@PathVariable long postId){
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

    // 개인 정보 구독 수정
    @GetMapping("/user/sub/delete/{tagId}")
    public void deleteSub(@PathVariable Long tagId){
        userService.deleteTag(tagId);
    }

    @GetMapping("/user/sub/add")
    public void addSub(@RequestParam(value = "userId", required = true) Long userId,
                       @RequestParam(value = "tagName", required = true) String tagName){
        userService.addTag(userId,tagName);
    }



}
