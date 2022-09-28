package com.i2i.employee.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
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

    @Column(name = "date_of_joining")
    private String dateOfJoining;

    @Column(name = "status")
    private String status;

}