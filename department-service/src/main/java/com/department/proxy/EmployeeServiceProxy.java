package com.department.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.department.proxy.dto.Employee;

@FeignClient(name = "EMPLOYEE-SERVICE", url = "localhost:9002")
public interface EmployeeServiceProxy {

	@GetMapping("/employee/get/all/{deptId}")
	public List<Employee> getAllEmpByDeptId(@PathVariable Long deptId);
}

