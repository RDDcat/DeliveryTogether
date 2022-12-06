package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.stereotype.Component;

@Component
public class GetMetaPostDTOFromPostDAOs {
    int count = 10;

    public MetaPostDTO[] exec(PostDAO[] postDAOS){
        MetaPostDTO[] metaPostDTOs = new MetaPostDTO[count];

        // 변환
        for(int i=0; i<count; i++){
            if(postDAOS[i] == null){
                return metaPostDTOs;
            }
            metaPostDTOs[i] = postDAOS[i].toMetaPostDTO();
        }

        return metaPostDTOs;
    }
}
