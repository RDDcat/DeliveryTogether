package com.example.demo.Controller;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.InfoDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
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
    public MetaPostDTO[] GetMainPage(){
        return service.GetMainPage();
    }

    // 게시글 선택시
    @GetMapping("/post/{postId}")
    public void GetPost(@PathVariable long postId){
        service.GetPost(postId);
    }

    // 게시글 작성
    @GetMapping("/make")
    public void MakePost(String title, String limitMinute, String ownerName, String storeUrl, String describe){
        PostDAO postDAO = PostDAO.builder()
                .title(title)
                .limitMinute(limitMinute)
                .ownerName(ownerName)
                .storeUrl(storeUrl)
                .describe(describe)
                .build();

        service.MakePost(postDAO);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    @GetMapping("/info")
    public InfoDTO GetInfo(){
        return null;
    }

}
