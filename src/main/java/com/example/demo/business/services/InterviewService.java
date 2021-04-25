package com.example.demo.business.services;

import com.example.demo.business.domain.Interview;

import java.util.List;
import java.util.UUID;

public interface InterviewService {
    List<Interview> findAllInterview();

    Interview findById(UUID id);

    Interview insert(Interview interview);

    boolean delete(UUID id);

    boolean update(Interview interview);
}
