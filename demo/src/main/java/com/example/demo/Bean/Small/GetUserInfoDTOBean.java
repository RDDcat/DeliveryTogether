package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetUserInfoDTOBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetUserDTOBean getUserDTOBean;

    @Autowired
    GetTagsBean getTagsBean;

    public UserInfoDTO exec(Long userId){
        //
        Optional<UserDAO> userDAO = getUserDAOBean.exec(userId);

        //
        UserDTO userDTO = getUserDTOBean.exec(userDAO.get());

        List<String> tagNames = getTagsBean.exec(userId);

        //
        UserInfoDTO userInfoDTO = exec(userDTO, tagNames);

        return userInfoDTO;
    }

    // 변환 userDTO -> userInfoDTO
    public UserInfoDTO exec(UserDTO userDTO, List<String> tagNames){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserDTO(userDTO);
        userInfoDTO.setTagNames(tagNames);
        return userInfoDTO;
    }
}
