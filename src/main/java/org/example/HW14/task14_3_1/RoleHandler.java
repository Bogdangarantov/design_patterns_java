package org.example.HW14.task14_3_1;

public class RoleHandler extends Handler {
    private String requiredRole;

    public RoleHandler(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    @Override
    protected boolean check(Client client) {
        if (!client.getRole().equalsIgnoreCase(requiredRole)) {
            System.out.println("Недостатньо прав (потрібен тип: " + requiredRole + ")");
            return false;
        }
        return true;
    }
}
