package com.design.pattern.factory;

import com.design.pattern.model.MathSubject;
import com.design.pattern.model.PhysicSubject;
import com.design.pattern.model.ProggrammingSubject;
import com.design.pattern.model.Subject;

/**
 * The {@code SubjectFactory} class is a utility class that provides factory methods for creating
 * instances of different {@link Subject} types.
 *
 * <p>This implementation centralizes the creation logic of subjects and encapsulates the mapping
 * between a subject name and its concrete implementation. Instead of instantiating subjects
 * directly, client code calls the factory to obtain the correct type.
 *
 * <h2>Design Pattern</h2>
 *
 * <ul>
 *   <li><b>Simple Factory:</b> Although not part of the GoF design patterns, the simple factory
 *       pattern is a common technique to delegate object creation to a single place.
 * </ul>
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Subject math = SubjectFactory.getSubject("math");
 * Subject physics = SubjectFactory.getSubject("physic");
 * Subject programming = SubjectFactory.getSubject("programming");
 *
 * System.out.println(math.getName() + " - " + math.getCredits());
 * }</pre>
 *
 * @author Your Name
 */
public class SubjectFactory {

  private static final int PHYSICS_CREDITS = 120;
  private static final int PROGRAMING_CREDITS = 150;
  private static final int MATH_CREDITS = 100;

  /**
   * Private constructor to prevent instantiation. This class is intended to be used in a static way
   * only.
   */
  private SubjectFactory() {}

  /**
   * Creates a {@link Subject} based on the given name.
   *
   * @param name the subject name identifier (e.g., "math", "physic", "programming")
   * @return a concrete {@link Subject} corresponding to the given name
   * @throws IllegalArgumentException if no subject with the given name exists
   */
  public static Subject getSubject(final String name) {
    return switch (name) {
      case "math" -> new MathSubject("Math", MATH_CREDITS);
      case "physic" -> new PhysicSubject("Physics", PHYSICS_CREDITS);
      case "programming" -> new ProggrammingSubject("Programming", PROGRAMING_CREDITS);
      default -> throw new IllegalArgumentException("No subject with such name");
    };
  }
}
