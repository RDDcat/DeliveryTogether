package com.example.demo.Model.DAO;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "usertag")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UserTagDAO {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDAO userDAO;


}
