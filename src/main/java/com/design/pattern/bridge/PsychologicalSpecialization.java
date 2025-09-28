package com.design.pattern.bridge;

import java.util.List;

public class PsychologicalSpecialization implements Specialization {
    private static final String SPECIALIZATION_NAME = "Psychological";

    @Override
    public String getName() {
        return SPECIALIZATION_NAME;
    }

    @Override
    public List<String> getSubjects() {
        return List.of("Start with dying hair", "Search problem in men", "Why women better on the kitchen", "Why women are not better in politics");
    }
}
