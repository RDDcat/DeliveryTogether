package com.example.demo;

import com.example.demo.Model.DAO.*;
import com.example.demo.Model.DTO.UserTagDTO;
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

            UserDAO maro = UserDAO.builder()
                    .name("마로아님;")
                    .token("dsahjvgbcxzpvhnapfr3")
                    .refreshToken("d123i4hidgf15321516d")
                    .role(Role.USER)
                    .build();


            userDAORepository.save(user1);
            userDAORepository.save(user2);
            userDAORepository.save(maro);


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

            UserTagDAO maroTag1 = UserTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .userDAO(maro)
                    .build();

            UserTagDAO maroTag2 = UserTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .userDAO(maro)
                    .build();

            userTagDAORepository.save(user1Tag1);
            userTagDAORepository.save(user1Tag2);
            userTagDAORepository.save(user2Tag1);
            userTagDAORepository.save(user2Tag2);
            userTagDAORepository.save(maroTag1);
            userTagDAORepository.save(maroTag2);


            PostDAO post1 = PostDAO.builder()
                    .title("삽겹살-새마을식당")
                    .describe("삽겹살 같이 먹어요")
                    .storeUrl("http://testurl1")
                    .limitMinute("30")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food02.fab138ac.jpg")
                    .build();

            PostDAO post2 = PostDAO.builder()
                    .title("스테이크-아웃백")
                    .describe("스테이크 먹고 싶어요")
                    .storeUrl("http://testurl2")
                    .limitMinute("30")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food05.dc9a71f9.jpg")
                    .build();

            PostDAO post3 = PostDAO.builder()
                    .title("치킨집-푸라닭")
                    .describe("치맥 ㄱㄱ?")
                    .storeUrl("http://testurl3")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food18.9140d572.jpg")
                    .build();

            PostDAO post4 = PostDAO.builder()
                    .title("일식-이치란")
                    .describe("추운데 라멘 먹을래요?")
                    .storeUrl("http://testurl4")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food07.8abcd559.jpg")
                    .build();


            PostDAO post5 = PostDAO.builder()
                    .title("분식-아딸")
                    .describe("매운거 같이 먹을 사람?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food00.c04141eb.jpg")
                    .build();

            PostDAO post6 = PostDAO.builder()
                    .title("중식-중화루")
                    .describe("추울 땐 짬뽕 어떄?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food13.4c2e5541.jpg")
                    .build();

            PostDAO post7 = PostDAO.builder()
                    .title("중식-중화루")
                    .describe("탕수육?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food14.db3f2187.jpg")
                    .build();

            PostDAO post8 = PostDAO.builder()
                    .title("한식-자연드림")
                    .describe("치킨 대신 뜨끈한 닭백숙")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food17.e157c069.jpg")
                    .build();

            PostDAO post9 = PostDAO.builder()
                    .title("한식-냉면집")
                    .describe("이열 치열 냉면 먹자")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food01.a7fa4143.jpg")
                    .build();

            PostDAO post10 = PostDAO.builder()
                    .title("일식-스시조아")
                    .describe("힘들 땐 맛있는 초밥 먹자")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food12.3e0516c4.jpg")
                    .build();

            PostDAO post11 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("연어 스테이크 먹자")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user2)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();

            PostDAO post12 = PostDAO.builder()
                    .title("일식-홍대덮밥")
                    .describe("장어 덮밥 땡기는 데 같이 시키실 분?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food11.71fb03cc.jpg")
                    .build();

            PostDAO post13 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("붉닭 붕어빵 맛있겠다 그치?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(user1)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();

            PostDAO post14 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("붉닭 붕어빵 맛있겠다 그치?")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();

            PostDAO post15 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("팥붕과 슈붕 그리고.. 아이스크림..!!")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();

            PostDAO post16 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("키친 마이아르 승우아빠 응원해")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();

            PostDAO post17 = PostDAO.builder()
                    .title("양식-마이야르")
                    .describe("명란 붕어빵 레전드임")
                    .storeUrl("http://testurl")
                    .limitMinute("15")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .countNum(1)
                    .userDAO(maro)
                    .picture("/static/img/food20.9bf13585.jpg")
                    .build();


            postDAORepository.save(post1);
            postDAORepository.save(post2);
            postDAORepository.save(post3);
            postDAORepository.save(post4);
            postDAORepository.save(post5);
            postDAORepository.save(post6);
            postDAORepository.save(post7);
            postDAORepository.save(post8);
            postDAORepository.save(post9);
            postDAORepository.save(post10);
            postDAORepository.save(post11);
            postDAORepository.save(post12);
            postDAORepository.save(post13);
            postDAORepository.save(post14);
            postDAORepository.save(post15);
            postDAORepository.save(post16);
            postDAORepository.save(post17);

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

            PostTagDAO postTag5 = PostTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .postDAO(post5)
                    .build();

            PostTagDAO postTag6 = PostTagDAO.builder()
                    .name(d2.getName())
                    .tagDAO(d2)
                    .postDAO(post6)
                    .build();

            PostTagDAO postTag7 = PostTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .postDAO(post7)
                    .build();

            PostTagDAO postTag8 = PostTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .postDAO(post8)
                    .build();

            PostTagDAO postTag9 = PostTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .postDAO(post9)
                    .build();

            PostTagDAO postTag10 = PostTagDAO.builder()
                    .name(d2.getName())
                    .tagDAO(d2)
                    .postDAO(post10)
                    .build();

            PostTagDAO postTag11 = PostTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .postDAO(post11)
                    .build();

            PostTagDAO postTag12 = PostTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .postDAO(post12)
                    .build();

            PostTagDAO postTag13 = PostTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .postDAO(post4)
                    .build();

            PostTagDAO postTag14 = PostTagDAO.builder()
                    .name(d2.getName())
                    .tagDAO(d2)
                    .postDAO(post5)
                    .build();

            PostTagDAO postTag15 = PostTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .postDAO(post6)
                    .build();

            PostTagDAO postTag16 = PostTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .postDAO(post7)
                    .build();

            PostTagDAO postTag17 = PostTagDAO.builder()
                    .name(d1.getName())
                    .tagDAO(d1)
                    .postDAO(post13)
                    .build();

            PostTagDAO postTag18 = PostTagDAO.builder()
                    .name(d2.getName())
                    .tagDAO(d2)
                    .postDAO(post14)
                    .build();

            PostTagDAO postTag19 = PostTagDAO.builder()
                    .name(d3.getName())
                    .tagDAO(d3)
                    .postDAO(post15)
                    .build();

            PostTagDAO postTag20 = PostTagDAO.builder()
                    .name(d4.getName())
                    .tagDAO(d4)
                    .postDAO(post16)
                    .build();


            postTagDAORepository.save(postTag1);
            postTagDAORepository.save(postTag2);
            postTagDAORepository.save(postTag3);
            postTagDAORepository.save(postTag4);
            postTagDAORepository.save(postTag5);
            postTagDAORepository.save(postTag6);
            postTagDAORepository.save(postTag7);
            postTagDAORepository.save(postTag8);
            postTagDAORepository.save(postTag9);
            postTagDAORepository.save(postTag10);
            postTagDAORepository.save(postTag11);
            postTagDAORepository.save(postTag12);
            postTagDAORepository.save(postTag13);
            postTagDAORepository.save(postTag14);
            postTagDAORepository.save(postTag15);
            postTagDAORepository.save(postTag16);
            postTagDAORepository.save(postTag17);
            postTagDAORepository.save(postTag18);
            postTagDAORepository.save(postTag19);
            postTagDAORepository.save(postTag20);
        }
    }
}
