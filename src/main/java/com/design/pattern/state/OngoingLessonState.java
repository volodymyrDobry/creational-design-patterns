package com.design.pattern.state;

public class OngoingLessonState implements LessonState {
    @Override
    public void handle(Lesson context) {
        System.out.println("Lesson ongoing - " + context.getSubject().getClass().getName());
        boolean approvedTest = Math.random() > 0.5;

        if (approvedTest) {
            context.setState(new TestLessonState());
        } else {
            context.setState(new CompletedLessonState());
        }
    }
}
