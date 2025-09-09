package com.design.pattern.builder;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;

public class MainBuilder {

    public static void main(String[] args) {
        ExamTicket ticket = new ExamTicket.Builder()
                .setTicketNumber(1)
                .setSubject("Mathematics")
                .setExaminer("Dr. Smith")
                .setExamDate(LocalDate.of(2025, 6, 15))
                .setDurationMinutes(120)
                .setRoom("Room 101")
                .addQuestion("What is the derivative of x^2?")
                .addQuestion("Solve the integral of sin(x).")
                .addQuestion("Find eigenvalues of a 2x2 matrix.")
                .build();

        System.out.println("=== Builder Example ===");
        ticket.displayTicket();
    }
}
