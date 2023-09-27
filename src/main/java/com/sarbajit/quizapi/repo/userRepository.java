package com.sarbajit.quizapi.repo;

import com.sarbajit.quizapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
    User findByuserName(String userName);
}
