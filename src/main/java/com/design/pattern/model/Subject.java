package com.design.pattern.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class Subject {
  private String name;
  private long credits;

  public Map<Student, Integer> calculateStudentsExamEvaluation(
      final Map<Student, Integer> studentPoints) {
    final Map<Student, Integer> studentEvaluation = new HashMap<>();
    for (final Entry<Student, Integer> set : studentPoints.entrySet()) {
      final int evaluation = getAutomaticEvaluation(set.getValue());
      studentEvaluation.put(set.getKey(), evaluation);
    }
    return studentEvaluation;
  }

  protected abstract int getAutomaticEvaluation(int earnedPoints);
}
