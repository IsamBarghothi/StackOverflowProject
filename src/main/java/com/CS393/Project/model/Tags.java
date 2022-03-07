package com.CS393.Project.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tags")
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;

    @ManyToMany()
    @JoinColumn(referencedColumnName = "question_id")
    private List<Question> questions = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



}
