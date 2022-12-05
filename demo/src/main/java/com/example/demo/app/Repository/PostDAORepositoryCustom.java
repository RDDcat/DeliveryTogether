package com.example.demo.app.Repository;

import com.example.demo.app.Model.DTO.PostTagSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostDAORepositoryCustom {
    Page<PostTagSearchDTO> searchPost(String tagname, Pageable pageable);
}
