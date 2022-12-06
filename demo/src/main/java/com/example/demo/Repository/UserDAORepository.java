package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import com.example.demo.Repository.Custom.UserDAORepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserDAORepository extends JpaRepository<UserDAO, Long>, UserDAORepositoryCustom {
    @Override
    Optional<UserDAO> findById(Long aLong);

    Optional<UserDAO> findByEmail(String email);

    Optional<UserDAO> findByName(String nickname);

    Optional<UserDAO> findByToken(String token);

    Optional<UserDAO> findByRefreshToken(String token);
}
