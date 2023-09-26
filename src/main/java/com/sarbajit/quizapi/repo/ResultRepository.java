package com.sarbajit.quizapi.repo;

import java.util.List;

import com.sarbajit.quizapi.model.User;
import com.sarbajit.quizapi.model.exams.Quiz;
import com.sarbajit.quizapi.model.exams.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Integer> {

    List<Result> findByQuiz(Quiz quiz);

    List<Result> findByUser(User user);

    List<Result> findByQuizAndUser(Quiz quiz, User user);

}
