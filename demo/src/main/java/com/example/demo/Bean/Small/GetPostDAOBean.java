package com.example.demo.Bean.Small;

import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GetPostDAOBean {
    @Autowired
    ARepository repository;

    public void exec(long id){
        repository.loadById(id);
    }

}
