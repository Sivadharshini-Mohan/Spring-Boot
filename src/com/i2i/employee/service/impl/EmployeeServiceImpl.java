package com.i2i.employee.service.impl;

import com.i2i.employee.converter.EmployeeMapper;
import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.exception.CustomException;
import com.i2i.employee.model.Employee;
import com.i2i.employee.repo.EmployeeRepository;
import com.i2i.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;
    public EmployeeMapper employeeMapper = new EmployeeMapper();

    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.dtoToEmployee(employeeDto);
        return employeeRepository.save(employee);
    }

    public List<EmployeeDto> getEmployees() {

        List<Employee> employees = (List<Employee>) employeeRepository.findAll();

        if (employees.isEmpty()) {
            throw new CustomException("No Employee Found");
        } else {
            return
                    employees.stream()
                            .map(employeeMapper::employeeToDto)
                            .collect(Collectors.toList());
        }
    }

    public EmployeeDto getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeDto employeeDto ;
        if (employee.isPresent()) {
            employeeDto = employeeMapper.employeeToDto(employee.get());
        } else {
            throw new CustomException("No Employee Found");
        }
        return employeeDto;
    }

    public Employee updateEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.dtoToEmployee(employeeDto);
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);

    }
}
