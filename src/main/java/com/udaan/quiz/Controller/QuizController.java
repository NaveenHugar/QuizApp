package com.udaan.quiz.Controller;


import com.udaan.quiz.Model.Question;
import com.udaan.quiz.Model.QuizSet;
import com.udaan.quiz.Service.QuizService;
import java.util.List;
import java.util.Map;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Quiz")
public class QuizController {

  @Autowired
  private QuizService quizService;

  @GetMapping("/getQuiz")
  public Map<Integer, Question> getQuiz() {
    return quizService.getQuiz();
  }

  @PostMapping("/createQuiz")
  public String createQuizSet(@RequestBody QuizSet quizSet) {
    return "Created Quiz set";
  }

}
