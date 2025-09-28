package com.design.pattern.composite;

public class Exam {

    public static void main(String[] args){
        Question q1 = new Question("Nigger nigger", 1488);
        q1.setTitle("Nigga");
        Question q2 = new Question("fuck juice", 1488);

        Question q3 = new Question("KKK", 88);
        Question q4 = new Question("heil kitty", 14);
        q4.setTitle("Sieg");

        QuestionGroup ticket1 = new QuestionGroup();
        ticket1.setTitle("ticket1");
        ticket1.add(q1);
        ticket1.add(q2);

        QuestionGroup ticket2 = new QuestionGroup();
        ticket2.setTitle("ticket2");
        ticket2.add(q3);
        ticket2.add(q4);

        QuestionGroup examQuestions = new QuestionGroup();
        examQuestions.setTitle("exam");
        examQuestions.add(ticket1);
        examQuestions.add(ticket2);

        examQuestions.print();

        Question q = examQuestions.getRandomQuestion();

        q.print();
    }
}
