package com.ucx.training.sessions.app1;

import com.ucx.training.sessions.app1.businesslogic.*;
import com.ucx.training.sessions.app1.repository.InMemoryDB;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtine","street",10000);
        Employee employee1 = new Employee("Steve", "Bald", "QA", Gender.FEMALE, address1, Position.QA,2.00);
        employees.add(employee1);

        Address address2 = new Address("US", "NY", "Seaside","street",10000);
        Employee employee2 = new Employee("David", "Bald", "DEV", Gender.FEMALE, address2, Position.DEV,3.00);
        employees.add(employee2);

        Address address3 = new Address("Kosovo", "Kosovo", "Prishtine","street",10000);
        Employee employee3 = new Employee("Mike", "Bald", "PM", Gender.MALE, address3, Position.PM,4.00);
        employees.add(employee3);

        Company company = new Company(1,"Company Name", employees);

        // Save company in Memory Database
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.createOrUpdate(company);

        Company company2 = new Company(2,"Company Name2", employees);
        db.createOrUpdate(company2);
        Company foundCompany2 = db.findById(2);
        System.out.println("Company ID: " + foundCompany2.getId() + " " + "Company Name: " + foundCompany2.getName() + " " + "Nr of employees: " + foundCompany2.getEmployees().size());

        //Remove company in Memory Database
        db.remove(2);
        System.out.println("Company2 is deleted:" + db.findById(2));
        // Retrieve a company from DB
        Company foundCompany = db.findById(1);
        System.out.println("Company ID: " + foundCompany.getId() + " " + "Company Name: " + foundCompany.getName() + " " + "Nr of employees: " + foundCompany.getEmployees().size());

        List<WageResult> wages = company.calculateWages(employees);

        for (WageResult wage : wages) {
            System.out.println("Employee Name: " + wage.getEmployee().getFirstName() + " and " + " Wage is: " + wage.getWage());
        }


//        List<String> names = new ArrayList<>();
//        names.add("Agron");
//        names.add("Flaka");
//        names.add("Kushtrim");
//
//        for (String name : names){
//            System.out.println(name);
//        }
//        System.out.println(names.size());
//
//        //names1 eshte immutable ocject edhe ktu nuk mundemi me e perdore add() method
//        List<String> names1 = List.of("Nita","Tina","Vjollca");
//
//        for (String name : names1){
//            System.out.println(name);
//        }
//
//        System.out.println(names1.get(0));
//
//        //Ne Map nuk mundemi me perdore primitive data types
//        Map<Integer,String> namesMap = new HashMap<>();
//        namesMap.put(1,"Agron");
//        namesMap.put(2,"Flaka");
//        namesMap.put(3,"Kushtrim");
//
//        System.out.println(namesMap);
//        //Immutable Map same as List, can't add more elements on it
//        //Map is random access, elements are not inserted as they're written
//        Map<Integer,String> namesMap1 = Map.of(1,"Nita",2,"Tina",3,"Vjollca");
//
//        System.out.println(namesMap1);
//        System.out.println(namesMap1.get(3));
    }
}
