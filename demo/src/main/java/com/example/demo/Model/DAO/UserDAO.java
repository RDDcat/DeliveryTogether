package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.UserDTO;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UserDAO {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;
    private String name;

    @OneToMany(mappedBy = "userDAO")
    List<UserTagDAO> userTagDAOS = new ArrayList<>();

    @OneToMany(mappedBy = "userDAO")
    List<PostDAO> postDAOS = new ArrayList<>();

    public UserDTO toUserDTO(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setName(name);

        return userDTO;
    }

}
