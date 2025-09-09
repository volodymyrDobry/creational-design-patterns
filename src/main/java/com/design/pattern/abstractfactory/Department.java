package com.design.pattern.abstractfactory;

import com.design.pattern.model.Subject;
import java.util.List;

/**
 * The {@code Department} interface represents a factory responsible for providing a collection of
 * academic {@link Subject}s.
 *
 * <p>Each concrete implementation of this interface corresponds to a specific department within a
 * university (e.g., Computer Science, Mathematics, Medicine). By using the factory approach, the
 * client code can request a list of subjects without needing to know how they are created or
 * organized inside the department.
 *
 * <h2>Design Pattern</h2>
 *
 * <ul>
 *   <li><b>Factory Method / Abstract Factory:</b> The department acts as a factory that produces
 *       subjects. Different departments can return different families of subjects while adhering to
 *       the same contract.
 * </ul>
 *
 * <h2>Usage Example</h2>
 *
 * <pre>{@code
 * Department csDepartment = new ComputerScienceDepartment();
 * List<Subject> subjects = csDepartment.getSubjects();
 *
 * for (Subject subject : subjects) {
 *     System.out.println(subject.getName());
 * }
 * }</pre>
 *
 * @author Volodymyr Dobrianskyi
 */
public interface Department {
  /**
   * Returns a list of {@link Subject} instances offered by this department.
   *
   * <p>Each subject represents a course or academic unit that belongs to the department. The exact
   * subjects provided depend on the specific implementation.
   *
   * @return a list of subjects offered by the department
   */
  List<Subject> getSubjects();
}
