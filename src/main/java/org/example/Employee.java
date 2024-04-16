package org.example;

class Employee {
    private String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Зарплата: " + salary);
    }
}
