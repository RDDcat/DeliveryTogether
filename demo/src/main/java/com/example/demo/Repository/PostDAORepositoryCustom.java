package com.example.demo.Repository;

import com.example.demo.Model.DTO.PostDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostDAORepositoryCustom {
    Page<PostDTO> searchPost(String tagname, Pageable pageable);
}
