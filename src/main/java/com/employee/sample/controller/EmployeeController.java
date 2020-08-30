package com.employee.sample.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.employee.sample.dto.EmployeeRequest;
import com.employee.sample.entity.Employee;
import com.employee.sample.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
		
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeRequest employeeRequest) {
		ModelMapper modelMapper = new ModelMapper();
		Employee employee = modelMapper.map(employeeRequest, Employee.class);
		employeeRepository.save(employee);
	}
	
	@RequestMapping(value = "/listEmployees", method = RequestMethod.GET)
	public List<Employee> listEmployees() {
		List<Employee> allEmployees = employeeRepository.findAll();
		return allEmployees;

	}

}
