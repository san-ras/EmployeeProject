package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class EmployeeManager {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Gitanas", "Nauseda", ContractType.FULL_TIME, LocalDate.parse("2019-07-12"), 5600, "president" );
        Employee employee2 = new Employee();
        employee2.setContractType(ContractType.FULL_TIME);
        employee2.setName("Ingrida");
        employee2.setSurname("Simonyte");
        employee2.setPosition("prime minister");
        employee2.setSalary(3400);
        employee2.setStartDate(LocalDate.parse("2020-12-11"));
        employee2.setContractType(ContractType.FULL_TIME);

        employee1.getInformation();
        employee2.getInformation();

    }
}
