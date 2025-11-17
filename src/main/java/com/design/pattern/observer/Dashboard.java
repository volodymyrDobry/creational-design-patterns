package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dashboard implements DashboardPublisher {
    private final List<DashboardSubscriber> subscribers = new ArrayList<>();
    private final Set<String> lessons = new HashSet<>();


    @Override
    public void subscribe(final DashboardSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void notifySubscribers(final String lesson) {
        subscribers.parallelStream().forEach(s -> {
            s.updateSchedule(lesson);
        });
    }

    public void addLesson(final String lesson) {
        lessons.add(lesson);
        notifySubscribers(lesson);
    }


}
