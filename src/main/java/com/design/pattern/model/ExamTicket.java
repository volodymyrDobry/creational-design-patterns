package com.design.pattern.model;

import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code ExamTicket} class represents an exam ticket.
 * <p>
 * It uses two design patterns:
 * <ul>
 *     <li><b>Builder</b> — for step-by-step and safe construction of an
 *     {@code ExamTicket} object with multiple parameters.</li>
 *     <li><b>Prototype</b> — for fast cloning of an {@code ExamTicket} object,
 *     e.g., when using an exam ticket pool.</li>
 * </ul>
 * <p>
 * The class contains information about the ticket number, subject, examiner,
 * exam date and duration, room, and a list of questions.
 */
@Setter
public class ExamTicket implements Cloneable {

    /** Unique ticket number */
    private int ticketNumber;

    /** Subject name */
    private String subject;

    /** Examiner's full name */
    private String examiner;

    /** Date of the exam */
    private LocalDate examDate;

    /** Duration of the exam in minutes */
    private int durationMinutes;

    /** Room where the exam is held */
    private String room;

    /** List of exam questions */
    private List<String> questions;

    /**
     * Private constructor for creating an exam ticket.
     * Used by the Builder for step-by-step creation.
     *
     * @param ticketNumber ticket number
     * @param subject subject name
     * @param examiner examiner name
     * @param examDate exam date
     * @param durationMinutes exam duration in minutes
     * @param room room number
     * @param questions list of questions
     */
    private ExamTicket(int ticketNumber, String subject, String examiner,
                       LocalDate examDate, int durationMinutes, String room,
                       List<String> questions) {
        this.ticketNumber = ticketNumber;
        this.subject = subject;
        this.examiner = examiner;
        this.examDate = examDate;
        this.durationMinutes = durationMinutes;
        this.room = room;
        this.questions = new ArrayList<>(questions);
    }

    /**
     * Static Builder class for step-by-step creation of an {@code ExamTicket} object.
     * <p>
     * Allows setting individual ticket fields and adding questions.
     * Calling {@link #build()} returns a fully constructed {@code ExamTicket}.
     */
    public static class Builder {

        private int ticketNumber;
        private String subject;
        private String examiner;
        private LocalDate examDate;
        private int durationMinutes;
        private String room;
        private List<String> questions = new ArrayList<>();

        /**
         * Sets the ticket number.
         *
         * @param ticketNumber ticket number
         * @return the current Builder
         */
        public Builder setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
            return this;
        }

        /**
         * Sets the subject name.
         *
         * @param subject subject name
         * @return the current Builder
         */
        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets the examiner.
         *
         * @param examiner examiner name
         * @return the current Builder
         */
        public Builder setExaminer(String examiner) {
            this.examiner = examiner;
            return this;
        }

        /**
         * Sets the exam date.
         *
         * @param examDate exam date
         * @return the current Builder
         */
        public Builder setExamDate(LocalDate examDate) {
            this.examDate = examDate;
            return this;
        }

        /**
         * Sets the exam duration in minutes.
         *
         * @param durationMinutes exam duration
         * @return the current Builder
         */
        public Builder setDurationMinutes(int durationMinutes) {
            this.durationMinutes = durationMinutes;
            return this;
        }

        /**
         * Sets the exam room.
         *
         * @param room room number
         * @return the current Builder
         */
        public Builder setRoom(String room) {
            this.room = room;
            return this;
        }

        /**
         * Adds a question to the exam ticket.
         *
         * @param question question text
         * @return the current Builder
         */
        public Builder addQuestion(String question) {
            questions.add(question);
            return this;
        }

        /**
         * Builds an {@code ExamTicket} object using the Builder parameters.
         *
         * @return a fully constructed {@code ExamTicket} instance
         */
        public ExamTicket build() {
            return new ExamTicket(ticketNumber, subject, examiner, examDate,
                    durationMinutes, room, questions);
        }
    }

    /**
     * Implements the Prototype pattern for cloning an exam ticket.
     * <p>
     * A deep copy of the questions list is created so the new ticket is
     * independent of the original.
     *
     * @return a cloned {@code ExamTicket} instance
     */
    @Override
    public ExamTicket clone() {
        try {
            ExamTicket cloned = (ExamTicket) super.clone();
            cloned.questions = new ArrayList<>(this.questions);
            return cloned;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * Displays ticket information to the console.
     * <p>
     * Used for demonstration purposes to print the ticket content.
     */
    public void displayTicket() {
        System.out.println("===== Exam Ticket #" + ticketNumber + " =====");
        System.out.println("Subject: " + subject);
        System.out.println("Examiner: " + examiner);
        System.out.println("Date: " + examDate + ", Duration: " + durationMinutes + " mins");
        System.out.println("Room: " + room);
        System.out.println("Questions:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + questions.get(i));
        }
        System.out.println();
    }
}
