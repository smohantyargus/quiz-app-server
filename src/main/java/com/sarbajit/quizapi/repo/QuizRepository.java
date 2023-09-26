package com.sarbajit.quizapi.repo;

import java.util.List;

import com.sarbajit.quizapi.model.exams.Category;
import com.sarbajit.quizapi.model.exams.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

    public List<Quiz> findByCategory(Category cat);

    public List<Quiz> findByActive(Boolean b);

    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
