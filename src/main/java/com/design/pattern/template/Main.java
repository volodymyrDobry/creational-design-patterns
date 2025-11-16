package com.design.pattern.template;

public class Main {

    public static void main(String[] args) {
        ProgrammingExamCreator programmingExamCreator = new ProgrammingExamCreator(4);
        programmingExamCreator.process().print();

        MathExamCreator mathExamCreator = new MathExamCreator(4);
        mathExamCreator.process().print();
    }
}
