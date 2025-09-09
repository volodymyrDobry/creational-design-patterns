package com.design.pattern.objectPool;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the usage of {@link ExamTicketPool} along with the {@link ExamTicket} prototype.
 * <p>
 * This class shows how to manage a pool of exam tickets, reuse existing tickets,
 * and create new ones by cloning a prototype when the pool is empty.
 * <p>
 * It illustrates the combination of the <b>Prototype</b> and <b>Object Pool</b> patterns.
 */
public class MainPool {

    /**
     * Main method to run the Object Pool and Prototype example.
     * <p>
     * Steps demonstrated:
     * <ol>
     *     <li>Create a prototype ExamTicket using Builder.</li>
     *     <li>Create an initial list of tickets by cloning the prototype.</li>
     *     <li>Initialize the ExamTicketPool with initial tickets and the prototype.</li>
     *     <li>Acquire tickets from the pool and display them.</li>
     *     <li>Demonstrate ticket creation via prototype when the pool is empty.</li>
     *     <li>Release a ticket back to the pool and acquire it again.</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        // Create a prototype ExamTicket using Builder
        ExamTicket prototype = new ExamTicket.Builder()
                .setTicketNumber(1000)
                .setSubject("Mathematics")
                .setExaminer("Dr. Smith")
                .setExamDate(LocalDate.of(2025, 6, 15))
                .setDurationMinutes(120)
                .setRoom("Room 101")
                .addQuestion("What is the derivative of x^2?")
                .addQuestion("Solve the integral of sin(x).")
                .build();

        // Create initial tickets by cloning the prototype
        List<ExamTicket> initialTickets = new ArrayList<>();
        initialTickets.add(prototype.clone());
        initialTickets.add(prototype.clone());

        // Initialize the ticket pool
        ExamTicketPool pool = new ExamTicketPool(initialTickets, prototype);

        // Acquire tickets from the pool
        ExamTicket ticket1 = pool.acquireTicket();
        ticket1.setSubject("Dombit' bombas");
        ExamTicket ticket2 = pool.acquireTicket();
        ExamTicket ticket3 = pool.acquireTicket(); // created by prototype

        // Display tickets
        System.out.println("=== Ticket 1 ===");
        ticket1.displayTicket();

        System.out.println("=== Ticket 2 ===");
        ticket2.displayTicket();

        System.out.println("=== Ticket 3 (created by prototype) ===");
        ticket3.displayTicket();

        // Release ticket1 back to the pool
        pool.releaseTicket(ticket1);

        // Acquire a ticket from the pool (ticket1 reused)
        ExamTicket ticket4 = pool.acquireTicket();
        System.out.println("=== Ticket 4 (returned ticket1) ===");
        ticket4.displayTicket();
    }
}
