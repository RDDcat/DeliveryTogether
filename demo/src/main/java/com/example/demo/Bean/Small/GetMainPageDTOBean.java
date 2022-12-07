package com.example.demo.Bean.Small;

import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetMainPageDTOBean {

    public MainPageDTO exec(List<MetaPostDTO> postDAOS, long userId){
        MainPageDTO mainPageDTO = new MainPageDTO();

        mainPageDTO.setUserId(userId);
        mainPageDTO.setMetaPostDTOS(postDAOS);

        return mainPageDTO;
    }
}
