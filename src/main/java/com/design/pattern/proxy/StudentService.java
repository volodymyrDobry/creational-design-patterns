package com.design.pattern.proxy;

public interface StudentService {
    void addStudent(Student student) throws StudentAlreadyExistsException;

    Student getStudentByName(final String name) throws StudentNotExistsException;

    void removeStudentByName(String name);
}
