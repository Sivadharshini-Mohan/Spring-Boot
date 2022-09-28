package com.i2i.employee.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
    private int id;
    @NotBlank(message = "Employee Name is mandatory to fill")
    private String name;
    @Email(message = "Please enter valid email id")
    private String email;

    private String dateOfBirth;
    @NotBlank(message = "Please enter your gender")
    private String gender;
    private long mobileNumber;
    private String dateOfJoin;
    private String status;


}




