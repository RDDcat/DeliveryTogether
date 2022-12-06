package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostDAORepository extends JpaRepository<PostDAO, Long>, PostDAORepositoryCustom {
    @Override
    Optional<PostDAO> findById(Long aLong);

    List<PostDAO> findAllByPostTagDAOS(String tagName);

    @Override
    List<PostDAO> findAll();
}
