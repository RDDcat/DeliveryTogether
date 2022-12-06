package com.example.demo.Repository;

import com.example.demo.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface UserDAORepository extends JpaRepository<UserDAO, Long> {
    @Override
    Optional<UserDAO> findById(Long aLong);

    @Override
    List<UserDAO> findAllById(Iterable<Long> longs);

    Optional<UserDAO> findByEmail(String email);

    Optional<UserDAO> findByName(String nickname);
}
