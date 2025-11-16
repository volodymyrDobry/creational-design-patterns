package com.design.pattern.template;

import com.design.pattern.composite.ExamComponent;
import com.design.pattern.composite.Question;
import com.design.pattern.composite.QuestionGroup;

import java.util.List;

abstract class ExamCreator {

    public final ExamComponent process() {
        List<Question> questions = createQuestions();
        questions = setGrades(questions);
        return createExam(questions);
    }

    protected abstract List<Question> createQuestions();

    protected abstract List<Question> setGrades(List<Question> questions);

    protected abstract ExamComponent createExam(List<Question> examComponents);

}
