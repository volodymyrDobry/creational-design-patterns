package com.design.pattern.command;

public class GeminiSolution extends AiSolution {

    public GeminiSolution(final Task task) {
        super(task);
    }

    @Override
    public String resolve() {
        return "The solution for this task is provided by Gemini. Your description is %s".formatted(task.getDescription());
    }
}
