package com.design.pattern.command;

public class GptSolution extends AiSolution {
    public GptSolution(final Task task) {
        super(task);
    }

    @Override
    public String resolve() {
        return "The solution for this task is provided by CharGpt. Your requirements are %s".formatted(task.getRequirements());
    }
}
