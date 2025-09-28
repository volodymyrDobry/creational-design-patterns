package com.design.pattern.decorator;

import com.design.pattern.model.MathSubject;
import com.design.pattern.model.Subject;

import java.util.Date;

public class ScheduleMain {

    public static void main(String[] args) {
        Subject math = new MathSubject("Math", 1L);
        Schedule lesson = new BasicSchedule(math);

        Schedule detailedSchedule = new RoomScheduleDecorator(
                new DateScheduleDecorator(
                        new TeacherScheduleDecorator(
                                lesson, "Tralalelo-tralala"
                        ),
                        new Date(10)
                ),
                207
        );

        detailedSchedule.show();
    }
}
