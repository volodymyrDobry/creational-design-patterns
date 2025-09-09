package com.design.pattern.model;

/**
 * The {@code MathSubject} class is a concrete implementation of {@link Subject} that represents a
 * mathematics course.
 *
 * <p>This subject applies a fixed grading policy based on a coefficient multiplier. The raw points
 * earned by a student are multiplied by {@code 0.7}, and the result is used as the final evaluation
 * score.
 *
 * <h2>Grading Policy</h2>
 *
 * <ul>
 *   <li>Final grade = earnedPoints × 0.7
 *   <li>Result is cast to an integer
 * </ul>
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Subject math = new MathSubject("Mathematics", 100);
 *
 * int rawPoints = 80;
 * int grade = math.getAutomaticEvaluation(rawPoints);
 *
 * System.out.println("Final grade: " + grade); // Final grade: 56
 * }</pre>
 *
 * @see Subject
 */
public class MathSubject extends Subject {

  private static final double COEFFICIENT = 0.7;

  /**
   * Creates a new Math subject with the given name and credits.
   *
   * @param name the subject name
   * @param credits the number of credits for this subject
   */
  public MathSubject(final String name, final long credits) {
    super(name, credits);
  }

  /**
   * Calculates the automatic evaluation for a student based on their earned points. In mathematics,
   * the raw score is multiplied by a coefficient of 0.7.
   *
   * @param earnedPoints the points earned by the student
   * @return the final grade after applying the coefficient
   */
  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return (int) (earnedPoints * COEFFICIENT);
  }
}
