package com.i2i.employee.converter;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.model.Employee;

public class Mapper {

    public static Employee changeDtoToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto.getId(),employeeDto.getName(), employeeDto.getEmailId(),
                employeeDto.getDateOfBirth(), employeeDto.getGender(), employeeDto.getDateOfJoining(),
                employeeDto.getStatus());

        return employee;
    }

    public static EmployeeDto changeEmployeeToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(),employee.getName(), employee.getEmail(),
                employee.getDateOfBirth(), employee.getGender(), employee.getDateOfJoining(),
                employee.getStatus());

        return employeeDto;
    }
}
