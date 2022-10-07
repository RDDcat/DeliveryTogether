package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAORepository extends JpaRepository<UserDAO, Long> {
}
