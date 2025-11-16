package com.design.pattern.state;

public class CompletedLessonState implements LessonState {

    @Override
    public void handle(Lesson context) {
        System.out.println("Lesson over - " + context.getSubject().getClass().getName());
    }
}
