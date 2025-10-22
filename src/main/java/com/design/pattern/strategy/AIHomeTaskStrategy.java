package com.design.pattern.strategy;

public class AIHomeTaskStrategy implements HomeTaskStrategy {
    @Override
    public void solve(final Task task) {
        System.out.printf("Solving task %s by using AI%n", task.getName());
    }
}
