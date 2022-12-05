package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTagDAORepository extends JpaRepository<UserTagDAO, Long> {
}
