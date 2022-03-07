package com.CS393.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String description;

    @Column(nullable = true)
    private int votes;

    private Date askedDate;


    @OneToMany(mappedBy = "question")
    private List<Answer> answers = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    @ManyToMany(mappedBy= "questions")
    private List<Tags> tags = new ArrayList<>();

//    @ManyToOne
//    @JsonIgnore
//    private User user; //askedBY

    @OneToMany
    @JoinColumn
    private List<Answer> answer = new ArrayList<>();

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Date getAskedDate() {
        return askedDate;
    }

    public void setAskedDate(Date askedDate) {
        this.askedDate = askedDate;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }


    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    public void increaseVotes(){
        votes++;
    }
    public void decreaseVotes(){
        votes--;
    }

}
