package com.example.demo.business.repositories;

import com.example.demo.business.domain.Interview;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface InterviewRepository extends CrudRepository <Interview, UUID>{
}
