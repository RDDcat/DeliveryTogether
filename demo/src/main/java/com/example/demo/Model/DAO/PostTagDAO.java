package com.example.demo.Model.DAO;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "posttag")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class PostTagDAO {

    @Id
    @GeneratedValue
    private Long postTagId;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private PostDAO postDAO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private TagDAO tagDAO;

    @Builder
    public PostTagDAO(String name, PostDAO postDAO, TagDAO tagDAO) {
        this.name = name;
        this.postDAO = postDAO;
        this.tagDAO = tagDAO;
    }
}
