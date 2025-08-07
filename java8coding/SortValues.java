package com.deepak.java8coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortValues {

	public static Stream sortValues(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		return list.stream().sorted(Collections.reverseOrder());
	}

	public static boolean dublicateEntry(int[] arr1) {
		Boolean check = true;
		List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		HashSet set = new HashSet<>(list);
		if (set.size() == list.size())
			check = false;
		return check;
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		int[] arr1 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		sortValues(arr).forEach(System.out::println);
		System.out.println("Dublicate is :: " + dublicateEntry(arr1));

	}

}
