package com.sarbajit.quizapi.repo;

import com.sarbajit.quizapi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleRepository extends JpaRepository<Role,Long> {

}
