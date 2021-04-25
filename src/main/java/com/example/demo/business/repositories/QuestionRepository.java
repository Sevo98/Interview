package com.example.demo.business.repositories;

import com.example.demo.business.domain.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionRepository extends CrudRepository <Question, UUID> {
}
