package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Model.DAO.UserTagDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserTagDAORepository extends JpaRepository<UserTagDAO, Long> {

}
