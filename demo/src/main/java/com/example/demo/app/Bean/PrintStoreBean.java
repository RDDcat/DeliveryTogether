package com.example.demo.app.Bean;

import com.example.demo.app.Model.DAO.PostDAO;
import com.example.demo.app.Repository.PostDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrintStoreBean { // 임시
    @Autowired
    PostDAORepository repository;

    public void exec(){
        List<PostDAO> all = repository.findAll();
        for(PostDAO p : all){
            System.out.println("키 : " + p.getPostId());
            System.out.println("데이터 : " + p.toString());
        }
    }
}
