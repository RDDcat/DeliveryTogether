package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import com.example.demo.Model.DTO.UserTagDTO;
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

        List<UserTagDTO> tags = getTagsBean.exec(userId);

        //
        UserInfoDTO userInfoDTO = exec(userDTO, tags);

        return userInfoDTO;
    }

    // 변환 userDTO -> userInfoDTO
    public UserInfoDTO exec(UserDTO userDTO, List<UserTagDTO> tags){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserDTO(userDTO);
        userInfoDTO.setTags(tags);
        return userInfoDTO;
    }
}
