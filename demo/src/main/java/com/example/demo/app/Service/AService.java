package com.example.demo.app.Service;

import com.example.demo.app.Bean.GetMainBean;
import com.example.demo.app.Bean.GetPostBean;
import com.example.demo.app.Bean.GetUserInfoBean;
import com.example.demo.app.Bean.CreatePostBean;
import com.example.demo.app.Model.DTO.MainPageDTO;
import com.example.demo.app.Model.DTO.PostDTO;
import com.example.demo.app.Model.DTO.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
    public MainPageDTO GetMainPage(){
        return getMainBean.exec();
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
