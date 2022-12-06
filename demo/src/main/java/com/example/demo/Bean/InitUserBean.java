package com.example.demo.Bean;

import com.example.demo.Bean.Small.InitUserDAOBean;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitUserBean {
    @Autowired
    UserDAORepository repository;
    @Autowired
    InitUserDAOBean initUserDAOBean;



    public void exec(){
        // UserDAO 만들기
        UserDAO userDAO = initUserDAOBean.exec();

        // 저장
        repository.save(userDAO);
    }
}
