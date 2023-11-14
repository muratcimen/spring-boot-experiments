package com.muratcimen.springboot.cruddemo.service;

import com.muratcimen.springboot.cruddemo.dao.EmployeeDAO;
import com.muratcimen.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> finAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee finById(int theId) {
        return employeeDAO.finById(theId);
    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
