package com.example.demo.post;

import com.example.demo.Model.DAO.*;
import com.example.demo.Repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    UserTagDAORepository userTagDAORepository;

    @Autowired
    PostTagDAORepository postTagDAORepository;

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

        userTagDAORepository.save(user1Tag1);
        userTagDAORepository.save(user1Tag2);


        PostDAO post1 = PostDAO.builder()
                .title("test")
                .describe("test")
                .storeUrl("http://asjkfdhaslkf")
                .limitMinute("30")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .count(1)
                .build();

        postDAORepository.save(post1);

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

        postTagDAORepository.save(postTag1);
        postTagDAORepository.save(postTag2);

//        UserDAO userDAO = userDAORepository.findById(user1.getUserId()).get();
//        System.out.println("userDAO = " + userDAO);

        List<PostTagDAO> allByName = postTagDAORepository.findAllByName(postTag1.getName());
//        for (PostTagDAO postTagDAO : allByName) {
//            System.out.println("postTagDAO = " + postTagDAO);
//            PostDAO postDAO = postDAORepository.findById(postTag1.getPostDAO().getPostId()).get();
//            System.out.println("postDAO = " + postDAO);
//        }

//        System.out.println(user1);
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(user1Tag1);
//        System.out.println(user1Tag2);
//        System.out.println(post1);
    }
}
