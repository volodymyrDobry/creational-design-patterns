package com.design.pattern.model;

public class PhysicSubject extends Subject {
  public PhysicSubject(final String name, final long credits) {
    super(name, credits);
  }

  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return earnedPoints;
  }
}
