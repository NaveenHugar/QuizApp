package com.udaan.quiz.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Quiz {
  private Integer quizId;
  private List<QuizSet> quizSet;


  public Quiz(Integer quizId){
    this.quizId = quizId;
    this.quizSet = new ArrayList<>();
  }

  public void addQuizSet( QuizSet quizSet) {
    this.quizSet.add(quizSet);
  }
}
