package com.darkdevil.practicespringboot.proctoringapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProctoringController {
    @CrossOrigin
    @GetMapping("lectures")
    public @ResponseBody List<Lecture> getAllLectures(){
        List<Lecture> lectureList = new ArrayList<>();
        List<Question> questionList1 = new ArrayList<>();
        List<Question> questionList2 = new ArrayList<>();

        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        Question question4 = new Question();

        question1.setQuestionName("What is full form of OOP?");
        question1.setAnswer1("Object Oriented Programming");
        question1.setAnswer2("Object Programming");
        question1.setAnswer3("Object Oriented Concepts");
        question1.setCorrect(1);

        question2.setQuestionName("What is the incorrect access modifier?");
        question2.setAnswer1("private");
        question2.setAnswer2("final");
        question2.setAnswer3("protected");
        question2.setCorrect(2);

        question3.setQuestionName("What is the correct sql statement here?");
        question3.setAnswer1("select * from employees where employeeId = 1;");
        question3.setAnswer2("select from employees where employeeId = 1;");
        question3.setAnswer3("select all from employees where employeeId = 1");
        question3.setCorrect(1);

        question4.setQuestionName("What is the correct database from here?");
        question4.setAnswer1("Python");
        question4.setAnswer2("MongoDB");
        question4.setAnswer3("Kafka");
        question4.setCorrect(2);

        questionList1.add(question1);
        questionList1.add(question2);
        questionList2.add(question3);
        questionList2.add(question4);

        lecture1.setId(1);
        lecture1.setName("Object oriented programming lecture 1");
        lecture1.setTeacher("Mr. Nuwan Kodagoda");
        lecture1.setStartTime("10:00");
        lecture1.setEndTime("15:00");
        lecture1.setQuestions(questionList1);

        lecture2.setId(2);
        lecture2.setName("Database Management System lecture 1");
        lecture2.setTeacher("Mr. Prasanna");
        lecture2.setStartTime("00:00");
        lecture2.setEndTime("23:59");
        lecture2.setQuestions(questionList2);

        lectureList.add(lecture1);
        lectureList.add(lecture2);

        return lectureList;

    }
}
