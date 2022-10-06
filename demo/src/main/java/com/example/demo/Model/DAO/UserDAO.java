package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.UserDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
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

    public void changeName(String name){
        this.name = name;
    }

    public UserDTO toUserDTO(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setName(name);

        return userDTO;
    }

}
