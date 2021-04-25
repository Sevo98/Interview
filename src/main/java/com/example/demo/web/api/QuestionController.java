package com.example.demo.web.api;

import com.example.demo.business.domain.Question;
import com.example.demo.business.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("")
    public List<Question> getAddQuestion() {
        return questionService.findAllQuestions();
    }
    //TODO: Get с фильтром по UUID и активности опроса

    @GetMapping("{id}")
    public Question getQuestion(@PathVariable UUID id){
        return questionService.findById(id);
    }

    @PostMapping("")
    public String addQuestion(@RequestBody Question question){
        if (question != null){
            if (question.getText() == null) {
                return "Need text";
            }
            questionService.insert(question);
            return "Added a question";
        } else return "Request does not contain a body";
    }

    @DeleteMapping("{id}")
    public String deleteQuestion(@PathVariable("id") UUID id){
        if (id != null) {
            if (questionService.delete(id)) {
                return "Deleted the question";
            } else return "Cannot delete the question";
        }
        return "The id is invalid for the question";
    }

    @PutMapping("")
    public String updateQuestion(@RequestBody Question question){
        if (question != null) {
            questionService.update(question);
            return "Updated question";
        } else return "Request does not contain a body";
    }
}
