package com.design.pattern.bridge;

import java.util.List;

public class SoftwareEngineeringSpecialization implements Specialization {
    private static final String SPECIALIZATION_NAME = "Software Engineering";

    @Override
    public String getName() {
        return SPECIALIZATION_NAME;
    }

    @Override
    public List<String> getSubjects() {
        return List.of("Start with Java", "Continue Java", "More Java", "Java in square");
    }
}
