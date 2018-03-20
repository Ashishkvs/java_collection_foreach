package com.imagegrafia;

import java.util.Iterator;
import java.util.List;

import com.imagegrafia.model.Employee;
import com.imagegrafia.service.EmployeeService;

public class ForLoopDemo {

	public void normalForLoop() {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.getAllEmpoyees();

		/*for (Employee employee : employeeList) {
			System.out.println(employee);
		}*/

		/**
		 * for-each loop in Java uses the underlying iterator mechanism. So it's
		 * identical to the following:
		 */
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee.getId());
			System.out.println(employee);
		}

	}

}
