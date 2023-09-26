package com.sarbajit.quizapi.repo;

import com.sarbajit.quizapi.model.exams.Question;
import com.sarbajit.quizapi.model.exams.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
