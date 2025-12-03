package org.streams.example6;

import java.math.BigDecimal;

public class Specialist {
    private String name;
    private BigDecimal salary;
    private Specialty specialty;

    public Specialist(String name, BigDecimal salary , Specialty specialty){
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", specialty=" + specialty +
                '}';
    }
}
