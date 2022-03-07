package com.CS393.Project.Dto;

import com.CS393.Project.model.User;

public class AnswerDto {
    private int id;

    public AnswerDto(int id, String text){
        super();
        this.id = id;
        this.text = text;
    }
    private String text;
    private String userName;

    public AnswerDto() {

    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
