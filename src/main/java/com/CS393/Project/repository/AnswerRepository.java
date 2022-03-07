package com.CS393.Project.repository;


import com.CS393.Project.Dto.AnswerDto;
import com.CS393.Project.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer>{

    public Answer findByText(String text);
    public Answer getById(int id);

    @Modifying
    @Query("update Answer a set a.text=?1 where a.id=?2")
    public void updateAnswerById(String text,int answerId);


}
