package com.ucx.training.sessions.app1.businesslogic;

public class WageResult {
    private Employee employee;
    private Double wage;

    public WageResult(Employee employee, Double wage) {
        this.employee = employee;
        this.wage = wage;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }
}
