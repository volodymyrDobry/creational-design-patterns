package com.design.pattern.iterator;

import com.design.pattern.model.Student;
import com.design.pattern.singletone.StudentsRepository;

public class StudentCollection implements Aggregate<Student> {

    private Student[] students;

    {
        students = StudentsRepository.getStudents().toArray(Student[]::new);
    }

    @Override
    public Iterator<Student> createIterator() {
        return new ArrayIterator<>(students);
    }
}
