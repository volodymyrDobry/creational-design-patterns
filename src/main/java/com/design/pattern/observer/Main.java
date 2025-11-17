package com.design.pattern.observer;

public class Main {
    public static void main(final String[] args) {
        final Dashboard dashboard = new Dashboard();

        final Student student = new Student("Volodymyr", "Software Engineering");
        final Teacher teacher = new Teacher("Yurii");

        dashboard.subscribe(student);
        dashboard.subscribe(teacher);

        dashboard.addLesson("АППЗ");
        dashboard.addLesson("Аналіз вимог");
        dashboard.addLesson("Тестування");

        System.out.println(student);
        System.out.println(teacher);
    }
}
