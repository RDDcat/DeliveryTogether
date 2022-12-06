package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserInfoDTOBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetUserDTOBean getUserDTOBean;
    @Autowired
    GetUserInfoDTOBean getUserInfoDTOBean;

    public UserInfoDTO exec(Long userId){
        //
        UserDAO userDAO = getUserDAOBean.exec(userId);

        //
        UserDTO userDTO = getUserDTOBean.exec(userDAO);

        //
        UserInfoDTO userInfoDTO = getUserInfoDTOBean.exec(userDTO);

        return userInfoDTO;
    }

    // 변환 userDTO -> userInfoDTO
    public UserInfoDTO exec(UserDTO userDTO){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserDTO(userDTO);
        return userInfoDTO;
    }
}
