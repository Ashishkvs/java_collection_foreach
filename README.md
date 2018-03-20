# java_collection_foreach


	EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.getAllEmpoyees();

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
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
