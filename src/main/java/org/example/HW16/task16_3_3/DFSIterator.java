package org.example.HW16.task16_3_3;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DFSIterator implements Iterator<Component> {
    private final Stack<Component> stack = new Stack<>();

    public DFSIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        Component current = stack.pop();
        List<Component> children = current.getChildren();
        for (int i = children.size() - 1; i >= 0; i--) {
            stack.push(children.get(i));
        }
        return current;
    }
}
