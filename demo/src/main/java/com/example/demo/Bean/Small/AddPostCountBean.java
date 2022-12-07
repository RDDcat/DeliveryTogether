package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.PostDAORepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AddPostCountBean {

    private final PostDAORepository postDAORepository;

    public boolean exec(Long postId){
        PostDAO findPost = postDAORepository.findById(postId).get();

        boolean flag = findPost.addCount();

        return flag;


    }

}
