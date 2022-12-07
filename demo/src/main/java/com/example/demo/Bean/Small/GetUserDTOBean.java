package com.example.demo.Bean.Small;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Repository.UserDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserDTOBean {

    @Autowired
    UserDAORepository userDAORepository;

    public UserDTO exec(UserDAO user){
        UserDAO findUser = userDAORepository.findById(user.getUserId()).get();

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(findUser.getUserId());
        userDTO.setName(findUser.getName());

        return userDTO;
    }
}
