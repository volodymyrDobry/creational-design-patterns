package com.design.pattern.decorator;

import java.util.Date;

public class DateScheduleDecorator extends ScheduleDecorator {
    private Date date;

    public DateScheduleDecorator(Schedule schedule, Date date){
        super(schedule);
        this.date = date;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Date - " + date.toString());
    }
}
