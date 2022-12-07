package com.example.demo;

import com.example.demo.Model.DAO.*;
import com.example.demo.Repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;



    @PostConstruct
    public void init(){
        initService.dbInit1();
    }


    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final UserDAORepository userDAORepository;

        private final PostDAORepository postDAORepository;

        private final TagDAORepository  tagDAORepository;

        private final UserTagDAORepository userTagDAORepository;

        private final PostTagDAORepository postTagDAORepository;

        public void dbInit1() {
            TagDAO d1 = TagDAO
                    .builder()
                    .name("1기숙사")
                    .build();

            TagDAO d2 = TagDAO
                    .builder()
                    .name("2기숙사")
                    .build();

            TagDAO d3 = TagDAO
                    .builder()
                    .name("벙커")
                    .build();

            TagDAO d4 = TagDAO
                    .builder()
                    .name("e동")
                    .build();

            tagDAORepository.save(d1);
            tagDAORepository.save(d2);
            tagDAORepository.save(d3);
            tagDAORepository.save(d4);


            UserDAO user1 = UserDAO.builder()
                    .name("user1")
                    .token("dsafhlajkhelwkqhroasdiuf")
                    .refreshToken("jkashdflkxczvaiuoeghwqr")
                    .role(Role.USER)
                    .build();

            UserDAO user2 = UserDAO.builder()
                    .name("user2")
                    .token("dsahjvgbcxzpvhnapfr3")
                    .refreshToken("d123i4hidgf15321516d")
                    .role(Role.USER)
                    .build();


            userDAORepository.save(user1);
            userDAORepository.save(user2);

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

            UserTagDAO user2Tag1 = UserTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .userDAO(user2)
                    .build();

            UserTagDAO user2Tag2 = UserTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .userDAO(user2)
                    .build();

            userTagDAORepository.save(user1Tag1);
            userTagDAORepository.save(user1Tag2);
            userTagDAORepository.save(user2Tag1);
            userTagDAORepository.save(user2Tag2);


            PostDAO post1 = PostDAO.builder()
                    .title("삽겹살")
                    .describe("삽겹살 같이 먹어요")
                    .storeUrl("http://testurl1")
                    .limitMinute("30")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food/food_3.jpg")
                    .build();

            PostDAO post2 = PostDAO.builder()
                    .title("스테이크")
                    .describe("스테이크 먹고 싶어요")
                    .storeUrl("http://testurl2")
                    .limitMinute("30")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food/food_6.jpg")
                    .build();

            PostDAO post3 = PostDAO.builder()
                    .title("치킨집")
                    .describe("치맥 ㄱㄱ?")
                    .storeUrl("http://testurl3")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food/food_19.jpg")
                    .build();

            PostDAO post4 = PostDAO.builder()
                    .title("일식")
                    .describe("추운데 라멘 먹을래요?")
                    .storeUrl("http://testurl4")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food/food_8.jpg")
                    .build();

            postDAORepository.save(post1);
            postDAORepository.save(post2);
            postDAORepository.save(post3);
            postDAORepository.save(post4);


            PostTagDAO postTag1 = PostTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .postDAO(post1)
                    .build();

            PostTagDAO postTag2 = PostTagDAO.builder()
                    .name(d2.getName())
                    .tagDAO(d2)
                    .postDAO(post2)
                    .build();

            PostTagDAO postTag3 = PostTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .postDAO(post3)
                    .build();

            PostTagDAO postTag4 = PostTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .postDAO(post4)
                    .build();

            postTagDAORepository.save(postTag1);
            postTagDAORepository.save(postTag2);
            postTagDAORepository.save(postTag3);
            postTagDAORepository.save(postTag4);
        }
    }
}
