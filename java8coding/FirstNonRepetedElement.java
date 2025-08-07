package com.deepak.java8coding;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetedElement {

	public static Character firstNonRepeatedChar(String str) {
		return str.replace(" ", "").chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
	}

	public static Character firstRepeatedChar(String input) {

		return input.replace(" ", "").chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();

	}

	public static void main(String[] args) {
		String input = " Java articles are Awesome";
		System.out.println(firstNonRepeatedChar(input));
		System.out.println(firstRepeatedChar(input));
	}
}
