package com.example.demo.Model.DAO;

import com.example.demo.Model.DTO.MetaPostDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PostDAO {
    @Id
    private Long postId;
    String title;
    String limitMinute;
    String ownerName;
    String storeUrl;
    String describe;
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

}
