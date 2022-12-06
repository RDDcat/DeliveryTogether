package com.example.demo.Repository.Custom;

import java.util.List;

public interface UserDAORepositoryCustom {
    List<String> searchUserTags(Long userId);
}
