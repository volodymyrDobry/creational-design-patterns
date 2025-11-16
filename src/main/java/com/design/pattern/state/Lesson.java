package com.design.pattern.state;

import com.design.pattern.model.Subject;
import lombok.Getter;


public class Lesson {
    private LessonState lessonState;

    @Getter
    private final Subject subject;

    public Lesson(Subject subject) {
        this.lessonState = new PlannedLessonState();
        this.subject = subject;
    }

    public void setState(LessonState state) {
        this.lessonState = state;
    }

    public void nextState() {
        lessonState.handle(this);
    }
}
