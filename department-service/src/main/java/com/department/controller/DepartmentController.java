package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.proxy.dto.Employee;
import com.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		return service.saveDepartment(department);
	}

	@GetMapping("/get/all")
	public List<Department> getAllDepartments() {
		return service.getAllDepartments();
	}

	@GetMapping("/get/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return service.getDepartmentById(id);
	}

	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long id) {
		return service.updateDepartment(department, id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		service.deleteDepartment(id);
	}

	@GetMapping("/get/employees/{deptId}")
	public List<Employee> getAllEmpByDeptId(@PathVariable Long deptId) {
		return service.getAllEmpByDeptId(deptId);
	}
}
