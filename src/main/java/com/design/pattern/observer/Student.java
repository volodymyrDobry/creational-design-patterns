package com.design.pattern.observer;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Student implements DashboardSubscriber {
    private final String name;
    private final String speciality;
    private List<String> lessons = new ArrayList<>();

    @Override
    public void updateSchedule(final String name) {
        lessons.add(name);
    }
}
