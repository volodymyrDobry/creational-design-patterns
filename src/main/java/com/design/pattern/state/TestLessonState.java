package com.design.pattern.state;

public class TestLessonState implements LessonState{
    @Override
    public void handle(Lesson context) {
        System.out.println("Test during lesson - " + context.getSubject().getClass().getName());
        context.setState(new CompletedLessonState());
    }
}
