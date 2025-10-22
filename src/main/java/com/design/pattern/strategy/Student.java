package com.design.pattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private HomeTaskStrategy homeTaskStrategy;

    public void solveTask(final Task task) {
        homeTaskStrategy.solve(task);
    }
}
