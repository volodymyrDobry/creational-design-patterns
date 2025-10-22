package com.design.pattern.command;

public abstract class AiSolution {
    protected final Task task;

    public AiSolution(final Task task) {
        this.task = task;
    }

    public abstract String resolve();
}
