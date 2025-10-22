package com.design.pattern.mediator;

import java.util.List;

public class Dashboard {

    private final List<String> bestStudents = List.of("Vova", "Vadim", "Nikita Neyk", "David Gigachad");
    private final List<String> favouriteTeachers = List.of("Yurii Nikitin", "Diachuk Rostislav ", "Val Oleksandr", "Komisar", "Diakonenko Bohdan");

    public void notifyEnrolledUsers(final Activity activity) {
        notifyStudents(activity);
        notifyTeachers(activity);
    }

    public void notifyStudents(final Activity activity) {
        final String msg = formMessage(activity);
        bestStudents.forEach(student -> {
            System.out.printf("Alert for student " + student + " " + msg);
        });
    }

    public void notifyTeachers(final Activity activity) {
        final String msg = formMessage(activity);
        favouriteTeachers.forEach(teacher -> {
            System.out.printf("Alert for teacher " + teacher + " " + msg);
        });
    }

    private String formMessage(final Activity activity) {
        return "Notification! You have scheduled Activity: %s, it was assigned to be accomplished from %s to %s"
                .formatted(activity.getName(), activity.getActivityStartTime(), activity.getActivityEndTime());
    }

}
