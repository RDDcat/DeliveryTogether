package com.example.demo.Bean;

import com.example.demo.Bean.Small.*;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.UserTagDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class GetMainBean {
    @Autowired
    GetPostDAOsBean getPostDAOsBean;
    @Autowired
    GetMainPageDTOBean getMainPageDTOBean;
    @Autowired
    GetTagsBean getTagsBean;
    @Autowired
    GetUserIdBean getUserIdBean;
    @Autowired
    GetDefaultPostDAOS getDefaultPostDAOS;
    @Autowired
    GetTagNamesBean getTagNamesBean;

    public MainPageDTO exec(String token){

        System.out.println("토큰 중간 확인 1 : " + token);
        // 토큰으로 유저 아이디 가져오기
        Optional<UserDAO> userDAO = getUserIdBean.exec(token);
        System.out.println("토큰 중간 확인 2: " + token);

        long userId = 5;

        //
        if(userDAO.isPresent()){
            userId = userDAO.get().getUserId();
        }


        // 사용자 아이디로 사용자가 구독한 태그 이름 가져오기
        List<UserTagDTO> tags = getTagsBean.exec(userId);
        List<String> tagNames = getTagNamesBean.exec(tags);


        // 태그 이름으로 저장소에서 PostDAO 가져오기
        List<MetaPostDTO> metaPostDTOS = getPostDAOsBean.exec(tagNames);

        // 만약 구독 정보가 없으면 다 가져오기
        if(metaPostDTOS == null){
            metaPostDTOS = getDefaultPostDAOS.exec();
        }


        // DAO -> DTO 변환 후 리턴
        MainPageDTO mainPageDTO = getMainPageDTOBean.exec(metaPostDTOS, userId, token);

        System.out.println("토큰 중간 확인 마지막 : " + token);
        
        return mainPageDTO;
    }
}
