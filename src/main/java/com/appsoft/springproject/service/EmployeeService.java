package com.appsoft.springproject.service;

import java.util.List;

import com.appsoft.springproject.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);

	void deleteEmployee(long id);

	void updateEmployee(Employee emp);

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployee();

}
