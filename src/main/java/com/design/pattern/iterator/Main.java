package com.design.pattern.iterator;

import com.design.pattern.model.Student;

public class Main {

    public static void main(String[] args) {
        StudentCollection studentCollection = new StudentCollection();

        Iterator<Student> studentIterator = studentCollection.createIterator();

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getLastName().equals("Darmohrai")) continue;
            System.out.println(student.getLastName() + " - to kick from Uni");
        }
    }
}
