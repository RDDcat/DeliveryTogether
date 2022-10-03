package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SavePostBean {
    @Autowired
    ARepository repository;

    public void exec(PostDAO postDAO){
        repository.save(postDAO);
    }
}
