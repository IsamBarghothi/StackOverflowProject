package com.CS393.Project.Dto;



public class QuestionDTO {

    private int id;

    public QuestionDTO(int id,String title,String description){
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public QuestionDTO() {

    }

    private String title;
    private String description;


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
}


