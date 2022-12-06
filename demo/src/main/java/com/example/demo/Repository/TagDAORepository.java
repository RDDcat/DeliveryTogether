package com.example.demo.Repository;

import com.example.demo.Model.DAO.TagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDAORepository extends JpaRepository<TagDAO, Long> {
}
