package com.design.pattern.mediator;

import java.time.LocalDateTime;

public class Main {
    public static void main(final String[] args) {
        final Dashboard dashboard = new Dashboard();

        final Activity activity1 = new Lesson(dashboard, LocalDateTime.parse("2025-12-03T10:15:30"), LocalDateTime.parse("2025-12-03T10:25:30"), "APPZ");
        final Activity activity2 = new Meet(dashboard, LocalDateTime.parse("2025-12-03T10:15:30"), LocalDateTime.parse("2025-12-03T10:25:30"), "APPZ");
        final Activity activity3 = new Test(dashboard, LocalDateTime.parse("2025-12-03T10:15:30"), LocalDateTime.parse("2025-12-03T10:25:30"), "APPZ");

        activity1.notifyUsers();
//        activity2.notifyUsers();
//        activity3.notifyUsers();
    }
}
