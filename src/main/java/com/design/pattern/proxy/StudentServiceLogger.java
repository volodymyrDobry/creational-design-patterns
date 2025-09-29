package com.design.pattern.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentServiceLogger implements StudentService {

    private final StudentService studentService;

    @Override
    public void addStudent(final Student student) throws StudentAlreadyExistsException {
        System.out.println("Adding new Student: " + student.getName());
        try {
            this.studentService.addStudent(student);
        } catch (final StudentAlreadyExistsException exception) {
            System.out.printf("Thrown exception with message: %s during adding student %s%n", exception.getMessage(), student.getName());
            throw new StudentAlreadyExistsException(exception);
        }
        System.out.println("Student " + student.getName() + " was successfully added");
    }

    @Override
    public Student getStudentByName(final String name) throws StudentNotExistsException {
        System.out.println("Retrieving student with name: " + name);
        try {
            final Student student = this.studentService.getStudentByName(name);
            System.out.println("Successfully retrieved student: " + student.getName());
            return student;
        } catch (final StudentNotExistsException e) {
            System.out.println("Student with name " + name + " does not exist. Exception message: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void removeStudentByName(final String name) {
        System.out.println("Removing student with name: " + name);
        try {
            this.studentService.removeStudentByName(name);
            System.out.println("Student " + name + " was successfully removed");
        } catch (final StudentNotExistsException e) {
            System.out.println("Cannot remove student with name " + name + ". Exception message: " + e.getMessage());
        }
    }

}
