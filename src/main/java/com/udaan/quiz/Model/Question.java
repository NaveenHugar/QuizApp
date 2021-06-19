package com.udaan.quiz.Model;

import com.udaan.quiz.Exception.DuplicateQuestionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class Question {

  @Getter private Integer questionId;

  @Getter private String questionStatement;

  @Getter private List<Answer> possibleAnswers;

  public Question(Integer questinId, String questionStatement){
    this.questionId = questinId;
    this.questionStatement = questionStatement;
    this.possibleAnswers = new ArrayList<>();
  }

  public void addPossibleAnswer(String possibleAnswer) {
    this.possibleAnswers.add(new Answer(possibleAnswer));
  }

}
