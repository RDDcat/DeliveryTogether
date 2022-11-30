package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDAORepository extends JpaRepository<UserDAO, Long> {
    @Override
    Optional<UserDAO> findById(Long aLong);

    Optional<UserDAO> findByEmail(String email);

    UserDAO findByName(String nickname);

}
