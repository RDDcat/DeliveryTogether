package com.example.demo.Model.DAO;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "usertag")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class UserTagDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userTagId;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDAO userDAO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private TagDAO tagDAO;

    @Builder
    public UserTagDAO(String name, UserDAO userDAO, TagDAO tagDAO) {
        this.name = name;
        this.userDAO = userDAO;
        this.tagDAO = tagDAO;
    }
}
