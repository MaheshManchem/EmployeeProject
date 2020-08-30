package com.employee.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.employee.sample.entity.Employee;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
