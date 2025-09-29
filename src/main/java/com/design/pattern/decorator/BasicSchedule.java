package com.design.pattern.decorator;

import com.design.pattern.model.Subject;
import lombok.AllArgsConstructor;

public class BasicSchedule implements Schedule {
    private Subject subject;

    public BasicSchedule(Subject subject){
        this.subject = subject;
    }

    @Override
    public void show() {
        System.out.println("Subject - " + subject.toString());
    }
}
