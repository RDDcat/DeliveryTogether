package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetPostDAOsBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetMainBean {
    @Autowired
    GetPostDAOsBean getPostDAOsBean;
    int count=10;

    public MetaPostDTO[] exec(){
        // 정수있음
        MetaPostDTO[] metaPostDTOs = new MetaPostDTO[count];

        // 저장소에서 슥삭쇽
        PostDAO[] postDAOS = getPostDAOsBean.exec();

        // 변환 슥삭쇽
        for(int i=0; i<count; i++){
            metaPostDTOs[i] = postDAOS[i].toMetaPostDTO();
        }

        return metaPostDTOs;
    }
}
