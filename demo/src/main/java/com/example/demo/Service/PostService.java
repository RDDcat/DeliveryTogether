package com.example.demo.Service;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.PostDAORepository;
import com.example.demo.Repository.UserDAORepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class PostService {

    private final PostDAORepository postDAORepository;
    private final UserDAORepository userDAORepository;

    public PostDAO create(PostDAO postDAO){
        postDAORepository.save(postDAO);
        return postDAO;
    }

    public Optional<PostDAO> loadById(Long postId){
        return postDAORepository.findById(postId);
    }

    public void printStore(){
        List<PostDAO> all = postDAORepository.findAll();
        for(PostDAO p : all){
            System.out.println("키 : " + p.getPostId());
            System.out.println("데이터 : " + p.toString());
        }
    }

}
