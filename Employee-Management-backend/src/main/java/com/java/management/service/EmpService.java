package com.java.management.service;

import java.util.List;
import java.util.Optional;

import com.java.management.entity.Employee;

public interface EmpService {

	String addEmp(Employee employee);

	String updateEmp(Employee employee);

	Optional<Employee> getEmpById(Integer id);

	List<Employee> getAllEmp();

	String deleteEmp(Integer id);

}
