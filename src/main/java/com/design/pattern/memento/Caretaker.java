package com.design.pattern.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void save(GradesEditor editor) {
        history.push(editor.save());
    }

    public void undo(GradesEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
