package com.design.pattern.chain;

import com.design.pattern.factory.SubjectFactory;
import com.design.pattern.model.ProggrammingSubject;
import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;
import com.design.pattern.singletone.StudentsRepository;

public class Main {

    public static void main(String[] args){
        StudentsRepository studentsRepository = StudentsRepository.getInstance();
        Student vDobryanskiy = studentsRepository.findStudentById(1);
        Student vDarmohrai = studentsRepository.findStudentById(2);

        Subject programming = SubjectFactory.getSubject("programming");

        AuthHandler authHandler = new AuthHandler();
        BannedStudentHandler bannedStudentHandler = new BannedStudentHandler();
        GradeHandler gradeHandler = new GradeHandler();

        authHandler.setNext(gradeHandler).setNext(bannedStudentHandler);

        authHandler.handle(vDarmohrai, programming, 100);
        System.out.println("---------------------------nigger-------------------------------------------------");
        authHandler.handle(vDobryanskiy, programming, 100);
    }
}
