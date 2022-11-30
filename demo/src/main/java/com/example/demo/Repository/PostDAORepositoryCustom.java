package com.example.demo.Repository;

import com.example.demo.Model.DTO.PostTagSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostDAORepositoryCustom {
    Page<PostTagSearchDTO> searchPost(String tagname, Pageable pageable);
}
