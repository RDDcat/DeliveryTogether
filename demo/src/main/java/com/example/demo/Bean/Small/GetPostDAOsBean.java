package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.PostTagSearchDTO;
import com.example.demo.Repository.Custom.PostDAORepositoryImpl;
import com.example.demo.Repository.PostDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetPostDAOsBean {
    @Autowired
    PostDAORepository repository;
    @Autowired
    PostDAORepositoryImpl postDAORepository;

    //TODO Page<PostTagSearchDTO>로 리턴타입을 변경해서 이거에 해당하는 것들 수정 필요
    //findAllByPostDAOs 연관관계 오류로 인해서 삭제함 수정 필요
    public Page<PostTagSearchDTO> exec(String tagName, int page, int size){

        PageRequest pageRequest = PageRequest.of(page, size);

        // 위임
        return repository.searchPost(tagName, pageRequest);
    }

    public List<MetaPostDTO> exec(List<String> tagNames) {
        List<MetaPostDTO> MetaPostDTO = new ArrayList<>();

        for(String tagName : tagNames){
            Page<PostTagSearchDTO> pages = postDAORepository.searchPost(tagName, Pageable.ofSize(10));

            MetaPostDTO metaPostDTO = null;
            metaPostDTO.setTagName(tagName);
            metaPostDTO.setPostTagSearchDTOS(pages);

            MetaPostDTO.add(metaPostDTO);
        }




        return MetaPostDTO;
    }
}
