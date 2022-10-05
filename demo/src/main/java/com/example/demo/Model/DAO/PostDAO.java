package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.PostDTO;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class PostDAO {
    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long postId;
    private String title;
    private String describe;
    private String storeUrl;

    private String chatUrl;

    // 이거 타임스탬프 찍어야함
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private String limitMinute;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDAO userDAO;

    @OneToMany(mappedBy = "postDAO")
    List<PostTagDAO> postTagDAOS = new ArrayList<>();


    public MetaPostDTO toMetaPostDTO(){
        MetaPostDTO metaPostDTO = new MetaPostDTO();

        metaPostDTO.setPostId(postId);
        metaPostDTO.setTitle(title);
        metaPostDTO.setLimitMinute(limitMinute);
        metaPostDTO.setDescribe(describe);
        return metaPostDTO;
    }

    public PostDTO toPostDTO(){
        PostDTO postDTO = new PostDTO();

        postDTO.setPostId(postId);
        postDTO.setTitle(title);
        postDTO.setLimitMinute(limitMinute);
        postDTO.setStoreUrl(storeUrl);
        postDTO.setDescribe(describe);
        postDTO.setCurrentAt(createdAt);
        return postDTO;
    }

}
