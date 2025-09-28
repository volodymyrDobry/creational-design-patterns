package com.design.pattern.decorator;

public class ScheduleDecorator implements Schedule {
    private Schedule schedule;

    public ScheduleDecorator(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public void show() {
        schedule.show();
    }
}
