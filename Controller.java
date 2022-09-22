package com.example.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/base")
public class Controller {

    private static List<Employee> employees = new ArrayList<Employee>();

    @GetMapping
    public List<Employee> list(){
        return employees;

    }

    @PostMapping
    public List<Employee> addEmployees(@RequestBody Employee emp) {
        employees.add(emp);
        return employees;
    }
    
}



