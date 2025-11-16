package com.design.pattern.memento;

public class GradesEditor {

    private int grade = 0;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public Memento save() {
        return new Memento(grade);
    }

    public void restore(Memento memento){
        grade = memento.getGrade();
    }
}
