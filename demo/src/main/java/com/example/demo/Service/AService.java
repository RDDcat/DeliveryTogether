package com.example.demo.Service;

import com.example.demo.Bean.GetMainBean;
import com.example.demo.Bean.GetPostBean;
import com.example.demo.Bean.GetUserInfoBean;
import com.example.demo.Bean.CreatePostBean;
import com.example.demo.Model.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@CrossOrigin("*")
public class AService {
    @Autowired
    GetMainBean getMainBean;
    @Autowired
    GetPostBean getPostBean;
    @Autowired
    CreatePostBean createPostBean;
    @Autowired
    GetUserInfoBean getUserInfoBean;

    // 홈 화면
    public MainPageDTO GetMainPage(String token){
        return getMainBean.exec(token);
    }

    // 게시글 선택시
    public PostDTO GetPost(long postId){
        return getPostBean.exec(postId);
    }

    // 게시글 작성
    public void CreatePost(String body){
        createPostBean.exec(body);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    public UserInfoDTO GetUserInfo(Long userId){
        return getUserInfoBean.exec(userId);
    }

}
