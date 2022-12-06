package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.ARepository;
import com.example.demo.Repository.PostDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavePostBean {
    @Autowired
    PostDAORepository repository;

    public void exec(PostDAO postDAO){
        // 위임
        repository.save(postDAO);
    }
}
