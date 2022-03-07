package com.CS393.Project.service;


import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.Dto.QuestionDTO;
import com.CS393.Project.model.Answer;
import com.CS393.Project.model.Question;
import com.CS393.Project.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public Question save(Question question){
        return questionRepository.save(question);
    }

    public long questionCount(){
        return questionRepository.count();
    }

    public void deleteById(int id){
        questionRepository.deleteById(id);
    }

    public Question findByTitle(String title){
        return questionRepository.findByTitle(title);
    }

    public Question findById(int id){
        return questionRepository.findById(id);
    }


    public List<QuestionDTO> getAll(){
        List<Question> questions =  questionRepository.findAll();
        List<QuestionDTO> questionDTOS = new ArrayList<>();
        for (Question question : questions) {
            QuestionDTO questionDTO = new QuestionDTO();
            questionDTO.setId(question.getId());
            questionDTO.setTitle(question.getTitle());

            questionDTOS.add(questionDTO);
        }
        return questionDTOS;
    }
}
