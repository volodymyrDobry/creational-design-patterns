package com.design.pattern.bridge;

import java.util.List;

public class ComputerScienceSpecialization implements Specialization {
    private static final String SPECIALIZATION_NAME = "Computer science";

    @Override
    public String getName() {
        return SPECIALIZATION_NAME;
    }

    @Override
    public List<String> getSubjects() {
        return List.of("Math", "Python", "ML", "Stupid staff");
    }
}
