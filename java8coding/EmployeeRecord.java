package com.deepak.java8coding;

public class EmployeeRecord {
	private int id;
	private String name;
	private double salary;
	private int dept_id;

	// Constructor
	public EmployeeRecord(int id, String name, double salary, int dept_id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept_id = dept_id;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getDept_id() {
		return dept_id;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", dept_id=" + dept_id
				+ '}';
	}
}
