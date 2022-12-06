package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostDAO;
import com.example.demo.Repository.Custom.PostDAORepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostDAORepository extends JpaRepository<PostDAO, Long>, PostDAORepositoryCustom {
    @Override
    Optional<PostDAO> findById(Long aLong);

    @Override
    List<PostDAO> findAll();
}
