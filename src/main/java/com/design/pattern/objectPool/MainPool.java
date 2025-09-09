package com.design.pattern.objectPool;

import com.design.pattern.model.ExamTicket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainPool {

    public static void main(String[] args){
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

        List<ExamTicket> initialTickets = new ArrayList<>();
        initialTickets.add(prototype.clone());
        initialTickets.add(prototype.clone());

        ExamTicketPool pool = new ExamTicketPool(initialTickets, prototype);

        ExamTicket ticket1 = pool.acquireTicket();
        ticket1.setSubject("Dombit' bombas");
        ExamTicket ticket2 = pool.acquireTicket();
        ExamTicket ticket3 = pool.acquireTicket();

        System.out.println("=== Ticket 1 ===");
        ticket1.displayTicket();

        System.out.println("=== Ticket 2 ===");
        ticket2.displayTicket();

        System.out.println("=== Ticket 3 (created by prototype) ===");
        ticket3.displayTicket();

        pool.releaseTicket(ticket1);

        ExamTicket ticket4 = pool.acquireTicket();
        System.out.println("=== Ticket 4 (returned ticket1) ===");
        ticket4.displayTicket();
    }
}
