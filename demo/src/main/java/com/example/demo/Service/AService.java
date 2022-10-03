package com.example.demo.Service;

import com.example.demo.Bean.GetMainBean;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Autowired
    GetMainBean getMainBean;

    // 홈 화면
    public MetaPostDTO GetMainPage(){
        return getMainBean.exec();
    }
    // 게시글 선택시
    public void GetPost(){

    }
    // 게시글 작성
    public void MakePost(){

    }
    // 개인 정보 페이지
    // 카톡 로그인 연동
    public void method4(){

    }

}
