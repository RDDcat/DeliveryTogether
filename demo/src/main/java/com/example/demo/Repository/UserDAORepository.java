package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDAORepository extends JpaRepository<UserDAO, Long> {
    @Override
    Optional<UserDAO> findById(Long aLong);
}
