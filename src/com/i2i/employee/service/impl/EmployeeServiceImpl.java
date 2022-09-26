package com.i2i.employee.service.impl;


import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.exception.CustomException;
import com.i2i.employee.model.Employee;
import com.i2i.employee.repo.EmployeeRepository;
import com.i2i.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private ModelMapper mapper;
    @Autowired
    public EmployeeRepository employeeRepository;
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = mapper.map(employeeDto, Employee.class);
        return employeeRepository.save(employee);
    }

    public List<EmployeeDto> getEmployees(){

        List<Employee> employees = (List<Employee>) employeeRepository.findAllByActive("active");

        if(employees.isEmpty()) {
            throw new CustomException("No Employee Found");
        }
        else {
            return
                    employees.stream()
                            .map(employee -> mapper.map(employee, EmployeeDto.class))
                            .collect(Collectors.toList());
        }
    }

    public EmployeeDto getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeDto employeeDto = null;
        if (employee.isPresent()) {
            employeeDto =  mapper.map(employee.get(), EmployeeDto.class);
        } else {
            throw new CustomException("No Employee Found");
        }
        return employeeDto;
    }



    public Employee updateEmployee(EmployeeDto employeeDto) {
        Employee employee = mapper.map(employeeDto, Employee.class);
        return employeeRepository.save(employee);
    }

    public boolean deleteEmployeeById(int id) {
        employeeRepository.deleteById(Integer.valueOf(id));
        return false;
    }
    }
