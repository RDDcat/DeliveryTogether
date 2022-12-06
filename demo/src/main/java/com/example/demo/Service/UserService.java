package com.example.demo.Service;

import com.example.demo.Model.DAO.TagDAO;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import com.example.demo.Repository.TagDAORepository;
import com.example.demo.Repository.UserDAORepository;
import com.example.demo.Repository.UserTagDAORepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserDAORepository userDAORepository;

    private final UserTagDAORepository userTagDAORepository;

    private final TagDAORepository tagDAORepository;

    public Optional<UserDAO> loadUserById(Long userId){
        return userDAORepository.findById(userId);
    }

    //삭제
    public void deleteTags(List<Long> ids){
        if(ids.size() > 0){
            for (Long id : ids) {
                userTagDAORepository.deleteById(id);
            }
        }
    }

    //수정
    public void addTags(Long userId, List<String> tagNames){
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
