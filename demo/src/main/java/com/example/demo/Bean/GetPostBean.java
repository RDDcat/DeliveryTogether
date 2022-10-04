package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetPostDAOBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetPostBean {
    @Autowired
    GetPostDAOBean getPostDAOBean;

    public PostDTO exec(long postId){
        return getPostDAOBean.exec(postId).toPostDTO();
    }
}
