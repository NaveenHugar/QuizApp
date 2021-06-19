package com.udaan.quiz.Service;

import com.udaan.quiz.Exception.DuplicateQuizSetException;
import com.udaan.quiz.Model.QuizSet;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class QuizSetServiceImpl implements QuizSetService {

  private Map<Integer, QuizSet> quizSetMap = new HashMap<>();

  @Override
  public Integer addQuizSet(Integer quizSetId, QuizSet quizSet) throws DuplicateQuizSetException {
    if(this.quizSetMap.get(quizSetId) != null) {
      quizSetMap.put(quizSetId, quizSet);
    } else {
      throw new DuplicateQuizSetException();
    }
    return quizSetId;
  }

}
