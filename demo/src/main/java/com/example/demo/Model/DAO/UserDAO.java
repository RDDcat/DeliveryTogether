package com.example.demo.Model.DAO;

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
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user")
    List<UserTagDAO> userTags = new ArrayList<>();

    @OneToMany(mappedBy = "owner")
    List<PostDAO> posts = new ArrayList<>();
}
