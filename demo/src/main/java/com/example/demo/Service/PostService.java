package com.example.demo.Service;

import com.example.demo.Bean.*;
import com.example.demo.Bean.Small.GetPostDAOBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {
    @Autowired
    GetMainBean getMainBean;
    @Autowired
    GetPostBean getPostBean;
    @Autowired
    CreatePostBean createPostBean;
    @Autowired
    GetUserInfoBean getUserInfoBean;
    @Autowired
    PrintStoreBean printStoreBean;
    @Autowired
    GetPostDAOBean getPostDAOBean;

    // 홈 화면
    public MainPageDTO GetMainPage(String token){
        return getMainBean.exec(token);
    }

    // 게시글 선택시
    public Optional<PostDAO> GetPost(Long postId){
        return getPostDAOBean.exec(postId);
    }

    // 게시글 작성
    public void create(String body){
        createPostBean.exec(body);
    }

    // 개인 정보 페이지
    // 카톡 로그인 연동
    public UserInfoDTO GetUserInfo(Long userId){
        return getUserInfoBean.exec(userId);
    }

    public void printStore(){
        printStoreBean.exec();
    }

}
