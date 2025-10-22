package com.design.pattern.visitor;

public class Main {
    public static void main(final String[] args) {
        final Visitor visitor = new UniversityMemberVisitor();

        final UniversityMember universityMember1 = new Student("Vova", "ІППЗ");
        final UniversityMember universityMember2 = new Teacher("Yurii", "5");
        final UniversityMember universityMember3 = new Staff("Vadim", 19);

        universityMember1.accept(visitor);
        universityMember2.accept(visitor);
        universityMember3.accept(visitor);
    }
}
