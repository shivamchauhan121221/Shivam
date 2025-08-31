package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFruits {

	public static Map<String, Long> countFruits(List<String> list) {
		return list.stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "banana", "apple", "orange", "banana", "apple");

		System.out.println("countFruit"+countFruits(list));
	}
}
