package com.CS393.Project.controller;


import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.Dto.CommentDto;
import com.CS393.Project.model.Answer;
import com.CS393.Project.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    @Autowired
    AnswerService service;

    @GetMapping(value = "/get")
    public List<AnswerDto> getAnswers(){
        return service.getAll();
    }

    @PostMapping(value = "/new")
    public Answer addAnswer(@RequestBody Answer answer){
        return service.save(answer);
    }

    @DeleteMapping("/{answer-id}")
    public void deleteById(@PathVariable("answer-id") int id){
        service.deleteById(id);
    }

    @GetMapping("/{answer-id}")
    public Answer getQuestionById(@PathVariable("answer-id") int id){
        return service.getById(id);
    }

    @PostMapping
    public Answer saveAnswer(@RequestBody Answer answer){
        return service.save(answer);
    }

    @RequestMapping(value = "/answers/edit/{answer-id}", method = RequestMethod.POST)
    public void updateAnswer(@PathVariable("answer-id") int id,@RequestBody AnswerDto answerDto){
        service.updateAnswer(answerDto.getText(),id);
    }

}
