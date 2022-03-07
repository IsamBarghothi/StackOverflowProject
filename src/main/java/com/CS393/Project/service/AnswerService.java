package com.CS393.Project.service;

import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.model.Answer;
import com.CS393.Project.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer save(Answer answer){
        return answerRepository.save(answer);
    }

    public long answerCount(){
        return answerRepository.count();
    }

    public Answer findByText(String text){
        return answerRepository.findByText(text);
    }

    public Answer getById(int id){
        return answerRepository.getById(id);
    }

    public List<AnswerDto> getAll(){
        List<Answer> answers =  answerRepository.findAll();
        List<AnswerDto> answerDtos = new ArrayList<>();
        for (Answer answer : answers) {
            AnswerDto answerDto = new AnswerDto();
            answerDto.setId(answer.getId());
            answerDto.setText(answer.getText());
            answerDto.setUserName(answer.getUser().getName());
            answerDtos.add(answerDto);
        }
       return answerDtos;
    }

    public void updateAnswer(String text,int answerId){
        answerRepository.updateAnswerById(text, answerId);
    }

    public void deleteById(int id) {
        answerRepository.deleteById(id);
    }
}
