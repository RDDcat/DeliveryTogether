package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.MetaPostDTO;
import com.example.demo.Model.DTO.PostDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDAO {
    @Id
    private Long postId;
    String title;
    String limitMinute;
    String ownerName;
    String storeUrl;
    String describe;
    // 이거 타임스탬프 찍어야함
    String currentDate;


    public MetaPostDTO toMetaPostDTO(){
        MetaPostDTO metaPostDTO = new MetaPostDTO();

        metaPostDTO.setPostId(postId);
        metaPostDTO.setTitle(title);
        metaPostDTO.setLimitMinute(limitMinute);
        metaPostDTO.setOwnerName(ownerName);
        metaPostDTO.setDescribe(describe);
        return metaPostDTO;
    }

    public PostDTO toPostDTO(){
        PostDTO postDTO = new PostDTO();

        postDTO.setPostId(postId);
        postDTO.setTitle(title);
        postDTO.setLimitMinute(limitMinute);
        postDTO.setOwnerName(ownerName);
        postDTO.setStoreUrl(storeUrl);
        postDTO.setDescribe(describe);
        postDTO.setCurrentDate(currentDate);
        return postDTO;
    }

}
