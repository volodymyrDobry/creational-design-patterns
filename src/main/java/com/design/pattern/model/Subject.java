package com.design.pattern.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * The {@code Subject} class represents an abstract academic course in a university system. It
 * defines the common attributes and behaviors of all subjects, while leaving the evaluation logic
 * to be specified by concrete subclasses.
 *
 * <p>Each subject has a {@code name} and a number of {@code credits}. It also provides a mechanism
 * for calculating student exam evaluations based on earned points, delegating the actual grading
 * logic to the abstract method {@link #getAutomaticEvaluation(int)}.
 *
 * <h2>Design Pattern</h2>
 *
 * <ul>
 *   <li><b>Template Method:</b> The method {@link #calculateStudentsExamEvaluation(Map)} implements
 *       a fixed algorithm for evaluating students but delegates part of the logic (the grading
 *       scheme) to subclasses via {@link #getAutomaticEvaluation(int)}.
 * </ul>
 *
 * <h2>Usage Example</h2>
 *
 * <pre>{@code
 * Subject math = new MathSubject("Math", 100);
 *
 * Map<Student, Integer> points = Map.of(
 *     new Student("Alice"), 85,
 *     new Student("Bob"), 70
 * );
 *
 * Map<Student, Integer> evaluations = math.calculateStudentsExamEvaluation(points);
 * evaluations.forEach((student, grade) ->
 *     System.out.println(student.getName() + " -> " + grade)
 * );
 * }</pre>
 *
 * @see Student
 */
@ToString
@AllArgsConstructor
public abstract class Subject {

  private String name;
  private long credits;

  /**
   * Calculates the exam evaluations for a group of students.
   *
   * <p>For each student, their earned points are passed to {@link #getAutomaticEvaluation(int)},
   * and the resulting grade is stored in a new map.
   *
   * @param studentPoints a map of students to their earned points
   * @return a map of students to their calculated evaluations
   */
  public Map<Student, Integer> calculateStudentsExamEvaluation(
      final Map<Student, Integer> studentPoints) {
    final Map<Student, Integer> studentEvaluation = new HashMap<>();
    for (final Entry<Student, Integer> set : studentPoints.entrySet()) {
      final int evaluation = getAutomaticEvaluation(set.getValue());
      studentEvaluation.put(set.getKey(), evaluation);
    }
    return studentEvaluation;
  }

  /**
   * Defines the grading rule for a specific subject.
   *
   * <p>Each concrete subject decides how to transform earned points into an evaluation (e.g.,
   * letter grades, pass/fail, numeric score).
   *
   * @param earnedPoints the raw points earned by a student
   * @return the calculated evaluation according to the subject's rules
   */
  protected abstract int getAutomaticEvaluation(int earnedPoints);
}
