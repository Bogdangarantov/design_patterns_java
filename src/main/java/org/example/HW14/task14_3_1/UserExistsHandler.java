package org.example.HW14.task14_3_1;

public class UserExistsHandler extends Handler {
    @Override
    protected boolean check(Client client) {
        if (client.getUsername() == null || client.getUsername().isEmpty()) {
            System.out.println("Користувач не знайдений");
            return false;
        }
        return true;
    }
}
