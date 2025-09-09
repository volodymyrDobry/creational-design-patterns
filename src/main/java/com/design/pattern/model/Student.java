package com.design.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The {@code Student} class represents a university student.
 *
 * <p>Each student is identified by a unique ID and has personal information including first name
 * and last name.
 *
 * <h2>Usage</h2>
 *
 * <p>The class is used as a key in exam evaluation maps, where the value represents the student’s
 * grade.
 *
 * <h2>Example</h2>
 *
 * <pre>{@code
 * Student student = new Student(1, "Alice", "Johnson");
 *
 * System.out.println(student.getFirstName()); // Alice
 * System.out.println(student.getLastName());  // Johnson
 * }</pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  /** Unique identifier for the student. */
  private Integer id;

  /** First name of the student. */
  private String firstName;

  /** Last name of the student. */
  private String lastName;
}
