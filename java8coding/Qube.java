package com.deepak.java8coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Qube {

	public static void qube(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.stream().map(s -> s * s * s).filter(s -> s > 50).forEach(System.out::println);
	}

	public static Map wordCount(String[] arr) {

		List<String> list1 = Arrays.asList(arr);
		Map<String, Long> map = list1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map;
	}

//How to find only duplicate elements with its count from the String ArrayList in Java8?
	public static Map dublicateElementCount(String[] str) {
		List<String> ss=Arrays.asList(str);
		return ss.stream().filter(x->Collections.frequency(ss, x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

	public static Map findCountOfChar(String str) {
		Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		return map;
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 1, 2, 3 };
		qube(a);
		String[] str = { "AA", "BB", "AA", "CC", "XYZ", "AA" };
		System.out.println(wordCount(str));
		String s = "string data to count each character";
		System.out.println(findCountOfChar(s));
		System.out.println("*****************************");
		System.out.println(dublicateElementCount(str));
	}

}
