package com.deepak.java8coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filtering {

	public static Map<Integer, Optional<EmployeeRecord>> groupedByDeptId(List<EmployeeRecord> employees) {
		// Sorting the employee list first by name then salary
		List<EmployeeRecord> sortedList = employees.stream()
				.sorted(Comparator.comparing(EmployeeRecord::getName).thenComparing(EmployeeRecord::getSalary))
				.collect(Collectors.toList());
		System.out.println("Sorting the employee list first by name then salary " + sortedList);
		// Filtering the sorted list where salary is greater than 100000 (1 lac)
		List<EmployeeRecord> filteredList = sortedList.stream().filter(s -> s.getSalary() > 100000)
				.collect(Collectors.toList());
		System.out.println("Filtering the sorted list where salary is greater than 100000 (1 lac) " + filteredList);

		// Grouping the filtered list by Department-ID and get highest salary employee
		// in each department
		return employees.stream().collect(Collectors.groupingBy(EmployeeRecord::getDept_id,
				Collectors.maxBy(Comparator.comparingDouble(EmployeeRecord::getSalary))));
	}

	public static void main(String[] args) {
		List<EmployeeRecord> employees = Arrays.asList(new EmployeeRecord(1, "John", 140000, 101),
				new EmployeeRecord(2, "Alice", 95000, 102), new EmployeeRecord(3, "Bob", 130000, 101),
				new EmployeeRecord(4, "Emma", 105000, 103), new EmployeeRecord(5, "Emma", 105001, 103),
				new EmployeeRecord(6, "David", 140000, 102), new EmployeeRecord(7, "Daved", 145000, 102));

		Map<Integer, Optional<EmployeeRecord>> result = groupedByDeptId(employees);
		// Printing the final result
		System.out.println("Final Result:");
		result.forEach((deptId, empList) -> {
			System.out.println("Department ID: " + deptId);
			System.out.println(empList);
		});
	}
}
