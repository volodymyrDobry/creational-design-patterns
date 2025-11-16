package com.design.pattern.state;

import com.design.pattern.model.MathSubject;

public class Main {

    public static void main(String[] args) {
        Lesson lesson = new Lesson(new MathSubject("Math", 10));

        lesson.nextState();
        lesson.nextState();
        lesson.nextState();
        lesson.nextState();
    }
}
