package com.i2i.employee.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id")
    private String email;


    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mobile_number")
    private Long mobileNumber;

    @Column(name = "date_of_joning")
    private String dateOfJoining;

    @Column(name = "status")
    private String status;


    public Employee() {
    }

    public Employee(int id, String name, String emailId, String dateOfBirth, String gender, String dateOfJoining, String status) {
    }

    public Employee(int id, String name, String email, String dateOfBirth, String gender, long mobileNumber, String dateOfJoining,
                    String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.dateOfJoining = dateOfJoining;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return  "Employee Id : " + id + "\n Name: " + name +  "\n Email Id: " + email + "\n Date of birth:" + dateOfBirth +
                "\n Gender:" + gender + "\n Mobile Number:" + mobileNumber + "\n Date of joining:" + dateOfJoining ;
    }
}