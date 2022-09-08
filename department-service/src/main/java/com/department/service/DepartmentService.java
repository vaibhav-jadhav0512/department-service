package com.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.proxy.EmployeeServiceProxy;
import com.department.proxy.dto.Employee;
import com.department.repository.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo repo;

	@Autowired
	private EmployeeServiceProxy proxy;

	public Department saveDepartment(Department department) {
		return repo.save(department);
	}

	public List<Department> getAllDepartments() {
		return repo.findAll();
	}

	public Department getDepartmentById(Long id) {
		return repo.findByDepartmentId(id);
	}

	public Department updateDepartment(Department department, Long id) {
		return repo.save(department);
	}

	public void deleteDepartment(Long id) {
		repo.deleteById(id);
	}

	public List<Employee> getAllEmpByDeptId(Long deptId) {
		return proxy.getAllEmpByDeptId(deptId);
	}
}
