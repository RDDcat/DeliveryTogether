package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.PostDAORepository;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveUserBean {
    @Autowired
    UserDAORepository repository;

    public void exec(UserDAO userDAO){
        System.out.println("저장 실행" + userDAO);
        // 저장
        repository.save(userDAO);
    }
}
