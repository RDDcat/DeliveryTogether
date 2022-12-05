package com.example.demo.app.Repository;

import com.example.demo.app.Model.DAO.TagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDAORepository extends JpaRepository<TagDAO, Long> {
}
