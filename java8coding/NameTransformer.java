package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameTransformer {

	/*
	 * Write code to find names starting with H from list and convert last letter in
	 * capital letter input ["Harsh", "Harry", "Jems"] --> ["HarsH", "HarrY"]
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Harsh", "Harry", "Jems");
		System.out.println("Harsh".length());

		List<String> result = names.stream().filter(name -> name.startsWith("H")).map(name -> {
			return name.substring(0, name.length() - 1) + Character.toUpperCase(name.charAt(name.length() - 1));
		}).collect(Collectors.toList());

		System.out.println(result); // Output: [HarsH, HarrY]
	}
}
