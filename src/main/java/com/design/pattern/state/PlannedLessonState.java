package com.design.pattern.state;

public class PlannedLessonState implements  LessonState{

    @Override
    public void handle(Lesson context) {
        System.out.println("lesson planned - " + context.getSubject().getClass().getName());
        context.setState(new OngoingLessonState());
    }
}
