package com.design.pattern.strategy;

public class GooglingHomeTaskStrategy implements HomeTaskStrategy {
    @Override
    public void solve(final Task task) {
        System.out.printf("Solving task by searching in reddit %s%n", task.getName());
    }
}
