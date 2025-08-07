package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {

	public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
		return Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 45, 5);
		List<Integer> list2 = Arrays.asList(1, 5, 3, 49, 5);
		System.out.println(mergeLists(list1, list2));
	}
}
