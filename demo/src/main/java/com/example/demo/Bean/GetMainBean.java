package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetMetaPostDTOFromPostDAOs;
import com.example.demo.Bean.Small.GetPostDAOsBean;
import com.example.demo.Bean.Small.GetTagsBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetMainBean {
    @Autowired
    GetPostDAOsBean getPostDAOsBean;
    @Autowired
    GetMetaPostDTOFromPostDAOs getMetaPostDTOFromPostDAOs;


    public MainPageDTO exec(){
        // 사용자 아이디로 사용자가 구독한 태그 이름 가져오기
        List<String> tagNames = GetTagsBean.exec();

        // 태그 이름으로 저장소에서 PostDAO 가져오기
        PostDAO[] postDAOS = getPostDAOsBean.exec(tagNames);

        // DAO -> DTO 변환 후 리턴
        MainPageDTO mainPageDTO = new MainPageDTO();
        mainPageDTO.setMetaPostDTOS(getMetaPostDTOFromPostDAOs.exec(postDAOS));
        
        return mainPageDTO;
    }
}
