package com.CS393.Project.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "tUSER")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


    @OneToMany
    private List<Answer> questions = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Answer> answers = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(orphanRemoval = true)
    @JoinColumn
    private List<Answer> answer = new ArrayList<>();

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Answer> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
