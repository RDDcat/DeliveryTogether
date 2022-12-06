package com.example.demo.Repository;

import com.example.demo.Model.DAO.PostTagDAO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostTagDAORepository extends JpaRepository<PostTagDAO,Long> {
    List<PostTagDAO> findAllByName(String name);
}
