package com.design.pattern.visitor;

public class UniversityMemberVisitor implements Visitor {
    private static final int STUDENT_COUNT_WITH_NAME_VOVA = 0;
    private static final int TEACHERS_COUNT_WITH_NAME_VADIM = 0;
    private static final int STAFF_COUNT = 0;


    @Override
    public void acceptStudent(final Student student) {
        System.out.println("Some logic with student: " + student);
    }

    @Override
    public void acceptTeacher(final Teacher teacher) {
        System.out.println("Some logic with teacher: " + teacher);
    }

    @Override
    public void acceptStaff(final Staff staff) {
        System.out.println("Some logic with staff: " + staff);
    }
}
