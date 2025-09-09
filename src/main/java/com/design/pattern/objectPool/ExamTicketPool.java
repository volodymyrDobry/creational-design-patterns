package com.design.pattern.objectPool;

import com.design.pattern.model.ExamTicket;

import java.util.LinkedList;
import java.util.List;

/**
 * The {@code ExamTicketPool} class implements an object pool for {@link ExamTicket}.
 * <p>
 * It manages a pool of available exam tickets and reuses them to reduce object
 * creation overhead. When no tickets are available, it creates a new one
 * by cloning a prototype ticket.
 * <p>
 * This class demonstrates the combination of the <b>Object Pool</b> and <b>Prototype</b>
 * design patterns.
 */
public class ExamTicketPool {

    /** List of currently available exam tickets in the pool */
    private final List<ExamTicket> availableTickets = new LinkedList<>();

    /** Prototype exam ticket used to create new tickets when the pool is empty */
    private final ExamTicket prototype;

    /**
     * Constructs an {@code ExamTicketPool} with an initial list of tickets
     * and a prototype for creating new tickets.
     *
     * @param initialTickets the initial list of tickets to populate the pool
     * @param prototype the prototype ticket used for cloning
     */
    public ExamTicketPool(final List<ExamTicket> initialTickets, final ExamTicket prototype) {
        availableTickets.addAll(initialTickets);
        this.prototype = prototype;
    }

    /**
     * Acquires an exam ticket from the pool.
     * <p>
     * If the pool has available tickets, the first ticket is removed from
     * the pool and returned. If the pool is empty, a new ticket is created
     * by cloning the prototype.
     *
     * @return an {@link ExamTicket} instance, either from the pool or cloned from the prototype
     */
    public ExamTicket acquireTicket() {
        if (!availableTickets.isEmpty()) {
            return availableTickets.remove(0);
        } else {
            System.out.println("No tickets available, creating new one by cloning.");
            return prototype.clone();
        }
    }

    /**
     * Releases an exam ticket back into the pool.
     * <p>
     * The ticket becomes available for future reuse.
     *
     * @param ticket the {@link ExamTicket} to return to the pool
     */
    public void releaseTicket(final ExamTicket ticket) {
        availableTickets.add(ticket);
    }
}
