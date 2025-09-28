package com.design.pattern.composite;

import com.design.pattern.model.Student;

public interface ExamComponent {
    void print();

    void setTitle(String title);

    Question getRandomQuestion();
}
