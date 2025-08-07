package com.deepak.java8coding;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class LastNonRepeatedChar {

	public static Character lastNonRepeated(String str) {

		// Step 1: Count character frequencies using LinkedHashMap to maintain order
		return str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).toList().getLast();

	}

	public static void main(String[] args) {
		String str = "asdjfkflghss";
		System.out.println(lastNonRepeated(str));

	}
}
