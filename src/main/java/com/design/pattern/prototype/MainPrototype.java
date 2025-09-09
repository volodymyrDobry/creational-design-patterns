package com.design.pattern.prototype;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;

public class MainPrototype {

    public static void main(String[] args) {
        ExamTicket originalTicket = new ExamTicket.Builder()
                .setTicketNumber(2)
                .setSubject("Physics")
                .setExaminer("Prof. Johnson")
                .setExamDate(LocalDate.of(2025, 6, 20))
                .setDurationMinutes(90)
                .setRoom("Lab 3")
                .addQuestion("State Newton's second law.")
                .addQuestion("What is the speed of light?")
                .build();

        ExamTicket clonedTicket = originalTicket.clone();

        clonedTicket.displayTicket();
        System.out.println("=== Prototype Example (Cloned) ===");
        clonedTicket.displayTicket();
    }
}
