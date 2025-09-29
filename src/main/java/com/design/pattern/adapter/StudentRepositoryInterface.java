package com.design.pattern.adapter;

import com.design.pattern.model.Student;

public interface StudentRepositoryInterface {
    Student findStudentById(Integer id);
}
