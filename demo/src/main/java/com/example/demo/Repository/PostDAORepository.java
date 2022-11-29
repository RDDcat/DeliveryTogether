package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostDAO;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Optional;
import java.util.function.Function;

public interface PostDAORepository extends JpaRepository<PostDAO, Long> {
    @Override
    Optional<PostDAO> findById(Long aLong);
}
