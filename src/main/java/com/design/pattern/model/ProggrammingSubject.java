package com.design.pattern.model;

/**
 * The {@code ProggrammingSubject} class is a concrete implementation of {@link Subject} that
 * represents a programming course.
 *
 * <p>This subject applies a grading policy where the final evaluation is calculated by multiplying
 * the raw earned points by {@code 0.9}.
 *
 * <h2>Grading Policy</h2>
 *
 * <ul>
 *   <li>Final grade = earnedPoints × 0.9
 *   <li>Result is cast to an integer
 * </ul>
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Subject programming = new ProggrammingSubject("Programming", 150);
 *
 * int rawPoints = 80;
 * int grade = programming.getAutomaticEvaluation(rawPoints);
 *
 * System.out.println("Final grade: " + grade); // Final grade: 72
 * }</pre>
 *
 * @see Subject
 */
public class ProggrammingSubject extends Subject {

  private static final double COEFFICIENT = 0.9;

  /**
   * Creates a new Programming subject with the given name and credits.
   *
   * @param name the subject name
   * @param credits the number of credits for this subject
   */
  public ProggrammingSubject(final String name, final long credits) {
    super(name, credits);
  }

  /**
   * Calculates the automatic evaluation for a student based on their earned points. In programming,
   * the raw score is multiplied by a coefficient of 0.9.
   *
   * @param earnedPoints the points earned by the student
   * @return the final grade after applying the coefficient
   */
  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return (int) (earnedPoints * COEFFICIENT);
  }
}
