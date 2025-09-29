package com.design.pattern.flyweight;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Subject math = SubjectFactory.getSubject("math", 100);
        final Subject physics = SubjectFactory.getSubject("physics", 200);
        final Subject forgotAboutMathSubject = SubjectFactory.getSubject("math", 100);
        final List<Subject> subjects = List.of(math, physics, forgotAboutMathSubject);

        for (final Subject subject : subjects) {
            System.out.println(subject.toString());
        }
    }
}
