package com.design.pattern.iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T items[];
    private int position = 0;

    public ArrayIterator(T[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public T next() {
        return items[position++];
    }

}
