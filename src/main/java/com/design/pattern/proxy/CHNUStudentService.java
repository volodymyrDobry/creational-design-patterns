package com.design.pattern.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CHNUStudentService implements StudentService {

    private static final List<Student> students = new ArrayList<>();

    private static StudentService studentService;

    private CHNUStudentService() {
    }

    public static StudentService getInstance() {
        if (studentService == null) {
            studentService = new StudentServiceLogger(new CHNUStudentService());
        }
        return studentService;
    }

    @Override
    public void addStudent(final Student student) throws StudentAlreadyExistsException {
        if (findStudentByName(student.getName()).isPresent()) {
            throw new StudentAlreadyExistsException("Student with this name already exists");
        }
        students.add(student);
    }

    @Override
    public Student getStudentByName(final String name) throws StudentNotExistsException {
        return findStudentByName(name).orElseThrow(() -> new StudentNotExistsException("Student with this name does not exists"));
    }

    @Override
    public void removeStudentByName(final String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    private Optional<Student> findStudentByName(final String name) {
        return students.stream().filter(student -> Objects.equals(student.getName(), name)).findFirst();
    }
}
