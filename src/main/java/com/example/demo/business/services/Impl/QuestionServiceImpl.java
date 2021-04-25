package com.example.demo.business.services.Impl;

import com.example.demo.business.domain.Question;
import com.example.demo.business.repositories.QuestionRepository;
import com.example.demo.business.services.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository repository;

    @Override
    public List<Question> findAllQuestions() {
        return (List<Question>) repository.findAll();
    }

    @Override
    public Question findById(UUID id) {
        Optional<Question> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else return null;
    }

    @Override
    public Question insert(Question question) {
        return repository.save(question);
    }

    @Override
    public boolean delete(UUID id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Question question) {
        try {
            repository.save(question);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
