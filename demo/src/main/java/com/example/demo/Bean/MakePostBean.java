package com.example.demo.Bean;

import com.example.demo.Bean.Small.SavePostBean;
import com.example.demo.Model.DAO.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakePostBean {
    @Autowired
    SavePostBean savePostBean;

    public void exec(PostDAO postDAO){
        savePostBean.exec(postDAO);
    }

}
