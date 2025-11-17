package com.design.pattern.strategy;

public class Main {
    public static void main(final String[] args) {
        final Student vadim = new Student("Vadim Darmohraii", new AIHomeTaskStrategy());
        final Student vova = new Student("Volodymyr Dobrianskyi", new GooglingHomeTaskStrategy());

        final Task task = new Task("Python Coding", "Code in python");
        vadim.solveTask(task);
        vova.solveTask(task);
    }
}
