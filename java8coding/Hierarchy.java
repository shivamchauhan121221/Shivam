package com.deepak.java8coding;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Hierarchy {
	int empId;
	int empGrade;
	int supervisorId;
	LocalDate startDate;
	LocalDate endDate;

	public Hierarchy(int empId, int empGrade, int supervisorId, String startDate, String endDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
		this.empId = empId;
		this.empGrade = empGrade;
		this.supervisorId = supervisorId;
		this.startDate = LocalDate.parse(startDate, formatter);
		this.endDate = (endDate == null || endDate.trim().isEmpty()) ? null : LocalDate.parse(endDate, formatter);
	}

	@Override
	public String toString() {
		return "EmpID: " + empId + ", Grade: " + empGrade;
	}
}
