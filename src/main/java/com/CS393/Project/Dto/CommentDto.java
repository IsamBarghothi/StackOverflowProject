package com.CS393.Project.Dto;

public class CommentDto {
    private int id;
    private String text;
    private String userName;


    public CommentDto() {

    }

    public CommentDto(int id, String text, String userName) {
        this.id = id;
        this.text = text;
        this.userName = userName;
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
