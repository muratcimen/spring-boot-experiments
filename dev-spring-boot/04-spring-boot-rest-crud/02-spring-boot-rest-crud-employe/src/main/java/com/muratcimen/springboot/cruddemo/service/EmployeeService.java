package com.muratcimen.springboot.cruddemo.service;

import com.muratcimen.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> finAll();

    Employee finById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
