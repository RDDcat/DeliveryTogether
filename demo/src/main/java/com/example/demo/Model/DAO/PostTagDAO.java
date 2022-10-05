package com.example.demo.Model.DAO;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "posttag")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostTagDAO {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private PostDAO postDAO;


}
