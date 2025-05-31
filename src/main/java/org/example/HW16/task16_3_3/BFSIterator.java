package org.example.HW16.task16_3_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator implements Iterator<Component> {
    private final Queue<Component> queue = new LinkedList<>();

    public BFSIterator(Component root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component current = queue.poll();
        assert current != null;
        queue.addAll(current.getChildren());
        return current;
    }
}
