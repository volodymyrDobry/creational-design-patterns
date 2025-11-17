package com.design.pattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Teacher implements DashboardSubscriber {
    private final String name;
    private List<String> lessons = new ArrayList<>();


    @Override
    public void updateSchedule(final String name) {
        lessons.add(name);
    }
}
