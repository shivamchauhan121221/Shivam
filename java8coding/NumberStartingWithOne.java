package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static List getNumbers(Integer[] arr) {
		return Arrays.asList(arr).stream().map(s -> s+"").filter(s->s.endsWith("8")).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		Integer[] n = { 10, 15, 8, 49, 25, 98, 32 };
		System.out.println(getNumbers(n));
	}

}
