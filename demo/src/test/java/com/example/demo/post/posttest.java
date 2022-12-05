package com.example.demo.post;

import com.example.demo.Model.DAO.*;
import com.example.demo.Repository.PostDAORepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

@SpringBootTest
@Transactional
public class posttest {

    @Autowired
    EntityManager em;

    @Autowired
    PostDAORepository postDAORepository;

    @Test
    public void postTag_test() throws Exception {
        TagDAO d1 = TagDAO
                .builder()
                .name("제 1 기숙사")
                .build();

        TagDAO d2 = TagDAO
                .builder()
                .name("제 2 기숙사")
                .build();

        UserDAO user1 = UserDAO.builder()
                .name("test")
                .email("test@naver.com")
                .token("sdakjfaks;djf")
                .refreshToken("dksajflasfd")
                .role(Role.USER)
                .u
                .build();

        UserTagDAO user1Tag1 = UserTagDAO.builder()
                .name(d1.getName())
                .tagDAO(d1)
                .userDAO(user1)
                .build();

        UserTagDAO user1Tag2 = UserTagDAO.builder()
                .name(d2.getName())
                .tagDAO(d2)
                .userDAO(user1)
                .build();


        PostDAO post1 = PostDAO.builder()
                .title("test")
                .describe("test")
                .storeUrl("http://asjkfdhaslkf")
                .limitMinute("30")
                .count(1)
                .build();

        System.out.println(user1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(user1Tag1);
        System.out.println(user1Tag2);
    }
}
