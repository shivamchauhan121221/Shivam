package com.deepak.java8coding;

import java.util.Arrays;

public class EvenNumber {

	public static int[] evenNumber(int[] arr) {
		return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
	}

	public static int[] evenNumber1(Integer[] arr) {

		return Arrays.stream(arr).filter(a -> a % 2 == 0).sorted().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		Integer[] arr2 = { 10, 15, 8, 49, 25, 98, 32 };
		int[] arr1 = evenNumber(arr);
		int[] arr3 = evenNumber1(arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("***********************");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
