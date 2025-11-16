package com.design.pattern.composite;

import com.design.pattern.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionGroup implements ExamComponent {
    private final Random random = new Random();

    @Getter
    private List<ExamComponent> components = new ArrayList<>();
    private String title = "Title group unknown";

    @Override
    public void print() {
        System.out.println(title);
        components.forEach(ExamComponent::print);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Question getRandomQuestion() {
        ExamComponent randomComponent = components.get(random.nextInt(components.size()));
        return randomComponent.getRandomQuestion();
    }

    public void add(ExamComponent examComponent) {
        components.add(examComponent);
    }

    @Override
    public boolean isLast() {
        return false;
    }
}
