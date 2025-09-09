package com.design.pattern.abstractfactory;

import com.design.pattern.model.ProggrammingSubject;
import com.design.pattern.model.Subject;
import java.util.List;

/**
 * The {@code ITDepartment} class is a concrete implementation of the {@link Department} interface.
 * It represents the Information Technology department at a university and provides a set of
 * IT-related subjects.
 *
 * <p>This class follows the <b>Factory Method</b> design pattern by acting as a concrete factory
 * that produces {@link Subject} objects. Clients can obtain the list of IT subjects without
 * worrying about how they are created.
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Department itDept = new ITDepartment();
 * List<Subject> subjects = itDept.getSubjects();
 *
 * subjects.forEach(s ->
 *     System.out.println(s.getName() + " - " + s.getCredits() + " credits")
 * );
 * }</pre>
 *
 * @see Department
 * @see Subject
 */
public class ITDepartment implements Department {

  /**
   * Returns a list of {@link Subject}s offered by the IT Department.
   *
   * <p>For demonstration purposes, this implementation provides a single {@link
   * ProggrammingSubject} with the topic "Java" and 100 credits. In a real-world system, this could
   * be expanded to include multiple programming and IT-related subjects.
   *
   * @return a list of IT-related subjects
   */
  @Override
  public List<Subject> getSubjects() {
    return List.of(new ProggrammingSubject("Java", 100));
  }
}
