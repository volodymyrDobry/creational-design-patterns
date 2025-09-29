package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SubjectFactory {
    private static final Map<String, Subject> subjects = new HashMap<>();

    public static Subject getSubject(final String name, final long hour) {
        final Subject subject = subjects.getOrDefault(name, new Subject(name, hour));
        subject.setHoursTake(hour);
        subjects.put(name, subject);
        return subject;
    }
}
