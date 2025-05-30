package org.example.HW14.task14_3_1;

public class Authenticator {
    public static void main(String[] args) {
        Client client = new Client("pae", "1234", "admin");

        Handler handler = new UserExistsHandler();
        handler.setNext(new PasswordHandler())
               .setNext(new RoleHandler("admin"));

        if (handler.handle(client)) {
            System.out.println("Доступ дозволено");
        } else {
            System.out.println("Доступ заборонено");
        }
    }
}
