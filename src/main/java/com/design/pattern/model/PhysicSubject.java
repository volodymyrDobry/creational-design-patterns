package com.design.pattern.model;

/**
 * The {@code PhysicSubject} class is a concrete implementation of {@link Subject} that represents a
 * physics course.
 *
 * <p>This subject applies a direct grading policy: the student’s final evaluation is equal to the
 * raw points they earned, without any coefficient or transformation.
 *
 * <h2>Grading Policy</h2>
 *
 * <ul>
 *   <li>Final grade = earnedPoints
 * </ul>
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Subject physics = new PhysicSubject("Physics", 120);
 *
 * int rawPoints = 80;
 * int grade = physics.getAutomaticEvaluation(rawPoints);
 *
 * System.out.println("Final grade: " + grade); // Final grade: 80
 * }</pre>
 *
 * @see Subject
 */
public class PhysicSubject extends Subject {

  /**
   * Creates a new Physics subject with the given name and credits.
   *
   * @param name the subject name
   * @param credits the number of credits for this subject
   */
  public PhysicSubject(final String name, final long credits) {
    super(name, credits);
  }

  /**
   * Returns the final grade, which is equal to the raw points earned.
   *
   * @param earnedPoints the points earned by the student
   * @return the same value as {@code earnedPoints}
   */
  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return earnedPoints;
  }
}
