package com.appsoft.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.appsoft.springproject.model.Department;
import com.appsoft.springproject.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/department")
	public String getDepartment() {
		
		return "DepartmentForm";
	}
	
	@PostMapping("/department")
	public String postDepartment(@ModelAttribute Department dept) {
		
		deptService.addDept(dept);
		return "DepartmentForm";
	}

}