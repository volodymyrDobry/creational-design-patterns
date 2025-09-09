package com.design.pattern.factory;

import com.design.pattern.model.Student;
import com.design.pattern.model.Subject;
import com.design.pattern.singletone.StudentsRepository;
import java.util.Map;

public class Main {
  public static void main(final String[] args) {
    final StudentsRepository studentsRepository = StudentsRepository.getInstance();

    final Subject subject = SubjectFactory.getSubject("math");
    final Map<Student, Integer> res =
        subject.calculateStudentsExamEvaluation(studentsRepository.getStudentsWithPoints());

    System.out.println(res);
  }
}
