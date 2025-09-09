package com.design.pattern.model;

public class ProggrammingSubject extends Subject {

  private static final double COEFFICIENT = 0.9;

  public ProggrammingSubject(final String name, final long credits) {
    super(name, credits);
  }

  @Override
  protected int getAutomaticEvaluation(final int earnedPoints) {
    return (int) (earnedPoints * COEFFICIENT);
  }
}
