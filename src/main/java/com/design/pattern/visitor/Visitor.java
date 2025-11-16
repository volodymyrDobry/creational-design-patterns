package com.design.pattern.visitor;

public interface Visitor {
    void acceptStudent(Student student);

    void acceptTeacher(Teacher teacher);

    void acceptStaff(Staff staff);
}
