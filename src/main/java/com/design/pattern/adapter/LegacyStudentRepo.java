package com.design.pattern.adapter;

import com.design.pattern.model.Student;
import lombok.Getter;

import java.util.List;

public class LegacyStudentRepo {

    /**
     * The list of all students in the repository.
     */
    @Getter
    private static final List<Student> students;

    /**
     * Singleton instance of {@code StudentsRepository}.
     */
    private static LegacyStudentRepo instance;

    static {
        students =
                List.of(
                        new Student(1, "Yuriy", "Nikitin"),
                        new Student(2, "Oleksandr", "Val"));
    }

    /**
     * Private constructor to prevent external instantiation.
     */
    private LegacyStudentRepo() {
    }

    /**
     * Returns the singleton instance of {@code StudentsRepository}.
     *
     * @return the single instance of this repository
     */
    public static synchronized LegacyStudentRepo getInstance() {
        if (instance == null) {
            instance = new LegacyStudentRepo();
        }
        return instance;
    }

    public String findStudentRecord(Integer id) {
        Student foundedStudent = null;
        for (Student student : students) {
            if (student.getId().equals(id))
                foundedStudent = student;
        }
        return foundedStudent != null
                ? foundedStudent.getId().toString() + ";" + foundedStudent.getFirstName() + ";" + foundedStudent.getLastName()
                : null;
    }
}
