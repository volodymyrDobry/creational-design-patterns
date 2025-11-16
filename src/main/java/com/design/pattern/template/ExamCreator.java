package com.design.pattern.template;

abstract class ExamEvaluator {

    public final void process() {

    }

    protected abstract void loadAnswers();
    protected abstract void checkAnswers();
}
