package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuestionException;
import com.udaan.quiz.Exception.InvalidQuestionException;
import com.udaan.quiz.Model.Question;
import com.udaan.quiz.Service.QuestionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

  private Map<Integer, Question> questions = new HashMap<>();

  @Override
  public Integer addQuestion(Integer questionId, String questionStatement) throws  DuplicateQuestionException {
    if(this.questions.get(questionId) == null) {
      this.questions.put(questionId,new Question(questionId, questionStatement));
    } else {
      throw new DuplicateQuestionException();
    }
    return questionId;
  }

  @Override
  public void addPossibleAnswer(Integer id, String possibleAnswer) throws InvalidQuestionException {
    if (questions.get(id) != null) {
        questions.get(id).addPossibleAnswer(possibleAnswer);
    } else {
      throw new InvalidQuestionException();
    }
  }

  @Override
  public Map<Integer, Question> getAllQuestions() {
    return questions;
  }
}
