package com.example.demo.post;

import com.example.demo.Model.DAO.*;
import com.example.demo.Model.DTO.PostTagSearchDTO;
import com.example.demo.Model.DTO.UserTagDTO;
import com.example.demo.Repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

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

    @BeforeEach
    public void TestData() throws Exception{
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
    }

    @Test
    public void 태그에_해당되는_모든_포스트_가져오기() throws Exception {
        PageRequest pageRequest = PageRequest.of(0, 3);

        Page<PostTagSearchDTO> postTagSearchDTOS = postDAORepository.searchPost("제 1 기숙사", pageRequest);

        for (PostTagSearchDTO postTagSearchDTO : postTagSearchDTOS) {
            System.out.println("postTagSearchDTO = " + postTagSearchDTO);
        }
    }

    @Test
    public void 사용자구독태그가져오기() throws Exception{
        List<UserTagDTO> test =
                userDAORepository.findAllUserTags(userDAORepository.findByName("test").get().getUserId());

        for (UserTagDTO s : test) {
            System.out.println("UserTag = " + s);
        }
    }


}
