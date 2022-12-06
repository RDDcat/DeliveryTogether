package com.example.demo.Repository;

import java.util.List;

public interface UserDAORepositoryCustom {
    List<String> searchUserTags(Long userId);
}
