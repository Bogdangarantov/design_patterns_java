package org.example.HW16.task16_3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        Collections.sort(employees);
        return new StaffListIterator(employees);
    }
}
