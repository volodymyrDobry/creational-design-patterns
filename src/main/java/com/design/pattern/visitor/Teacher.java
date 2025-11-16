package com.design.pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher implements UniversityMember {
    private String name;
    private String experience;


    @Override
    public void accept(final Visitor universityVisitor) {
        universityVisitor.acceptTeacher(this);
    }
}
