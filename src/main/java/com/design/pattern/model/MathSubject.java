package com.design.pattern.model;

public class MathSubject extends Subject {
  private static final double COEFFICIENT = 0.7;

  public MathSubject(final String name, final long credits) {
    super(name, credits);
  }

  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return (int) (earnedPoints * COEFFICIENT);
  }
}
