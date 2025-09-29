package com.design.pattern.decorator;

public class RoomScheduleDecorator extends ScheduleDecorator {
    private Integer roomNumber;

    public RoomScheduleDecorator(Schedule schedule, Integer roomNumber) {
        super(schedule);
        this.roomNumber = roomNumber;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Room number - " + roomNumber);
    }
}
