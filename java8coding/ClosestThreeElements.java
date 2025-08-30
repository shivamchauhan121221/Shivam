package com.deepak.java8coding;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestThreeElements {

	public static int[] findThreeClosest(int[] arr, int target) {
		return Arrays.stream(arr).filter(num -> num != target) // Exclude the target
				.boxed() // Convert int to Integer
				.sorted(Comparator.comparing(a -> Math.abs(a - target))) // Sort by closeness to target
				.limit(3) // Take the first 3 closest
				.mapToInt(Integer::intValue) // Convert back to int[]
				 .toArray();
	}

	public static void main(String[] args) {
		int[] arr = { 25, 5, 10, 15, 7, 3, 2, 1, 30 };
		int target = 7;
		System.out.println(Arrays.toString(findThreeClosest(arr, target)));
	}
}
