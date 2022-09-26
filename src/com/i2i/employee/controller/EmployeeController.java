package com.i2i.employee.controller;

import com.i2i.employee.dto.EmployeeDto;

import com.i2i.employee.model.Employee;
import com.i2i.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService ;

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }
    @Autowired
    public EmployeeController(EmployeeService employeeService){

        this.employeeService = employeeService;
    }

    @GetMapping("/getemployee")
    public List<EmployeeDto> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public  EmployeeDto getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    /*
     * Update trainee details
     * @param traineeDto
     */
    @PutMapping
    public Employee update(@RequestBody EmployeeDto employeeDto) {
        return employeeService.updateEmployee(employeeDto);
    }

    /*
     * Delete trainee details by id
     * @param id
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        if (employeeService.deleteEmployeeById(id)) {
            return "Deleted";
        } else {
            return "Try after sometimes";
        }
    }
}
