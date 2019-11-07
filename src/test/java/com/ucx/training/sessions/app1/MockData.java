package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.*;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    //Nje klase qe e ka konstuktorin privat nuk mundet me u inicializu
    private MockData(){

    }

    public static Company getCompany(){
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtine","street",10000);
        Employee employee1 = new Employee("Steve", "Bald", "QA", Gender.FEMALE, address1);
        employees.add(employee1);

        Address address2 = new Address("US", "NY", "Seaside","street",10000);
        Employee employee2 = new Employee("David", "Bald", "QA", Gender.FEMALE, address2);
        employees.add(employee1);

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtine","street",10000);
        Employee employee3 = new Employee("Mike", "Bald", "QA", Gender.MALE, address3);
        employees.add(employee1);

        Company company = new Company(1,"Company Name", employees);

        return company;
    }
    public static Employee getEmployee(Position position){

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtina", "3st street", 10000);
        Employee employee = new Employee();
        employee.setFirstName("Mary");
        employee.setLastName("Jones");
        employee.setJobPosition(Position.PM);
        employee.setGender(Gender.FEMALE);
        employee.setAddress(address3);
        employee.setWorkingHours(100D);

        return  employee;
    }


}
