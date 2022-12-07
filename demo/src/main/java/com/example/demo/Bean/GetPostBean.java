package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetPostDAOBean;
import com.example.demo.Bean.Small.GetPostDTOBean;
import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DTO.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetPostBean {
    @Autowired
    GetPostDAOBean getPostDAOBean;
    @Autowired
    GetPostDTOBean getPostDTOBean;

    public PostDTO exec(long postId){
        System.out.println("워우예에~" + postId);
        // Long 으로 변환
        Long longId = postId;

        // 아이디로 postDAO 가져오기
        Optional<PostDAO> OPpostDAO = getPostDAOBean.exec(longId);

        // optional 풀기
        PostDAO postDAO = OPpostDAO.get();

        // DAO -> DTO 변환
        PostDTO postDTO = getPostDTOBean.exec(postDAO);
        System.out.println("postDTO : " + postDTO);

        return postDTO;
    }
}
