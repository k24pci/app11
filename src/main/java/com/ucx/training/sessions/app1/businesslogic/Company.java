package com.ucx.training.sessions.app1.businesslogic;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private Integer id;
    private String name;
    private List<Employee> employees;

    public Company(){
    }

    public Company(Integer id, String name, List<Employee> employees){
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<WageResult> calculateWages(List<Employee> employees){
        List<WageResult> wageResults = new ArrayList<>();

        for (Employee employee : employees){
             double wageOfEmployee = employee.calculateWage();
             WageResult tempWage = new WageResult(employee, wageOfEmployee);
             wageResults.add(tempWage);
        }
        return wageResults;

    }
}
