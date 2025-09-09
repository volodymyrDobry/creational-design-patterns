package com.design.pattern.model;

import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
public class ExamTicket implements Cloneable {
    private int ticketNumber;
    private String subject;
    private String examiner;
    private LocalDate examDate;
    private int durationMinutes;
    private String room;
    private List<String> questions;

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

    public static class Builder {
        private int ticketNumber;
        private String subject;
        private String examiner;
        private LocalDate examDate;
        private int durationMinutes;
        private String room;
        private List<String> questions = new ArrayList<>();

        public Builder setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setExaminer(String examiner) {
            this.examiner = examiner;
            return this;
        }

        public Builder setExamDate(LocalDate examDate) {
            this.examDate = examDate;
            return this;
        }

        public Builder setDurationMinutes(int durationMinutes) {
            this.durationMinutes = durationMinutes;
            return this;
        }

        public Builder setRoom(String room) {
            this.room = room;
            return this;
        }

        public Builder addQuestion(String question) {
            questions.add(question);
            return this;
        }

        public ExamTicket build() {
            return new ExamTicket(ticketNumber, subject, examiner, examDate,
                    durationMinutes, room, questions);
        }
    }

    // Prototype
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
