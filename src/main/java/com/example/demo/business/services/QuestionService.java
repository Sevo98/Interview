package com.example.demo.business.services;

import com.example.demo.business.domain.Question;

import java.util.List;
import java.util.UUID;

public interface QuestionService {
    List<Question> findAllQuestions();

    Question findById(UUID id);

    Question insert(Question question);

    boolean delete(UUID id);

    boolean update(Question question);
}
