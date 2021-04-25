package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.JsonPath;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Тестовое задание "REST-сервис для управления опросами" для компании Лидер-IT
 *
 * @author Sevostyanov Kirill
 */
@SpringBootApplication
@EnableScheduling
@EnableWebMvc
@EnableJpaRepositories
@EnableJpaAuditing
@Configuration
public class InterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

}
