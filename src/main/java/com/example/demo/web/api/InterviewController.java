package com.example.demo.web.api;

import com.example.demo.business.domain.Interview;
import com.example.demo.business.services.InterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/interview")
public class InterviewController {

    InterviewService interviewService;

    @GetMapping("")
    public List<Interview> getAllInterview() {
        return interviewService.findAllInterview();
    }

    @GetMapping("{id}")
    public Interview getInterview(@PathVariable UUID id) {
        return interviewService.findById(id);
    }

    @PostMapping("")
    public String addInterview(@RequestBody Interview interview) {
        if (interview != null) {
            interviewService.insert(interview);
            return "Added a interview";
        } else return "Request does not contain a body";
    }

    @DeleteMapping("{id}")
    public String deleteInterview(@PathVariable("id") UUID id) {
        if (id != null) {
            if (interviewService.delete(id)) {
                return "Deleted the interview";
            } else return "Cannot delete the interview";
        }
        return "The id is invalid for the interview";
    }

    @PutMapping("")
    public String updateInterview(@RequestBody Interview interview) {
        if (interview != null) {
            interviewService.update(interview);
            return "Updated interview";
        } else return "Request does not contain a body";
    }
}
