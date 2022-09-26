package com.i2i.employee.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private int id;
    private String name;
    private String email;
    private String dateOfBirth;
    private String gender;
    private long mobileNumber;
    private String dateOfJoin;

    private String status;

    public EmployeeDto(String name, String email, String dateOfBirth, String gender,long mobileNumber, String dateOfJoin,String status) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
    }
    public EmployeeDto(int id, String name, String email, String dateOfBirth, String gender, String dateOfJoining, String status) {}



    public EmployeeDto(int id, String name, String email, String dateOfBirth, String gender, long mobileNumber, String dateOfJoin, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
    }

    public EmployeeDto() {

    }
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return email;
    }

    public void setEmailId(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setDateOfJoining(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getDateOfJoining() {
        return dateOfJoin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return  "Employee Id : " + id + "\n Name: " + name +  "\n Email Id: " + email + "\n Date of birth:" + dateOfBirth +
                "\n Gender:" + gender + "\n Mobile Number:" + mobileNumber + "\n Date of joining:" + dateOfJoin ;
    }
}




