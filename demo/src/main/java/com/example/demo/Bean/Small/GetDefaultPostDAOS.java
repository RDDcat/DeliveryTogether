package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DAO.TagDAO;
import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.PostTagSearchDTO;
import com.example.demo.Repository.PostDAORepository;
import com.example.demo.Repository.TagDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetDefaultPostDAOS {
    @Autowired
    PostDAORepository postDAORepository;
    @Autowired
    TagDAORepository tagDAORepository;

    public List<MetaPostDTO> exec(){
        List<MetaPostDTO> MetaPostDTO = new ArrayList<>();

        // 모든 태그 가져오기
        List<TagDAO> tagDAOS = tagDAORepository.findAll();

        System.out.println("tagDAOS" + tagDAOS);

        //
        for(TagDAO tagDAO : tagDAOS){
            String tagName = tagDAO.getName();
            Page<PostTagSearchDTO> pages = postDAORepository.searchPost(tagName, Pageable.ofSize(10));

            MetaPostDTO metaPostDTO = new MetaPostDTO();
            metaPostDTO.setTagName(tagName);
            metaPostDTO.setPostTagSearchDTOS(pages);

            System.out.println("metaPostDTO" + metaPostDTO);

            MetaPostDTO.add(metaPostDTO);
        }

        return MetaPostDTO;
    }
}
