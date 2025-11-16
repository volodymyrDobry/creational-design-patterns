package com.design.pattern.template;

import com.design.pattern.composite.ExamComponent;
import com.design.pattern.composite.Question;
import com.design.pattern.composite.QuestionGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MathExamCreator extends ExamCreator {

    private final List<String> staticQuestions;

    private final int questionNumber;

    private final Random random = new Random();

    public MathExamCreator(int questionNumber) {
        staticQuestions = new ArrayList<>(List.of("still fuck juice", "still kill nigger", "still hate nigger", "still 1488"));

        if (questionNumber > 4) questionNumber = 4;
        else if (questionNumber < 1) questionNumber = 1;
        this.questionNumber = questionNumber;
    }

    @Override
    protected List<Question> createQuestions() {
        List<String> questionsText = new LinkedList<>(staticQuestions);
        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < staticQuestions.size(); i++) {
            int num = random.nextInt(questionsText.size());
            Question q = new Question(questionsText.get(num), 0);
            q.setTitle("If ypu don't understand math blame juice");
            questions.add(q);
            questionsText.remove(num);
        }

        questions.add(new Question("We know who did 9/11", 0));

        return questions;
    }

    @Override
    protected List<Question> setGrades(List<Question> questions) {
        for (Question question : questions){
            question.setGrade(random.nextInt(21));
        }
        return questions;
    }

    @Override
    protected ExamComponent createExam(List<Question> examComponents) {
        QuestionGroup ticket = new QuestionGroup();
        for (Question question : examComponents){
            ticket.add(question);
        }
        ticket.setTitle("I can compute two plus two - so i know we should blame ew");
        return ticket;
    }
}
