package com.design.pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Staff implements UniversityMember {
    private String name;
    private int age;

    @Override
    public void accept(final Visitor universityVisitor) {
        universityVisitor.acceptStaff(this);
    }
}
