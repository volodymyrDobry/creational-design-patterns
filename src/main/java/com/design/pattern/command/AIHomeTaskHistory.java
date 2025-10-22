package com.design.pattern.command;

import lombok.Data;

import java.util.Stack;

@Data
public class AIHomeTaskHistory {

    private final Stack<String> solutions = new Stack<>();

    public void resolveHomeTask(final AiSolution aiSolution) {
        final String solution = aiSolution.resolve();
        solutions.push(solution);
    }

}
