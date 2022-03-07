package com.CS393.Project.controller;


import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.Dto.CommentDto;
import com.CS393.Project.model.Answer;
import com.CS393.Project.model.Comment;
import com.CS393.Project.service.AnswerService;
import com.CS393.Project.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService service;

    @GetMapping(value = "/get")
    public List<CommentDto> getComment(){
        return service.getAll();
    }

    // "method" is undefined in the command method = RequestMethod.POST for some reason so I didnt add it
    @PostMapping(value = "/new")
    public Comment addComment(@RequestBody Comment comment){
        return service.save(comment);
    }

    @DeleteMapping("/{comment-id}")
    public void deleteById(@PathVariable("comment-id") int id){
        service.deleteById(id);
    }

    @GetMapping("/{comment-id}")
    public Comment getCommentById(@PathVariable("comment-id") int id){
        return service.getById(id);
    }

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return service.save(comment);
    }

    @RequestMapping(value = "/comments/edit/{comment-id}", method = RequestMethod.POST)
    public void updateComment(@PathVariable("comment-id") int id,@RequestBody CommentDto commentDto){
        service.updateComment(commentDto.getText(),id);
    }

}
