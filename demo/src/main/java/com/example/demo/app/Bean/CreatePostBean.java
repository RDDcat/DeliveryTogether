package com.example.demo.app.Bean;

import com.example.demo.app.Bean.Small.ParseBodyBean;
import com.example.demo.app.Bean.Small.SavePostBean;
import com.example.demo.app.Model.DAO.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePostBean {
    @Autowired
    SavePostBean savePostBean;
    @Autowired
    ParseBodyBean parseBodyBean;

    public void exec(String body){
        // body를 PostDAO로 파싱
        PostDAO postDAO = parseBodyBean.exec(body);

        // 저장
        savePostBean.exec(postDAO);
    }

}
