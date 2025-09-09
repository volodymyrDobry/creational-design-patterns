package com.design.pattern.objectPool;

import com.design.pattern.model.ExamTicket;

import java.util.LinkedList;
import java.util.List;

public class ExamTicketPool {
    private final List<ExamTicket> availableTickets = new LinkedList<>();
    private final ExamTicket prototype;

    public ExamTicketPool(final List<ExamTicket> initialTickets, final ExamTicket prototype) {
        availableTickets.addAll(initialTickets);
        this.prototype = prototype;
    }

    public ExamTicket acquireTicket() {
        if (!availableTickets.isEmpty()) {
            return availableTickets.remove(0);
        } else {
            System.out.println("No tickets available, creating new one by cloning.");
            return prototype.clone();
        }
    }

    public void releaseTicket(final ExamTicket ticket) {
        availableTickets.add(ticket);
    }
}
