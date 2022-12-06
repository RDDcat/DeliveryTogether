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
    GetUserInfoDTOBean getUserInfoDTOBean;
    public UserInfoDTO exec(Long userId){
        // 디비 요청
        UserInfoDTO userInfoDTO = getUserInfoDTOBean.exec(userId);
        
        // 카카오 api 요청

        return userInfoDTO;
    }
}
