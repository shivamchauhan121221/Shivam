package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFilter {

	public static List<Hierarchy> filterList(List<Hierarchy> list) {
		// Step 1: Filter current (active) employees
		List<Hierarchy> activeEmployees = list.stream().filter(e -> e.endDate == null).collect(Collectors.toList());

		// Step 2: Count how many employees report to each supervisor
		Map<Integer, Long> reporteeCountMap = activeEmployees.stream()
				.collect(Collectors.groupingBy(e -> e.supervisorId, Collectors.counting()));
		System.out.println(reporteeCountMap);

		// Step 3: Filter employees with grade >=10 and <5 active reportees
		return list.stream().filter(e -> e.empGrade >= 10).filter(e -> reporteeCountMap.getOrDefault(e.empId, 0L) < 5)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		List<Hierarchy> list = Arrays.asList(new Hierarchy(123, 10, 567, "25-Jan-2024", "30-Mar-2024"),
				new Hierarchy(567, 12, 111, "01-Sep-2010", null), new Hierarchy(111, 14, 100, "04-Nov-2023", null),
				new Hierarchy(555, 8, 567, "01-Jan-2024", null));
		System.out.println(filterList(list));
	}

}
