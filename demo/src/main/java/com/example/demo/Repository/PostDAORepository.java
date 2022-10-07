package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAORepository extends JpaRepository<PostDAO, Long> {
}
