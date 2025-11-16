package com.design.pattern.chain;

import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;

abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Student student, Subject subject, int points);

    protected void toNext(Student student, Subject subject, int points) {
        if (next != null) next.handle(student, subject, points);
    }
}
