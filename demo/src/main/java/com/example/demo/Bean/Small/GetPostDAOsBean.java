package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GetPostDAOsBean {
    @Autowired
    ARepository repository;

    public PostDAO[] exec(){
        return repository.load10();
    }

}
