package com.CS393.Project.service;



import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.Dto.CommentDto;
import com.CS393.Project.Dto.QuestionDTO;
import com.CS393.Project.model.Answer;
import com.CS393.Project.model.Comment;
import com.CS393.Project.model.Question;
import com.CS393.Project.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;


    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }
    public long commentCount(){
        return commentRepository.count();
    }
    public void deleteById(int id){
        commentRepository.deleteById(id);
    }
    public Comment getById(int id){
        return commentRepository.getById(id);
    }
    public List<Comment> findAll(){
        return commentRepository.findAll();
    }

    public List<CommentDto> getAll(){
        List<Comment> comments =  commentRepository.findAll();
        List<CommentDto> commentDtos = new ArrayList<>();
        for (Comment comment : comments) {
            CommentDto commentDTO = new CommentDto();
            commentDTO.setId(comment.getId());
            commentDTO.setText(comment.getText());
            commentDTO.setUserName(comment.getUser().getName());
            commentDtos.add(commentDTO);
        }
        return commentDtos;
    }

    public void updateComment(String text,int commentId){
        commentRepository.updateCommentById(text, commentId);
    }


}
