package com.i2i.employee.service;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getEmployees();

    EmployeeDto getEmployeeById(int id);

    Employee updateEmployee(EmployeeDto employeeDto);

    void deleteEmployeeById(int id);
}
