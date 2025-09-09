package com.design.pattern.abstractfactory;

import com.design.pattern.model.ProggrammingSubject;
import com.design.pattern.model.Subject;
import java.util.List;

public class ITDepartment implements Department {
  @Override
  public List<Subject> getSubjects() {
    return List.of(new ProggrammingSubject("Java", 100));
  }
}
