package com.deepak.java8coding;

import java.util.Arrays;

public class Elements {

	/* First Element in the Array */
	public static Integer firstElementInArray(int[] itr) {
		return Arrays.stream(itr).boxed().findFirst().get();
	}

	/* Total number of Elements in array */
	public static Long totalElement(int[] itr) {
		return Arrays.stream(itr).count();
	}

	/* Max Element in array */
	public static int maxValueInArray(int[] itr) {
		return Arrays.stream(itr).boxed().max(Integer::compare).get();
	}

	/* Mix Element in array */
	public static int minValueInArray(int[] itr) {
		return Arrays.stream(itr).boxed().min(Integer::compare).get();
	}

	/* Write a Program to find the Max element in an array? */
	public static int findMaxElement(int[] itr) {
		return Arrays.stream(itr).max().getAsInt();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		int[] arr1 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		System.out.println("First Element in the Array :: " + firstElementInArray(arr));
		System.out.println("*************************************************");
		System.out.println("Total number of Elements in array :: " + totalElement(arr));
		System.out.println("*************************************************");
		System.out.println("Max Element in array :: " + maxValueInArray(arr));
		System.out.println("*************************************************");
		System.out.println("Mix Element in array :: " + minValueInArray(arr));
		System.out.println("*****************************************");
		System.out.println("Max Element in integral Array :: " + findMaxElement(arr1));
	}

}
