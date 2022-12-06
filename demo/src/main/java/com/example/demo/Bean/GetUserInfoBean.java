package com.example.demo.Bean;

import com.example.demo.Bean.Small.GetUserDAOBean;
import com.example.demo.Bean.Small.GetUserDTOBean;
import com.example.demo.Bean.Small.GetUserInfoDTOBean;
import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.DTO.UserInfoDTO;
import com.example.demo.Repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserInfoBean {
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
}
