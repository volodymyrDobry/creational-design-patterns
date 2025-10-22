package com.design.pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student implements UniversityMember {
    private String name;
    private String faculty;

    @Override
    public void accept(final Visitor universityVisitor) {
        universityVisitor.acceptStudent(this);
    }
}
