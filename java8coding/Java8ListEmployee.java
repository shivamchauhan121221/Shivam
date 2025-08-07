package com.deepak.java8coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ListEmployee {
//	Find out the count of male and female employees present in the organization?
	public static Map<String, Long> getCountOfMaleFemale(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	}

//Write a program to print the names of all departments in the organization.
	public static List<String> getDepartmentName(List<Employee> employeeList) {
		return employeeList.stream().map(Employee::getDepartment).distinct().toList();
	}

//Find the average age of Male and Female Employees.
	public static Map<String, Double> getGender(List<Employee> employeeList) {
		return employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
	}

//Get the Names of employees who joined after 2015.
	public static List<String> getEmployeeName(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).toList();
	}

//Count the number of employees in each department.
	public static Map<String, Long> getCountOfEmployees(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	}

//Find out the average salary of each department.
	public static Map<String, Double> averageSalaryEachDepartment(List<Employee> employeeList) {
		return employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	}

//Find out the oldest employee, his/her age and department?
	public static void oldestEmployee(List<Employee> employeeList) {
		Employee result = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Name : " + result.getName());
		System.out.println("Age : " + result.getAge());
		System.out.println("Department : " + result.getDepartment());
	}

//Find out the average and total salary of the organization.
	public static void averageAndTotalSalary(List<Employee> employeeList) {
		DoubleSummaryStatistics empSummary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average : " + empSummary.getAverage());
		System.out.println("Total : " + empSummary.getSum());
		System.out.println("Max : " + empSummary.getMax());
		System.out.println("Min : " + empSummary.getMin());
		System.out.println("Count : " + empSummary.getCount());

	}

//List down the employees name of each department.
	public static Map<String, List<String>> employeeListOfEachDepart(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));

	}

//Find out the highest experienced employees in the organization
	public static String seniorEmp(List<Employee> employeeList) {
		return employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).map(Employee::getName)
				.findFirst().get();
	}

//How to find employees name starting with alphabet A
	public static List<Employee> employeesStartingWithA(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
	}

//Sort employee name and salary using
	public static List<Employee> employeesSorted(List<Employee> employeeList) {
		return employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());
	}

//Sort Employee based on gender and age is above 30 using
	public static List<Employee> employeeSorting(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Employee::getGender))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		System.out.println("**** Find out the count of male and female employees present in the organization?");
		System.out.println(getCountOfMaleFemale(employeeList));
		System.out.println("**** Write a program to print the names of all departments in the organization.");
		System.out.println(getDepartmentName(employeeList));
		System.out.println("**** Find the average age of Male and Female Employees.");
		System.out.println(getGender(employeeList));
		System.out.println("**** Get the Names of employees who joined after 2015.");
		System.out.println(getEmployeeName(employeeList));

		System.out.println("**** Count the number of employees in each department.");
		System.out.println(getCountOfEmployees(employeeList));

		System.out.println("**** Find out the average salary of each department.");
		System.out.println(averageSalaryEachDepartment(employeeList));

		System.out.println("**** Find out the oldest employee, his/her age and department?");
		oldestEmployee(employeeList);

		System.out.println("Find out the average and total salary of the organization.");
		averageAndTotalSalary(employeeList);

		System.out.println("List down the employees Name of each department.");
		System.out.println(employeeListOfEachDepart(employeeList));

		System.out.println("********** Find out the highest experienced employees in the organization ***********");
		System.out.println(seniorEmp(employeeList));

		System.out.println("How to find employees name starting with alphabet A");
		System.out.println(employeesStartingWithA(employeeList));

		System.out.println("Sort employee name and salary using");
		System.out.println(employeesSorted(employeeList));

		System.out.println("Sort Employee based on gender and age is above 30 using");
		System.out.println(employeeSorting(employeeList));

	}

}
