package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTagDAORepository extends JpaRepository<PostTagDAO,Long> {
}
