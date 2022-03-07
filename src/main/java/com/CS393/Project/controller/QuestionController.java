package com.CS393.Project.controller;


import com.CS393.Project.Dto.QuestionDTO;
import com.CS393.Project.model.Question;
import com.CS393.Project.service.QuestionService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService service;

    @GetMapping("/get")
    public List<QuestionDTO> getQuestions(){
        return service.getAll();
    }

    @PostMapping("/new")
    public Question addQuestion(@RequestBody Question question){
        return service.save(question);
    }

    @DeleteMapping("/{question-id}")
    public void deleteById(@PathVariable("question-id") int id){
        service.deleteById(id);
    }

   @GetMapping("/{question-id}")
    public Question getQuestionById(@PathVariable("question-id") int id){
        return service.findById(id);
   }

   @PostMapping
    public Question saveQuestion(@RequestBody Question question){
        return service.save(question);
   }

}
