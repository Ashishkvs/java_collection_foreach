package com.imagegrafia.model;

public class Employee {

	private String name;
	private Integer id;
	private Double salary;
	private Integer deptId;
	
	
	public Employee() {
		
	}
	public Employee(String name, Integer id, Double salary, Integer deptId) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	
}
