package org.streams;

public class Employee {
    private String name;
    private Double salary;

    Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }
}
