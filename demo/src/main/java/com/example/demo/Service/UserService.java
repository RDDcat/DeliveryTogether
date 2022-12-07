package com.example.demo.Service;

import com.example.demo.Bean.InitUserBean;
import com.example.demo.Bean.Small.AddTagsBean;
import com.example.demo.Bean.Small.DeleteTagsBean;
import com.example.demo.Model.DAO.TagDAO;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import com.example.demo.Model.OAuthToken;
import com.example.demo.Model.api.KakaoUserDTO;
import com.example.demo.Repository.TagDAORepository;
import com.example.demo.Repository.UserDAORepository;
import com.example.demo.Repository.UserTagDAORepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final TagDAORepository tagDAORepository;
    @Autowired
    InitUserBean initUserBean;

    @Autowired
    DeleteTagsBean deleteTagsBean;

    @Autowired
    AddTagsBean addTagsBean;


    public void InitUser(KakaoUserDTO kakaoUserDTO, OAuthToken oauthToken){
        initUserBean.exec(kakaoUserDTO, oauthToken);
    }

    public void deleteTag(Long tagId){
        deleteTagsBean.exec(tagId);
    }

    public void addTag(Long userId, String tagName){
        addTagsBean.exec(userId, tagName);
    }

}
