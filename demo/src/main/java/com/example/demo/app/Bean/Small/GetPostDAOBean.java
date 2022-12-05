package com.example.demo.app.Bean.Small;

import com.example.demo.app.Model.DAO.PostDAO;
import com.example.demo.app.Repository.PostDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetPostDAOBean {
    @Autowired
    PostDAORepository repository;

    public Optional<PostDAO> exec(long id){
        // 위임
        return repository.findById(id);
    }

}
