package com.appsoft.springproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.springproject.model.Employee;
import com.appsoft.springproject.repository.EmployeeRepository;
import com.appsoft.springproject.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements  EmployeeService{
	
	@Autowired
	private EmployeeRepository  empRepo;

	@Override
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public void deleteEmployee(long id) {
		 empRepo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public Employee getEmployeeById(long id) {
	 
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		 
		return empRepo.findAll();
	}

}
