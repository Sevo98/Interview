package com.example.demo.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Set;
import java.util.UUID;

/**
 * Класс вопроса
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @Column(name = "interviews")
    private Set<UUID> interviews;

    @NotNull
    @Column(name = "text")
    private String text;
    //TODO: порядок
}
