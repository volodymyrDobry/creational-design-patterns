package com.design.pattern.command;

public class Main {
    public static void main(final String[] args) {
        final Task task = new Task("Write Use case templates", "1.Do 1000 requirements; 2. Don't sleep");
        final AiSolution gptSolution = new GptSolution(task);
        final AiSolution geminiSolution = new GeminiSolution(task);

        final AIHomeTaskHistory aiHomeTaskHistory = new AIHomeTaskHistory();
        aiHomeTaskHistory.resolveHomeTask(gptSolution);
        aiHomeTaskHistory.resolveHomeTask(geminiSolution);

        System.out.println("Your solutions are: " + aiHomeTaskHistory);
    }
}
