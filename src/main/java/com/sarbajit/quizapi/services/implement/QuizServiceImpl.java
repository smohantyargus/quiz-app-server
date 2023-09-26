package com.sarbajit.quizapi.services.implement;

import com.sarbajit.quizapi.model.exams.Category;
import com.sarbajit.quizapi.model.exams.Quiz;
import com.sarbajit.quizapi.repo.QuizRepository;
import com.sarbajit.quizapi.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Set<Quiz> getQuizzes() {
        return new LinkedHashSet<>(this.quizRepository.findAll());
    }

    @Override
    public Quiz getQuiz(Long quizId) {
        return this.quizRepository.findById(quizId).get();
    }

    @Override
    public void deleteQuiz(Long quizId) {
        this.quizRepository.deleteById(quizId);
    }

    @Override
    public java.util.List<Quiz> getQuizzesOfCategory(Category cat) {
        return this.quizRepository.findByCategory(cat);
    }

    @Override
    public List<Quiz> getActiveQuizzes() {
        return quizRepository.findByActive(true);
    }

    @Override
    public List<Quiz> getActiveQuizzesOfCategory(Category c) {
        return quizRepository.findByCategoryAndActive(c, true);
    }
}
