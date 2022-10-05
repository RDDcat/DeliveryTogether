package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetMetaPostDTOFromPostDAOs;
import com.example.demo.Bean.Small.GetPostDAOsBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetMainBean {
    @Autowired
    GetPostDAOsBean getPostDAOsBean;
    @Autowired
    GetMetaPostDTOFromPostDAOs getMetaPostDTOFromPostDAOs;


    public MainPageDTO exec(){
        // 저장소에서 슥삭쇽
        PostDAO[] postDAOS = getPostDAOsBean.exec();

        MainPageDTO mainPageDTO = new MainPageDTO();
        mainPageDTO.setMetaPostDTOS(getMetaPostDTOFromPostDAOs.exec(postDAOS));

        // 변환 슥삭쇽
        return mainPageDTO;
    }
}
