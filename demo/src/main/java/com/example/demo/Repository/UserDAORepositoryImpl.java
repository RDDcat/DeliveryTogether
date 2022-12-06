package com.example.demo.Repository;

import com.example.demo.Model.DAO.QUserDAO;
import com.example.demo.Model.DAO.QUserTagDAO;
import com.example.demo.Model.DTO.PostTagSearchDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static com.example.demo.Model.DAO.QUserDAO.userDAO;
import static com.example.demo.Model.DAO.QUserTagDAO.userTagDAO;

@RequiredArgsConstructor
public class UserDAORepositoryImpl implements UserDAORepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<String> searchUserTags(Long userId) {
        List<String> results = queryFactory
                .select(userTagDAO.name)
                .from(userTagDAO)
                .where(userTagDAO.userDAO.userId.eq(userId))
                .fetch();

        return results;
    }
}
