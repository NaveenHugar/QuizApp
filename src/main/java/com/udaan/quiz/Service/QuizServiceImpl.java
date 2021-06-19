package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuizSetException;
import com.udaan.quiz.Model.Question;
import com.udaan.quiz.Model.Quiz;
import com.udaan.quiz.Model.QuizSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {

  @Autowired
  private QuestionService questionService;

  @Autowired
  private QuizSetService quizSetService;

  @Override
  public Map<Integer, Question> getQuiz() {
    return questionService.getAllQuestions();
  }

  @Override
  public void createQuizSet(Integer quizSetId, QuizSet quizSet) throws DuplicateQuizSetException {
    quizSetService.addQuizSet(quizSetId, quizSet);
  }


}
