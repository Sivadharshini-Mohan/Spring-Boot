package com.i2i.employee.converter;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee dtoToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getEmail(),
                employeeDto.getDateOfBirth(), employeeDto.getGender(), employeeDto.getMobileNumber(), employeeDto.getDateOfJoin(),
                employeeDto.getStatus());
        System.out.print(employee);
        return employee;
    }

    public EmployeeDto employeeToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getName(), employee.getEmail(),
                employee.getDateOfBirth(), employee.getGender(), employee.getMobileNumber(), employee.getDateOfJoining(),
                employee.getStatus());
        System.out.print(employeeDto);

        return employeeDto;
    }
}
