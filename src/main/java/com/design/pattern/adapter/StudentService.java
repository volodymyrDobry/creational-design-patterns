package com.design.pattern.adapter;

import com.design.pattern.model.Student;
import com.design.pattern.singletone.StudentsRepository;

public class StudentService {

    public static void main(String[] args) {
        Student oldStudent = getStudent(1, new LegacyStudentRepoAdapter());
        Student newStudent = getStudent(2, StudentsRepository.getInstance());

        System.out.println("Old Student - " + oldStudent);
        System.out.println("New Student - " + newStudent);
    }

    public static Student getStudent(Integer id, StudentRepositoryInterface dataBase) {
        return dataBase.findStudentById(id);
    }


}
