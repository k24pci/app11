package com.ucx.training.sessions.app1.businesslogic;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private Gender gender;
    private Address address;
    private Position jobPosition;
    private Double workingHours;

    public Employee(){

    }

    public Employee(String steve, String bald, String qa, Gender female, Address address1){
    }


    public Employee(String firstName, String lastName, String position, Gender gender, Address address, Position jobPosition, Double workingHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.gender = gender;
        this.address = address;
        this.jobPosition = jobPosition;
        this.workingHours = workingHours;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Position getJobPosition() { return jobPosition; }

    public void setJobPosition(Position jobPosition) { this.jobPosition = jobPosition; }

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }



    /**
     * Method for calculating wage of an Employee
     * @param workingHoursPerMonth
     * @return
     */
    public Double calculateWage(){
            Double wage;
            wage = this.workingHours * getJobPosition().getPayPerHour();
            return wage;

    }


}
