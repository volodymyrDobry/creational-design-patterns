package com.design.pattern.memento;

public class Main {

    public static void main(String[] args) {
        GradesEditor gradesEditor = new GradesEditor();
        Caretaker caretaker = new Caretaker();

        gradesEditor.setGrade(10);
        caretaker.save(gradesEditor);

        gradesEditor.setGrade(5);

        caretaker.undo(gradesEditor);
        System.out.println(gradesEditor.getGrade());
    }
}
