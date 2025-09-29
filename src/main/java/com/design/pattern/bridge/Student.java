package com.design.pattern.bridge;

import lombok.*;

@Data
@AllArgsConstructor
public abstract class Student {
    private final String name;
    @Setter
    private Specialization specialization;

    public String getStudentFullInfo() {
        return "I'm %s and studying for %s".formatted(name, specialization.getName());
    }
}
