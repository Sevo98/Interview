package com.example.demo.business.services.Impl;

import com.example.demo.business.domain.Interview;
import com.example.demo.business.repositories.InterviewRepository;
import com.example.demo.business.services.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewRepository repository;

    @Override
    public List<Interview> findAllInterview() {
        return (List<Interview>) repository.findAll();
    }

    @Override
    public Interview findById(UUID id) {
        Optional<Interview> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public Interview insert(Interview interview) {
        return repository.save(interview);
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
    public boolean update(Interview interview) {
        try {
            repository.save(interview);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}