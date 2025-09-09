package com.design.pattern.prototype;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;

/**
 * Demonstrates the usage of the {@link ExamTicket} Prototype pattern.
 * <p>
 * This class shows how to create an {@link ExamTicket} object and
 * clone it to produce a new instance with the same properties.
 * <p>
 * The example illustrates how the Prototype pattern allows creating
 * copies of existing objects without repeating the construction logic.
 */
public class MainPrototype {

    /**
     * Main method to run the Prototype example.
     * <p>
     * Steps demonstrated:
     * <ol>
     *     <li>Create an original ExamTicket using the Builder pattern.</li>
     *     <li>Clone the original ticket to create a new ExamTicket instance.</li>
     *     <li>Display the cloned ticket using {@link ExamTicket#displayTicket()}.</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create the original ExamTicket using Builder
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

        // Clone the original ticket
        ExamTicket clonedTicket = originalTicket.clone();

        // Display the cloned ticket
        System.out.println("=== Prototype Example (Cloned) ===");
        clonedTicket.displayTicket();
    }
}
