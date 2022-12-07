package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.UserDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    private String name;

    private String token;

    private String refreshToken;

    @Enumerated(EnumType.STRING)
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "userDAO")
    List<UserTagDAO> userTagDAOS = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "userDAO")
    List<PostDAO> postDAOS = new ArrayList<>();

    @Builder
    public UserDAO(String name, String token, String refreshToken, Role role) {
        this.name = name;
        this.token = token;
        this.refreshToken = refreshToken;
        this.role = role;
    }

    public UserDTO toUserDTO(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setName(name);

        return userDTO;
    }

}
