package com.example.demo.Model.DAO;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "usertag")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UserTagDAO {

    @Id
    @GeneratedValue
    private Long userTagId;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDAO userDAO;


}
