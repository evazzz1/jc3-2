package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Виктор", 50000));
        employees.add(new Employee("Анатолий", 60000));
        Manager manager = new Manager("Лидия", 70000);
        employees.add(manager);
        employees.add(new Employee("Карина", 55000));

        manager.increaseSalary(employees, 5000);

        for (Employee employee : employees) {
            employee.display();
        }
    }
}