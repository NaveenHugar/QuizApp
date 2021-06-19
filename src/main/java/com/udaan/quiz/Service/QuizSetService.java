package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuizSetException;
import com.udaan.quiz.Model.QuizSet;

public interface QuizSetService {

  Integer addQuizSet(Integer quizSetId, QuizSet quizSet) throws DuplicateQuizSetException;

}
