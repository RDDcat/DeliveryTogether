package com.example.demo.Bean.Small;

import com.example.demo.Model.DTO.UserTagDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetTagNamesBean {
    public List<String> exec(List<UserTagDTO> tags) {
        List<String> tagNames = new ArrayList<>();
        for (UserTagDTO tag : tags) {
            tagNames.add(tag.getTagName());
        }
        return tagNames;
    }
}
