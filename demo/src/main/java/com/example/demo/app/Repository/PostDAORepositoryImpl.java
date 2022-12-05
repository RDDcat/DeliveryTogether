package com.example.demo.app.Repository;

import com.example.demo.app.Model.DTO.PostTagSearchDTO;
import com.example.demo.Model.DTO.QPostTagSearchDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static com.example.demo.Model.DAO.QPostDAO.postDAO;
import static com.example.demo.Model.DAO.QPostTagDAO.postTagDAO;

@RequiredArgsConstructor
public class PostDAORepositoryImpl implements PostDAORepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public Page<PostTagSearchDTO> searchPost(String tagname, Pageable pageable) {
    List<PostTagSearchDTO> results = queryFactory
                .select(new QPostTagSearchDTO(
                        postDAO.title,
                        postDAO.count)
                )
                .from(postDAO)
                .join(postDAO.postTagDAOS, postTagDAO)
                .where(postTagDAO.name.eq(tagname))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
        ;

        return new PageImpl<>(results, pageable, results.size());
    }
}
