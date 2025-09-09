package com.design.pattern.factory;

import com.design.pattern.model.MathSubject;
import com.design.pattern.model.PhysicSubject;
import com.design.pattern.model.ProggrammingSubject;
import com.design.pattern.model.Subject;

public class SubjectFactory {
  private static final int PHYSICS_CREDITS = 120;
  private static final int PROGRAMING_CREDITS = 150;
  private static final int MATH_CREDITS = 100;

  private SubjectFactory() {}

  public static Subject getSubject(final String name) {
    return switch (name) {
      case "math" -> new MathSubject("Match", MATH_CREDITS);
      case "physic" -> new PhysicSubject("Physics", PHYSICS_CREDITS);
      case "programming" -> new ProggrammingSubject("Programming", PROGRAMING_CREDITS);
      default -> throw new IllegalArgumentException("No subject with such name");
    };
  }
}
