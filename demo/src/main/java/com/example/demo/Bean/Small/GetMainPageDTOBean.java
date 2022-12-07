package com.example.demo.Bean.Small;

import com.example.demo.Model.DTO.MainPageDTO;
import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetMainPageDTOBean {

    public MainPageDTO exec(List<MetaPostDTO> postDAOS, long userId, String token){
        MainPageDTO mainPageDTO = new MainPageDTO();

        mainPageDTO.setUserId(userId);
        mainPageDTO.setAccess_token(token);
        mainPageDTO.setMetaPostDTOS(postDAOS);

        return mainPageDTO;
    }
}
