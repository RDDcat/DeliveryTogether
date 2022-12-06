package com.example.demo.Bean.Small;

import com.example.demo.Repository.UserTagDAORepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DeleteTagsBean {
    private final UserTagDAORepository userTagDAORepository;

    //삭제
    public void exec(List<Long> ids){
        if(ids.size() > 0){
            for (Long id : ids) {
                userTagDAORepository.deleteById(id);
            }
        }
    }
}
