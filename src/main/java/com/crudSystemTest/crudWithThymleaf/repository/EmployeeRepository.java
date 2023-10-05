package com.crudSystemTest.crudWithThymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudSystemTest.crudWithThymleaf.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // return all the Employees ordering by Asecding Last Name
    public List<Employee> findAllByOrderByLastNameAsc();
}
