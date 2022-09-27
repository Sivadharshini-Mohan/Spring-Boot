package com.i2i.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.internal.util.privilegedactions.LoadClass;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
    private int id;
    private String name;
    private String email;
    private String dateOfBirth;
    private String gender;
    private long mobileNumber;
    private String dateOfJoin;
    private String status;

}




