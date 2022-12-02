package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.ARepository;
import com.example.demo.Repository.PostDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPostDAOsBean {
    @Autowired
    PostDAORepository repository;

    public List<PostDAO> exec(String tagName){
        // 위임
        return repository.findAllByPostTagDAOS(tagName);
    }

}
