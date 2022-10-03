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
        store.put(post.getPostId(), post);
    }

    // id로 조회
    public PostDAO loadById(Long id){
        return store.get(id);
    }

    // 10개 찾기
    public PostDAO[] load10(){
        PostDAO[] postDAOS = new PostDAO[10];
        int count = 0;

        for (Long key : store.keySet()) {
            postDAOS[count] = store.get(key);
            if(++count == 10){
                return postDAOS;
            }
        }

        return postDAOS;
    }

}
