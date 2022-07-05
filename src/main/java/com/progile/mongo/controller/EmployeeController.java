package com.progile.mongo.controller;

import com.progile.mongo.model.Employee;
import com.progile.mongo.repository.EmployeeRepository;
import com.progile.mongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }
}
