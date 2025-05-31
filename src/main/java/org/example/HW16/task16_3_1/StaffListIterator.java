package org.example.HW16.task16_3_1;

import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> employees;
    private int index = 0;

    public StaffListIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(index++);
    }
}
