package com.design.pattern.mediator;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public abstract class Activity {
    protected final Dashboard dashboard;
    protected final LocalDateTime activityStartTime;
    protected final LocalDateTime activityEndTime;
    private final String name;

    public abstract void notifyUsers();
}
