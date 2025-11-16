package com.design.pattern.chain;

import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;

import java.util.Map;

public class GradeHandler extends Handler {

    @Override
    public void handle(Student student, Subject subject, int points) {
        if (subject.calculateStudentsExamEvaluation(Map.of(student, points)).get(student) < 50) {
            System.out.println("Student is neuk");
            return;
        }
        System.out.println("Student has enough points");
        toNext(student, subject, points);
    }
}
