package com.CS393.Project.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "answer")

public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;

    @Column(nullable = true)
    private int votes;

    private Date answeredDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Date getAnsweredDate() {
        return answeredDate;
    }

    public void setAnsweredDate(Date answeredDate) {
        this.answeredDate = answeredDate;
    }

    public void increaseVotes(){
        votes++;
    }
    public void decreaseVotes(){
        votes--;
    }
}
