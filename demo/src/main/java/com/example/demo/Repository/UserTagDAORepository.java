package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserTagDAORepository extends JpaRepository<UserTagDAO, Long> {

    @Override
    Optional<UserTagDAO> findById(Long id);

    @Override
    void deleteById(Long aLong);
}
