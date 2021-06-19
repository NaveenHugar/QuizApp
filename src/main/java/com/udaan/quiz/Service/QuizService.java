package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuizSetException;
import com.udaan.quiz.Model.Question;
import com.udaan.quiz.Model.QuizSet;
import java.util.List;
import java.util.Map;

public interface QuizService {

  Map<Integer, Question> getQuiz();

  void createQuizSet(Integer quizSetId, QuizSet quizSet) throws DuplicateQuizSetException;
}
