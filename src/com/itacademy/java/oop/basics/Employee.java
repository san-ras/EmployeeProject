package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Employee {
    private String name, surname;
    private ContractType contractType;
    private LocalDate startDate;
    private int salary;
    private String position;

    public Employee(String name, String surname, ContractType contractType, LocalDate startDate, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.startDate = startDate;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {}


    public void getInformation() {
        System.out.println( "Employee " +
                name + " " + surname + " is working from " + startDate +
                " as a " + position + " with a salary of " + salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
