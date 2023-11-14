package com.muratcimen.springboot.cruddemo.dao;

import com.muratcimen.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee finById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
