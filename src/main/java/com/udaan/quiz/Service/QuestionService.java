package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuestionException;
import com.udaan.quiz.Exception.InvalidQuestionException;
import com.udaan.quiz.Model.Question;
import java.util.List;
import java.util.Map;

public interface QuestionService {

   Integer addQuestion(Integer id, String questionStatement) throws DuplicateQuestionException;

   void addPossibleAnswer(Integer id, String possibleAnswer) throws InvalidQuestionException;

   Map<Integer, Question> getAllQuestions();

}
