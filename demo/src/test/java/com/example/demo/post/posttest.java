package com.example.demo.post;

import com.example.demo.Model.DAO.*;
import com.example.demo.Repository.PostDAORepository;
import com.example.demo.Repository.PostTagDAORepository;
import com.example.demo.Repository.TagDAORepository;
import com.example.demo.Repository.UserDAORepository;
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

    @Autowired
    UserDAORepository userDAORepository;

    @Autowired
    TagDAORepository tagDAORepository;

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

        tagDAORepository.save(d1);
        tagDAORepository.save(d2);

        UserDAO user1 = UserDAO.builder()
                .name("test")
                .email("test@naver.com")
                .token("sdakjfaks;djf")
                .refreshToken("dksajflasfd")
                .role(Role.USER)
                .build();

        userDAORepository.save(user1);

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

        em.persist(user1Tag1);
        em.persist(user1Tag2);


        PostDAO post1 = PostDAO.builder()
                .title("test")
                .describe("test")
                .storeUrl("http://asjkfdhaslkf")
                .limitMinute("30")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .count(1)
                .build();

        PostTagDAO postTag1 = PostTagDAO.builder()
                .name(d1.getName())
                .tagDAO(d1)
                .postDAO(post1)
                .build();

        PostTagDAO postTag2 = PostTagDAO.builder()
                .name(d2.getName())
                .tagDAO(d2)
                .postDAO(post1)
                .build();

        em.persist(postTag1);
        em.persist(postTag2);

//        post1.addTags(postTag1);
//        post1.addTags(postTag2);


        postDAORepository.save(post1);


        System.out.println(user1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(user1Tag1);
        System.out.println(user1Tag2);
        System.out.println(post1);
    }
}
