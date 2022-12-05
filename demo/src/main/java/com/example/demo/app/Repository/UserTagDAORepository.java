package com.example.demo.app.Repository;

import com.example.demo.app.Model.DAO.UserTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTagDAORepository extends JpaRepository<UserTagDAO, Long> {

    Optional<UserTagDAO> findByUserDAO(UserTagDAO userTagDAO);

}
