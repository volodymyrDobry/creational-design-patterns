package com.design.pattern.composite;

import lombok.Setter;

@Setter
public class Question implements ExamComponent {
    private String text;
    private Integer grade;
    private String title = "Title question unknown";

    public Question(String text, Integer grade) {
        this.text = text;
        this.grade = grade;
    }

    public void print() {
        System.out.println(title + " - " + text + " - " + grade);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Question getRandomQuestion() {
        return this;
    }

    @Override
    public boolean isLast() {
        return true;
    }
}
