package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DublicateElement {

	public static Integer[] dublicateElement1(Integer[] itr) {
		return Arrays.stream(itr).distinct().sorted().toArray(Integer[]::new);
	}

	public static List<Integer> dublicateElement2(Integer[] itr) {
		return Arrays.stream(itr).distinct().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		System.out.println("Unique Elements with Help of List with sorted Accending Order :: "
				+ Arrays.toString(dublicateElement1(arr)));
		System.out.println("******************************************");
		System.out
				.println("Unique Elements with Help of List with sorted Decending Order :: " + dublicateElement2(arr));

	}
}
