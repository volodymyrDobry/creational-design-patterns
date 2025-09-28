package com.design.pattern.decorator;

public class TeacherScheduleDecorator extends ScheduleDecorator {
    private String teacherName;

    public TeacherScheduleDecorator(Schedule schedule, String teacherName){
        super(schedule);
        this.teacherName = teacherName;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Teacher - " + teacherName);
    }
}
