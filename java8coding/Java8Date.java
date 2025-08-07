package com.deepak.java8coding;

public class Java8Date {
	public static void main(String[] args) {
		System.out.println("Current Local Date: "+ java.time.LocalDate.now());
		System.out.println("Current Local Time: "+ java.time.LocalTime.now());
		System.out.println("Current Local Date & Time: "+ java.time.LocalDateTime.now());
	}

}
