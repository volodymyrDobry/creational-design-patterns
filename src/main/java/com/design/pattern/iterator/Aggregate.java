package com.design.pattern.iterator;

public interface Aggregate<T> {

    Iterator<T> createIterator();
}
