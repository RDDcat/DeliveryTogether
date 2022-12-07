package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetMainPageDTOBean;
import com.example.demo.Bean.Small.GetPostDAOsBean;
import com.example.demo.Bean.Small.GetTagsBean;
import com.example.demo.Bean.Small.GetUserIdBean;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public MainPageDTO exec(String token){
        // 토큰으로 유저 아이디 가져오기
        Optional<UserDAO> userDAO = getUserIdBean.exec(token);
        long userId = userDAO.get().getUserId();

        // 사용자 아이디로 사용자가 구독한 태그 이름 가져오기
        List<String> tagNames = getTagsBean.exec(userId);

        // 태그 이름으로 저장소에서 PostDAO 가져오기
        // TODO 함수 리턴 형식 변경으로 인한 변경 필요할거 같음
        List<MetaPostDTO> metaPostDTOS = getPostDAOsBean.exec(tagNames);

        // DAO -> DTO 변환 후 리턴
        MainPageDTO mainPageDTO = getMainPageDTOBean.exec(metaPostDTOS, userId);
        
        return mainPageDTO;
    }
}
