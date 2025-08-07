package com.deepak.java8coding;

import java.util.Arrays;

public class FindIndex {

	public static String binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		arr = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(arr));

		// Classic binary search loop
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return "Index of " + target + " is " + mid; // Found
			} else if (arr[mid] < target) {
				left = mid + 1; // Look right
			} else {
				right = mid - 1; // Look left
			}
		}

		return "Index of " + target + " is not found"; // Not found
	}

	public static void main(String[] args) {
		int[] arr = { 1, 11, 20, 4, 7, 8, 10, 3, 15 };
		int target = 10;

		System.out.println(binarySearch(arr, target));
	}
}
