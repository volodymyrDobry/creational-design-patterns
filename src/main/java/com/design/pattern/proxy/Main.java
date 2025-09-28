package com.design.pattern.proxy;

public class Main {
    public static void main(final String[] args) {
        final StudentService studentService = CHNUStudentService.getInstance();

        studentService.addStudent(new Student("Volodymyr"));
        studentService.getStudentByName("Volodymyr");
        studentService.removeStudentByName("Volodymyr");

        studentService.addStudent(new Student("Volodymyr"));
        studentService.addStudent(new Student("Volodymyr"));
    }
}
