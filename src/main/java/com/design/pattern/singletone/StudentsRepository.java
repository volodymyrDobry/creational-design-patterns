package com.design.pattern.singletone;

import com.design.pattern.model.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;

/**
 * The {@code StudentsRepository} class is a singleton that manages the list of students and their
 * earned points.
 *
 * <p>This repository provides a centralized place to retrieve all students and their associated
 * exam points. It ensures that there is only one instance of the repository across the application.
 *
 * <h2>Design Pattern</h2>
 *
 * <ul>
 *   <li><b>Singleton:</b> Ensures a single instance of {@code StudentsRepository} exists.
 * </ul>
 *
 * <h2>Usage Example</h2>
 *
 * <pre>{@code
 * StudentsRepository repository = StudentsRepository.getInstance();
 * Map<Student, Integer> studentsWithPoints = repository.getStudentsWithPoints();
 *
 * studentsWithPoints.forEach((student, points) ->
 *     System.out.println(student.getFirstName() + " " + student.getLastName() + " -> " + points)
 * );
 * }</pre>
 */
public class StudentsRepository {

  /** The list of all students in the repository. */
  @Getter private static final List<Student> students;

  /** Internal map of student IDs to their earned points. */
  private static final Map<Integer, Integer> studentPoints;

  /** Singleton instance of {@code StudentsRepository}. */
  private static StudentsRepository instance;

  static {
    students =
        List.of(
            new Student(1, "Volodymyr", "Dobrianskyi"),
            new Student(2, "Vadim", "Darmohrai"),
            new Student(3, "Nikita", "Zaloha"),
            new Student(4, "David", "Dvinskyi"));

    studentPoints = Map.of(1, 100, 2, 100, 3, 5, 4, 200);
  }

  /** Private constructor to prevent external instantiation. */
  private StudentsRepository() {}

  /**
   * Returns the singleton instance of {@code StudentsRepository}.
   *
   * @return the single instance of this repository
   */
  public static synchronized StudentsRepository getInstance() {
    if (instance == null) {
      instance = new StudentsRepository();
    }
    return instance;
  }

  /**
   * Returns a map of {@link Student} to their earned points.
   *
   * <p>The map keys are {@code Student} objects, and the values are the points retrieved from the
   * internal {@code studentPoints} map.
   *
   * @return a map of students and their corresponding points
   */
  public Map<Student, Integer> getStudentsWithPoints() {
    return students.stream()
        .collect(
            Collectors.toMap(student -> student, student -> studentPoints.get(student.getId())));
  }
}
