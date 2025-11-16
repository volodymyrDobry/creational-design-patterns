package com.design.pattern.chain;

import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;
import com.design.pattern.singletone.StudentsRepository;

public class AuthHandler extends Handler{

    @Override
    public void handle(Student student, Subject subject,  int points){
        if (!StudentsRepository.getStudents().contains(student)) {
            System.out.println("unauthorized");
            return;
        }
        System.out.println("success authorization");
        toNext(student, subject, points);
    }
}
