package com.design.pattern.memento;

public class Memento {

    private final int grade;

    public Memento(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }
}
