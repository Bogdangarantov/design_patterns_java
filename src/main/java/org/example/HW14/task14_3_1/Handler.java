package org.example.HW14.task14_3_1;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public boolean handle(Client client) {
        if (check(client)) {
            if (next != null) {
                return next.handle(client);
            }
            return true;
        }
        return false;
    }

    protected abstract boolean check(Client client);
}
