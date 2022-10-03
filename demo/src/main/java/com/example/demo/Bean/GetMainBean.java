package com.example.demo.Bean;

import com.example.demo.Model.DTO.MetaPostDTO;
import org.springframework.stereotype.Component;

@Component
public class GetMainBean {
    public MetaPostDTO exec(){
        MetaPostDTO MetaPostDTO = new MetaPostDTO();

        return MetaPostDTO;
    }
}
