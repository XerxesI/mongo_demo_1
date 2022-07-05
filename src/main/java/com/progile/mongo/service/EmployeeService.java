package com.progile.mongo.service;

import com.progile.mongo.model.Employee;
import com.progile.mongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee emp) {
        return employeeRepository.insert(emp);
    }
}
