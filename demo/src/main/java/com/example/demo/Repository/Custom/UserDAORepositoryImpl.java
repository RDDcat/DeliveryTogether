package com.example.demo.Repository.Custom;

import com.example.demo.Model.DAO.QUserTagDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import com.example.demo.Model.DTO.QUserTagDTO;
import com.example.demo.Model.DTO.UserTagDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.demo.Model.DAO.QUserTagDAO.userTagDAO;

@RequiredArgsConstructor
public class UserDAORepositoryImpl implements UserDAORepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<UserTagDTO> findAllUserTags(Long userId) {
        List<UserTagDTO> results = queryFactory
                .select(new QUserTagDTO(
                        userTagDAO.userTagId,
                        userTagDAO.name
                ))
                .from(userTagDAO)
                .where(userTagDAO.userDAO.userId.eq(userId))
                .fetch();

        return results;
    }
}
