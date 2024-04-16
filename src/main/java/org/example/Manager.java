package org.example;

import java.util.List;
class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void increaseSalary(List<Employee> employees, double increaseAmount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.salary += increaseAmount;
            }
        }
    }
}
