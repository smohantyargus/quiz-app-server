package com.sarbajit.quizapi.services;

import com.sarbajit.quizapi.model.exams.Question;
import com.sarbajit.quizapi.model.exams.Quiz;

import java.util.Set;

public interface QuestionService {
    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestions();
    public Question getQuestion(Long questionId);
    public  Set<Question> getQuestionOfQuiz(Quiz quiz);
    public void deleteQuestion(Long qid);

}
