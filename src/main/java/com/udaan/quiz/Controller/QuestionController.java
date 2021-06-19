package com.udaan.quiz.Controller;

import com.udaan.quiz.Exception.DuplicateQuestionException;
import com.udaan.quiz.Exception.InvalidQuestionException;
import com.udaan.quiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Questions")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  @PostMapping("/addQuestion")
  public String createQuestion(@RequestParam @Validated Integer questionId, @RequestParam @Validated String questionStatement ) throws DuplicateQuestionException {
    return "Question Created id: " + questionService.addQuestion(questionId, questionStatement);
  }

  @PostMapping("/addPossibleAnswer")
  public String createPossibleAnswer(@RequestParam @Validated Integer questionId, @RequestParam @Validated String possibleAnswer ) throws InvalidQuestionException {
    questionService.addPossibleAnswer(questionId, possibleAnswer);
    return "Added answer";
  }


}
