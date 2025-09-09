package com.design.pattern.builder;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;

/**
 * Demonstrates the usage of the {@link ExamTicket.Builder} pattern.
 * <p>
 * This class creates an {@link ExamTicket} instance using the Builder pattern,
 * which allows step-by-step construction of a complex object with multiple parameters.
 * <p>
 * The example sets ticket number, subject, examiner, exam date, duration,
 * room, and adds several questions. It then displays the ticket information
 * using {@link ExamTicket#displayTicket()}.
 */
public class MainBuilder {

    /**
     * Main method to run the Builder example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating an ExamTicket using Builder
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

        // Display the ticket
        System.out.println("=== Builder Example ===");
        ticket.displayTicket();
    }
}
