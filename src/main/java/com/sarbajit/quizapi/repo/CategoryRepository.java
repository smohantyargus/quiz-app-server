package com.sarbajit.quizapi.repo;

import com.sarbajit.quizapi.model.exams.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
