package com.example.demo.Repository;

import com.example.demo.Model.DAO.TagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagDAORepository extends JpaRepository<TagDAO, Long> {
    Optional<TagDAO> findByName(String name);
}
