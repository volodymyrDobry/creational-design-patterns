package com.design.pattern.abstractfactory;

import com.design.pattern.model.Subject;
import java.util.List;

public class Main {
  public static void main(final String[] args) {
    final Department itDepartment = new ITDepartment();
    final List<Subject> itSubjects = itDepartment.getSubjects();
    itSubjects.stream().forEach(System.out::println);

    final Department physicsDepartment = new PhysicsDepartment();
    final List<Subject> physicsSubjects = physicsDepartment.getSubjects();
    physicsSubjects.stream().forEach(System.out::println);
  }
}
