package org.example.HW14.task14_3_1;

public class Client {
    private String username;
    private String password;
    private String role;

    public Client(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
