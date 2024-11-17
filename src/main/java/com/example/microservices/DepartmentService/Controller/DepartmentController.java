package com.example.microservices.DepartmentService.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.DepartmentService.Model.Department;

@RestController
@RequestMapping("/Department")
public class DepartmentController{

	private static final Logger log= LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentRepository dr;

	@GetMapping("/GetAllDept")
	public List<Department> findAll() {
		return dr.findAll();
	}
	
	@PostMapping("/Add")
	public Department addDepartment(@RequestBody Department department) {
        dr.addDepartment(department);
		return department;
    }
	@GetMapping("/get/{id}")
	public Department getDeptById(@PathVariable Long id) {
		return dr.findById(id);
	}
}
