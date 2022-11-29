package com.example.demo.Model.DAO;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "posttag")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

}
