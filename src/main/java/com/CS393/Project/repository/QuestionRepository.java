package com.CS393.Project.repository;

import com.CS393.Project.Dto.QuestionDTO;
import com.CS393.Project.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;


public interface QuestionRepository extends JpaRepository<Question, Integer>{

    public Question findById(int questionId);
    public Question getByDescription(String description);
    public Question findByTitle(String title);


}
