package com.design.pattern.chain;

import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;

public class BannedStudentHandler extends Handler {

    @Override
    public void handle(Student student, Subject subject, int points) {
        if (student.getLastName().equals("Dobrianskyi") || student.getLastName().equals("Zaloha")) {
            System.out.println("This student should be kicked of from university");
            return;
        }
        System.out.println("This is good student");
        toNext(student, subject, points);
    }
}
