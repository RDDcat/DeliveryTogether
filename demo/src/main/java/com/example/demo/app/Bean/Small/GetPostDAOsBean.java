package com.example.demo.app.Bean.Small;

import com.example.demo.app.Model.DAO.PostDAO;
import com.example.demo.app.Repository.PostDAORepository;
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

    public PostDAO[] exec(List<String> tagNames) {
        return null;
    }
}
