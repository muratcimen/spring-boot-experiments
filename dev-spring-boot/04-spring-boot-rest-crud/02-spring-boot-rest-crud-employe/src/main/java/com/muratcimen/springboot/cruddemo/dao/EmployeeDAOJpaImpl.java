package com.muratcimen.springboot.cruddemo.dao;

import com.muratcimen.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    //define field for entitymanager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        //execute query ad get result list
        List<Employee> employees = theQuery.getResultList();
        //return the results
        return employees;
    }

    @Override
    public Employee finById(int theId) {

        //get employee
        Employee employee = entityManager.find(Employee.class,theId);

        //return employee
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        //return the dbEmployee
        return theEmployee;
    }

    @Override
    public void deleteById(int theId) {

        //find employee by id
        Employee employee = entityManager.find(Employee.class,theId);

        //remove employee
        entityManager.remove(employee);
    }
}
