package com.example.demo.Model.DAO;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tag")
@Getter
@NoArgsConstructor
@ToString
public class TagDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagId;

    private String name;

    @Builder
    public TagDAO(String name) {
        this.name = name;
    }
}
