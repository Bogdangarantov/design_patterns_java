package org.example.HW9;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Employee {
    private final List<Employee> members = new ArrayList<>();

    public void addMember(Employee employee) {
        members.add(employee);
    }

    @Override
    public void payExpenses() {
        for (Employee e : members) {
            e.payExpenses();
        }
    }
}
