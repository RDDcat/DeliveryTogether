package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.TagDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import com.example.demo.Repository.TagDAORepository;
import com.example.demo.Repository.UserDAORepository;
import com.example.demo.Repository.UserTagDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AddTagsBean {
    @Autowired
    TagDAORepository tagDAORepository;
    @Autowired
    UserDAORepository userDAORepository;
    @Autowired
    UserTagDAORepository userTagDAORepository;

    //수정
    public void exec(Long userId, List<String> tagNames){
        for (String tagName : tagNames) {

            Optional<TagDAO> getTag = tagDAORepository.findByName(tagName);
            TagDAO tag = null;

            // 태그가 등록되어 있지 않을 때
            if(getTag == null){
                tag = tagDAORepository.save(TagDAO.builder()
                        .name(tagName)
                        .build());
            }
            // 태그가 있을 때
            else {
                tag = getTag.get();
            }

            UserTagDAO userTag = UserTagDAO.builder()
                    .name(tag.getName())
                    .userDAO(userDAORepository.findById(userId).get())
                    .tagDAO(tag)
                    .build();

            userTagDAORepository.save(userTag);
        }
    }
}
