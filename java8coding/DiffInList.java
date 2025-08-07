package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DiffInList {

	public static List<Integer> listCheck(List<Integer> list1, List<Integer> list2) {
		return list1.stream().filter(e -> !list2.contains(e)) 
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(1, 2, 4);
		System.out.println(listCheck(list1, list2));
	}

}
