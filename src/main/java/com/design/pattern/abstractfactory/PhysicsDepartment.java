package com.design.pattern.abstractfactory;

import com.design.pattern.model.PhysicSubject;
import com.design.pattern.model.Subject;
import java.util.List;

public class PhysicsDepartment implements Department {
  @Override
  public List<Subject> getSubjects() {
    return List.of(new PhysicSubject("Physic", 100));
  }
}
