package com.udaan.quiz.Model;

import java.util.ArrayList;
import java.util.List;

public class QuizSet {

  private Integer quizSetId;

  private List<Question> quizQuestions;

  public QuizSet(Integer quizSetId) {
    this.quizSetId = quizSetId;
    this.quizQuestions = new ArrayList<>();
  }

  public void addQuestion(Question question) {
    this.quizQuestions.add(question);
  }

  public List<Question> getAllQuestion() {
    return this.quizQuestions;
  }

}
