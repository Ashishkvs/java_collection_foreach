package com.imagegrafia.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.imagegrafia.model.Employee;

public class EmployeeService {
	public List<Employee> getAllEmpoyees() {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.addAll(Arrays.asList(
				new Employee("Ashish",100,50000.5d,10),
				new Employee("Raja",200,60000.5d,11),
				new Employee("Sanjeev",300,20000.5d,12),
				new Employee("Rintu",400,10000.5d,14)
				));
		
		return employeeList;
	}

}
