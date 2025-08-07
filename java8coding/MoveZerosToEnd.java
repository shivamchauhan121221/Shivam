package com.deepak.java8coding;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static int[] moveZero(int[] arr) {

		int index = 0; // Position to place the next non-zero element

		// Move non-zero elements to the front
		for (int num : arr) {
			if (num != 0) {
				arr[index] = num;
				++index;
			}
		}
		// Fill the rest with zeros
		while (index < arr.length) {
			arr[index] = 0;
			++index;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 0, 1, 0 };
		System.out.println(Arrays.toString(moveZero(arr)));
		Integer a = 1000;
		Integer b = 1000;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		Integer x = 100;
		Integer y = 100;
		System.out.println(x == y);
		System.out.println(x.equals(y));

	}
}
