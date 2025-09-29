package com.design.pattern.bridge;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Specialization softwareEngineeringSpecialization = new SoftwareEngineeringSpecialization();
        final Specialization psychologicalSpecialization = new PsychologicalSpecialization();

        final Student volodymyrDobrianskyi = new BachelorStudent("Volodymyr Dobrianskyi", softwareEngineeringSpecialization);
        final Student someWoman = new MasterStudent("Klementa", psychologicalSpecialization);

        final List<Student> students = List.of(volodymyrDobrianskyi, someWoman);

        for (final Student student : students) {
            System.out.println(student.getStudentFullInfo());
        }
    }
}
