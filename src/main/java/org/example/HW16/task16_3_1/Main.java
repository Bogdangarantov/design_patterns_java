package org.example.HW16.task16_3_1;

public class Main {
    public static void main(String[] args) {
        StaffList company = new StaffList();
        company.addEmployee(new Employee("Олег"));
        company.addEmployee(new Employee("Анна"));
        company.addEmployee(new Employee("Богдан"));
        company.addEmployee(new Employee("Катерина"));

        System.out.println("Перелік працівників у алфавітному порядку:");
        for (Employee e : company) {
            System.out.println(e);
        }
    }
}
