package com.java.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.management.entity.Employee;
import com.java.management.repo.EmployeeRepository;





@Service
public class EmployeeService implements EmpService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String addEmp(Employee employee) {

		empRepo.save(employee);
		// TODO Auto-generated method stub
		return "Success";
	}

	@Override
	public String updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);

		return null;
	}

	@Override
	public Optional<Employee> getEmpById(Integer id) {
		// TODO Auto-generated method stub

		return empRepo.findById(id);
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public String deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		return "delete success";
	}

}
