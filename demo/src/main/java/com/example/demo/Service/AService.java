package com.example.demo.Service;

import com.example.demo.Bean.GetMainBean;
import com.example.demo.Bean.GetPostBean;
import com.example.demo.Bean.GetUserInfoBean;
import com.example.demo.Bean.MakePostBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Autowired
    GetMainBean getMainBean;
    @Autowired
    GetPostBean getPostBean;
    @Autowired
    MakePostBean makePostBean;
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
    public void MakePost(PostDAO postDAO){
        makePostBean.exec(postDAO);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    public UserInfoDTO GetUserInfo(Long userId){
        return getUserInfoBean.exec(userId);
    }

}
