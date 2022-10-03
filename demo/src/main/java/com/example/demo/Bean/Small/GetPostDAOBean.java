package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetPostDAOBean {
    @Autowired
    ARepository repository;

    public PostDAO exec(long id){
        // 위임
        return repository.loadById(id);
    }

}
