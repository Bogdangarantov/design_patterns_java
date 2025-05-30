package org.example.HW14.task14_3_1;

public class PasswordHandler extends Handler {
    @Override
    protected boolean check(Client client) {
        if (!client.getPassword().equals("1234")) {
            System.out.println("Невірний пароль");
            return false;
        }
        return true;
    }
}
