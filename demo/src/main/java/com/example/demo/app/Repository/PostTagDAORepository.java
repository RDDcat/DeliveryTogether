package com.example.demo.app.Repository;

import com.example.demo.app.Model.DAO.PostDAO;
import com.example.demo.app.Model.DAO.PostTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostTagDAORepository extends JpaRepository<PostTagDAO,Long> {
    Optional<PostTagDAO> findByPostDAO(PostDAO postDAO);
}
