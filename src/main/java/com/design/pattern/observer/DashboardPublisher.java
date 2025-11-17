package com.design.pattern.observer;

public interface DashboardPublisher {
    void subscribe(DashboardSubscriber subscriber);

    void notifySubscribers(String lesson);
}
