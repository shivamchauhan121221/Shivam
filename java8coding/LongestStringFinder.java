package com.deepak.java8coding;

import java.util.Arrays;

public class LongestStringFinder {

	public static String longestStringFinder(String[] str) {

		return Arrays.stream(str).max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse("Empty array");
		//// Fallback in case the array is empty
	}

	public static void main(String[] args) {
		String[] arr = { "java", "programmer", "Technology", "code", "coding" };
		System.out.println(longestStringFinder(arr));
	}
}
