package com.example.demo.app.Repository;

import com.example.demo.app.Model.DAO.UserTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTagDAORepository extends JpaRepository<UserTagDAO, Long> {
}
