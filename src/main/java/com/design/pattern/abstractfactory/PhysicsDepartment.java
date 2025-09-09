package com.design.pattern.abstractfactory;

import com.design.pattern.model.PhysicSubject;
import com.design.pattern.model.Subject;
import java.util.List;

/**
 * The {@code PhysicsDepartment} class is a concrete implementation of the {@link Department}
 * interface. It represents the Physics department at a university and provides a set of
 * physics-related subjects.
 *
 * <p>This class follows the <b>Factory Method</b> design pattern by acting as a concrete factory
 * that produces {@link Subject} objects. Clients can obtain the list of physics subjects without
 * being concerned with the instantiation details.
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Department physicsDept = new PhysicsDepartment();
 * List<Subject> subjects = physicsDept.getSubjects();
 *
 * subjects.forEach(s ->
 *     System.out.println(s.getName() + " - " + s.getCredits() + " credits")
 * );
 * }</pre>
 *
 * @see Department
 * @see Subject
 */
public class PhysicsDepartment implements Department {

  /**
   * Returns a list of {@link Subject}s offered by the Physics Department.
   *
   * <p>For demonstration purposes, this implementation provides a single {@link PhysicSubject} with
   * the topic "Physic" and 100 credits. In a real-world system, this could be expanded to include
   * mechanics, thermodynamics, quantum physics, and other specialized subjects.
   *
   * @return a list of physics-related subjects
   */
  @Override
  public List<Subject> getSubjects() {
    return List.of(new PhysicSubject("Physic", 100));
  }
}
