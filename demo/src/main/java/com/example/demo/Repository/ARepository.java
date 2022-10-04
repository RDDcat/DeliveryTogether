package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostDAO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ARepository {

    private static Map<Long, PostDAO> store = new HashMap<>();

    // 저장
    public void save(PostDAO post){
        // 저장
        store.put(post.getPostId(), post);

        // 로그
        printStore();
    }

    // id로 조회
    public PostDAO loadById(Long id){
        // 로그
        printStore();

        return store.get(id);
    }

    // 10개 찾기
    public PostDAO[] load10(){
        PostDAO[] postDAOS = new PostDAO[10];
        int count = 0;

        // 로그
        printStore();

        for (Long key : store.keySet()) {
            postDAOS[count] = store.get(key);
            if(++count == 10){
                return postDAOS;
            }
        }

        return postDAOS;
    }

    public void printStore(){
        for (Long key : store.keySet()) {
            System.out.println("키 : " +key);
            System.out.println("데이터 : " + store.get(key).toString());
        }
    }

}
