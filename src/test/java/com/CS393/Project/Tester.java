package com.CS393.Project;

import com.CS393.Project.model.*;
import com.CS393.Project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Tester {

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @Autowired
    UserService userService;

    @Autowired
    CommentService commentService;

    @Autowired
    TagsService tagsService;

    @org.junit.jupiter.api.Test
    void questionCreate(){

        Question question1 = new Question();
        question1.setTitle("Connection Issue question");
        question1.setDescription("I'm struggling with getting the connection for the DB.....");
        questionService.save(question1);

        User user1 = new User(); //The one who asked
        user1.setName("Mohammed Ali");
        userService.save(user1);

        User user2 = new User();//the one who answered answer1
        user2.setName("Mike Tyson");
        userService.save(user2);

        User user3 = new User();//the one who answered answer2
        user3.setName("Floyd Mayweather");

        Answer answer1 = new Answer();
        answer1.setText("You should add user and password to your connection props.....");
        answerService.save(answer1);

        user2.getAnswer().add(answer1);


        Answer answer2 = new Answer();
        answer2.setText("Fix the port, find your localhost address and put it");
        answer2.setUser(user3);
        answerService.save(answer2);
        user3.getAnswer().add(answer2);//adding answer2 to user

        //adding answers to question 1
        question1.getAnswers().add(answer1);
        question1.getAnswers().add(answer2);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);

        Tags tag1 = new Tags();
        tag1.setTitle("Back-end");
        Tags tag2 = new Tags();
        tag2.setTitle("Configuration issues");

        question1.getTags().add(tag1);
        question1.getTags().add(tag2);
        tag1.getQuestions().add(question1);
        tagsService.save(tag1);
        tagsService.save(tag2);

        Comment comment1 = new Comment();
        comment1.setUser(user2);
        comment1.setText("This answer worked for me, thanks.");
        //adding a comment to a question
        comment1.setQuestion(question1);
        commentService.save(comment1);


        questionService.save(question1);
        answerService.save(answer1);
        answerService.save(answer2);

        //getting all the questions
        questionService.getAll();

        //getting info about a specific question
        questionService.findById(question1.getId());


        answer1.setText("DummyText for answer1 after update");
        comment1.setText("DummyComment after update");

        //updating an answer
        answerService.updateAnswer(answer1.getText(),answer1.getId());

        //updating a comment
        commentService.updateComment(comment1.getText(),comment1.getId());

        //voting for a comment
        comment1.decreaseVotes();
        comment1.getVotes();

        //deleting a specific comment
        commentService.deleteById(comment1.getId());

        //voting for a question
        question1.increaseVotes();
        question1.getVotes();

        //voting for an answer
        answer2.decreaseVotes();
        answer2.getVotes();

    }
}
