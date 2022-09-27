package com.i2i.employee.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Employee Name is mandatory to fill")
    private String name;


    @Column(name = "email_id")
    @Email(message = "Please enter valid email id")
    private String email;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    @NotBlank(message = "Please enter your gender")
    private String gender;


    @Column(name = "mobile_number")
    private Long mobileNumber;

    @Column(name = "date_of_joining")
    private String dateOfJoining;

    @Column(name = "status")
    private String status;

}